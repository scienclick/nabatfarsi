package com.nabatfarsi;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.widget.Toast;

import com.anjlab.android.iab.v3.BillingProcessor;
import com.anjlab.android.iab.v3.TransactionDetails;
import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.nabatfarsi.config.GameConfig;


public class AndroidLauncher extends AndroidApplication implements GameEventListener,
        BillingProcessor.IBillingHandler {
    nabatfarsi game;
    static final String SKU_PREMIUM = "nabatfarsi4mykids";
//        static final String SKU_PREMIUM = "android.test.purchased";

    BillingProcessor bp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //--2

        bp = new BillingProcessor(this, GameConfig.PLAY_ENCODED_PUBLIC_KEY, this);

        AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
        game = new nabatfarsi(this);
        initialize(game, config);

        //--3
        //game.setISPURCHASED(true);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!bp.handleActivityResult(requestCode, resultCode, data)) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (bp != null) {
            bp.release();
        }
    }


    @Override
    public void InitiateIAP() {
        this.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(AndroidLauncher.this, "در حال برقراری ارتباط... ",
                        Toast.LENGTH_LONG).show();

            }
        });
//        if (!game.ISPURCHASED()) {
////            bp = new BillingProcessor(this, GameConfig.PLAY_ENCODED_PUBLIC_KEY, this);
//        }

        try {
            bp.purchase(AndroidLauncher.this, SKU_PREMIUM);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "bp.purchase " + e.getMessage(),
                    Toast.LENGTH_LONG).show();
        }

    }


    @Override
    public void onProductPurchased(@NonNull String productId, @Nullable TransactionDetails details) {
        game.setISPURCHASED(true);

        this.runOnUiThread(new Runnable() {
            public void run() {
                Toast.makeText(AndroidLauncher.this, "ارتقا به نسخه کامل با موفقیت انجام شد ",
                        Toast.LENGTH_LONG).show();

            }
        });
        game.setUpdatemenueActorRequested(true);
        if (bp != null) {
            bp.release();
        }
    }

    @Override
    public void onPurchaseHistoryRestored() {

    }

    @Override
    public void onBillingError(int errorCode, @Nullable Throwable error) {
        Toast.makeText(this, "دریافت خطا ",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBillingInitialized() {
    }


}