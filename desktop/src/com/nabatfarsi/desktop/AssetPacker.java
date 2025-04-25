package com.nabatfarsi.desktop;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

/**
 * Created by AShamsa on 12/1/2017.
 */

public class AssetPacker {
    private static final boolean DRAW_DEBUG_OUTLINE = false;

    private static final String RAW_ASSETS_PATH = "desktop/assets-raw";
    private static final String ASSETS_PATH = "android/assets";

    public static void main(String[] args) {
        TexturePacker.Settings settings = new TexturePacker.Settings();
        settings.debug = DRAW_DEBUG_OUTLINE;

        settings.maxWidth = 2048;
        settings.maxHeight = 2048;
/*
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/large",
                ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/large",
                "loadingpage"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/medium",
                ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/medium",
                "loadingpage"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/small",
                ASSETS_PATH + "/gameplay"+"/loadingpage"+ "/small",
                "loadingpage"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/general"+ "/small",
                ASSETS_PATH + "/gameplay"+"/general"+ "/small",
                "general"
        );
*/
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/general"+ "/medium",
                ASSETS_PATH + "/gameplay"+"/general"+ "/medium",
                "general"
        );
  /*
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/general"+ "/large",
                ASSETS_PATH + "/gameplay"+"/general"+ "/large",
                "general"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l1ab"+ "/small",
                ASSETS_PATH + "/gameplay"+"/l1ab"+ "/small",
                "l1ab"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l1ab" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l1ab" + "/medium",
                "l1ab"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l1ab" + "/large",
                ASSETS_PATH + "/gameplay" + "/l1ab" + "/large",
                "l1ab"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l2baran" + "/small",
                ASSETS_PATH + "/gameplay" + "/l2baran" + "/small",
                "l2baran"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l2baran" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l2baran" + "/medium",
                "l2baran"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l2baran" + "/large",
                ASSETS_PATH + "/gameplay" + "/l2baran" + "/large",
                "l2baran"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/small",
                ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/small",
                "l3parvaneh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/medium",
                "l3parvaneh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/large",
                ASSETS_PATH + "/gameplay" + "/l3parvaneh" + "/large",
                "l3parvaneh"
        );


        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l4toop" + "/small",
                ASSETS_PATH + "/gameplay" + "/l4toop" + "/small",
                "l4toop"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l4toop" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l4toop" + "/medium",
                "l4toop"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l4toop" + "/large",
                ASSETS_PATH + "/gameplay" + "/l4toop" + "/large",
                "l4toop"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/small",
                ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/small",
                "l5sanieh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/medium",
                "l5sanieh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/large",
                ASSETS_PATH + "/gameplay" + "/l5sanieh" + "/large",
                "l5sanieh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/small",
                ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/small",
                "l6jaroo"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/medium",
                "l6jaroo"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/large",
                ASSETS_PATH + "/gameplay" + "/l6jaroo" + "/large",
                "l6jaroo"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l7chtr" + "/small",
                ASSETS_PATH + "/gameplay" + "/l7chtr" + "/small",
                "l7chtr"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l7chtr" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l7chtr" + "/medium",
                "l7chtr"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l7chtr" + "/large",
                ASSETS_PATH + "/gameplay" + "/l7chtr" + "/large",
                "l7chtr");

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l8hobab" + "/small",
                ASSETS_PATH + "/gameplay" + "/l8hobab" + "/small",
                "l8hobab"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l8hobab" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l8hobab" + "/medium",
                "l8hobab"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l8hobab" + "/large",
                ASSETS_PATH + "/gameplay" + "/l8hobab" + "/large",
                "l8hobab"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/small",
                ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/small",
                "l9khorshid"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/medium",
                "l9khorshid"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/large",
                ASSETS_PATH + "/gameplay" + "/l9khorshid" + "/large",
                "l9khorshid"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l10drakht" + "/small",
                ASSETS_PATH + "/gameplay" + "/l10drakht" + "/small",
                "l10drakht"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l10drakht" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l10drakht" + "/medium",
                "l10drakht"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l10drakht" + "/large",
                ASSETS_PATH + "/gameplay" + "/l10drakht" + "/large",
                "l10drakht"
        );



        /////////////
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l11zrt" + "/small",
                ASSETS_PATH + "/gameplay" + "/l11zrt" + "/small",
                "l11zrt"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l11zrt" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l11zrt" + "/medium",
                "l11zrt"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l11zrt" + "/large",
                ASSETS_PATH + "/gameplay" + "/l11zrt" + "/large",
                "l11zrt"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/small",
                ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/small",
                "l12rooznameh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/medium",
                "l12rooznameh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/large",
                ASSETS_PATH + "/gameplay" + "/l12rooznameh" + "/large",
                "l12rooznameh"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/small",
                ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/small",
                "l13zanboor"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/medium",
                "l13zanboor"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/large",
                ASSETS_PATH + "/gameplay" + "/l13zanboor" + "/large",
                "l13zanboor"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l14jele" + "/small",
                ASSETS_PATH + "/gameplay" + "/l14jele" + "/small",
                "l14jele"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l14jele" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l14jele" + "/medium",
                "l14jele"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l14jele" + "/large",
                ASSETS_PATH + "/gameplay" + "/l14jele" + "/large",
                "l14jele"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l15sng" + "/small",
                ASSETS_PATH + "/gameplay" + "/l15sng" + "/small",
                "l15sng"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l15sng" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l15sng" + "/medium",
                "l15sng"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l15sng" + "/large",
                ASSETS_PATH + "/gameplay" + "/l15sng" + "/large",
                "l15sng"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/small",
                ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/small",
                "l16shalgrdn"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/medium",
                "l16shalgrdn"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/large",
                ASSETS_PATH + "/gameplay" + "/l16shalgrdn" + "/large",
                "l16shalgrdn"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l17saboon" + "/small",
                ASSETS_PATH + "/gameplay" + "/l17saboon" + "/small",
                "l17saboon"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l17saboon" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l17saboon" + "/medium",
                "l17saboon"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l17saboon" + "/large",
                ASSETS_PATH + "/gameplay" + "/l17saboon" + "/large",
                "l17saboon"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l18zabt" + "/small",
                ASSETS_PATH + "/gameplay" + "/l18zabt" + "/small",
                "l18zabt"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l18zabt" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l18zabt" + "/medium",
                "l18zabt"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l18zabt" + "/large",
                ASSETS_PATH + "/gameplay" + "/l18zabt" + "/large",
                "l18zabt"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l19tabl" + "/small",
                ASSETS_PATH + "/gameplay" + "/l19tabl" + "/small",
                "l19tabl"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l19tabl" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l19tabl" + "/medium",
                "l19tabl"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l19tabl" + "/large",
                ASSETS_PATH + "/gameplay" + "/l19tabl" + "/large",
                "l19tabl"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l20zarf" + "/small",
                ASSETS_PATH + "/gameplay" + "/l20zarf" + "/small",
                "l20zarf"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l20zarf" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l20zarf" + "/medium",
                "l20zarf"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l20zarf" + "/large",
                ASSETS_PATH + "/gameplay" + "/l20zarf" + "/large",
                "l20zarf"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l21einak" + "/small",
                ASSETS_PATH + "/gameplay" + "/l21einak" + "/small",
                "l21einak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l21einak" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l21einak" + "/medium",
                "l21einak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l21einak" + "/large",
                ASSETS_PATH + "/gameplay" + "/l21einak" + "/large",
                "l21einak"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/small",
                ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/small",
                "l22ghavas"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/medium",
                "l22ghavas"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/large",
                ASSETS_PATH + "/gameplay" + "/l22ghavas" + "/large",
                "l22ghavas"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/small",
                ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/small",
                "l23fanoos"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/medium",
                "l23fanoos"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/large",
                ASSETS_PATH + "/gameplay" + "/l23fanoos" + "/large",
                "l23fanoos"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/small",
                ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/small",
                "l24ghlm"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/medium",
                "l24ghlm"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/large",
                ASSETS_PATH + "/gameplay" + "/l24ghlm" + "/large",
                "l24ghlm"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l25kif" + "/small",
                ASSETS_PATH + "/gameplay" + "/l25kif" + "/small",
                "l25kif"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l25kif" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l25kif" + "/medium",
                "l25kif"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l25kif" + "/large",
                ASSETS_PATH + "/gameplay" + "/l25kif" + "/large",
                "l25kif"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l26goldan" + "/small",
                ASSETS_PATH + "/gameplay" + "/l26goldan" + "/small",
                "l26goldan"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l26goldan" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l26goldan" + "/medium",
                "l26goldan"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l26goldan" + "/large",
                ASSETS_PATH + "/gameplay" + "/l26goldan" + "/large",
                "l26goldan"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l27lenj" + "/small",
                ASSETS_PATH + "/gameplay" + "/l27lenj" + "/small",
                "l27lenj"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l27lenj" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l27lenj" + "/medium",
                "l27lenj"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l27lenj" + "/large",
                ASSETS_PATH + "/gameplay" + "/l27lenj" + "/large",
                "l27lenj"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/small",
                ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/small",
                "l28mooshak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/medium",
                "l28mooshak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/large",
                ASSETS_PATH + "/gameplay" + "/l28mooshak" + "/large",
                "l28mooshak"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/small",
                ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/small",
                "l29naghashi"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/medium",
                "l29naghashi"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/large",
                ASSETS_PATH + "/gameplay" + "/l29naghashi" + "/large",
                "l29naghashi"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/small",
                ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/small",
                "l30vazneh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/medium",
                "l30vazneh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/large",
                ASSETS_PATH + "/gameplay" + "/l30vazneh" + "/large",
                "l30vazneh"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/small",
                ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/small",
                "l31havapeima"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/medium",
                "l31havapeima"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/large",
                ASSETS_PATH + "/gameplay" + "/l31havapeima" + "/large",
                "l31havapeima"
        );

        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/small",
                ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/small",
                "l32ikhmak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/medium",
                ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/medium",
                "l32ikhmak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/large",
                ASSETS_PATH + "/gameplay" + "/l32ikhmak" + "/large",
                "l32ikhmak"
        );*/
////////////////

        /*TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l11zrt",
                ASSETS_PATH + "/gameplay"+"/l11zrt",
                "l11zrt"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l12rooznameh",
                ASSETS_PATH + "/gameplay"+"/l12rooznameh",
                "l12rooznameh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l13zanboor",
                ASSETS_PATH + "/gameplay"+"/l13zanboor",
                "l13zanboor"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l14jele",
                ASSETS_PATH + "/gameplay"+"/l14jele",
                "l14jele"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l15sng",
                ASSETS_PATH + "/gameplay"+"/l15sng",
                "l15sng"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l16shalgrdn",
                ASSETS_PATH + "/gameplay"+"/l16shalgrdn",
                "l16shalgrdn"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l17saboon",
                ASSETS_PATH + "/gameplay"+"/l17saboon",
                "l17saboon"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l18zabt",
                ASSETS_PATH + "/gameplay"+"/l18zabt",
                "l18zabt"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l19tabl",
                ASSETS_PATH + "/gameplay"+"/l19tabl",
                "l19tabl"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l20zarf",
                ASSETS_PATH + "/gameplay"+"/l20zarf",
                "l20zarf"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l21einak",
                ASSETS_PATH + "/gameplay"+"/l21einak",
                "l21einak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l22ghavas",
                ASSETS_PATH + "/gameplay"+"/l22ghavas",
                "l22ghavas"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l23fanoos",
                ASSETS_PATH + "/gameplay"+"/l23fanoos",
                "l23fanoos"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l24ghlm",
                ASSETS_PATH + "/gameplay"+"/l24ghlm",
                "l24ghlm"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l25kif",
                ASSETS_PATH + "/gameplay"+"/l25kif",
                "l25kif"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l26goldan",
                ASSETS_PATH + "/gameplay"+"/l26goldan",
                "l26goldan"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l27lenj",
                ASSETS_PATH + "/gameplay"+"/l27lenj",
                "l27lenj"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l28mooshak",
                ASSETS_PATH + "/gameplay"+"/l28mooshak",
                "l28mooshak"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l29naghashi",
                ASSETS_PATH + "/gameplay"+"/l29naghashi",
                "l29naghashi"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l30vazneh",
                ASSETS_PATH + "/gameplay"+"/l30vazneh",
                "l30vazneh"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l31havapeima",
                ASSETS_PATH + "/gameplay"+"/l31havapeima",
                "l31havapeima"
        );
        TexturePacker.process(settings,
                RAW_ASSETS_PATH + "/gameplay"+"/l32ikhmak",
                ASSETS_PATH + "/gameplay"+"/l32ikhmak",
                "l32ikhmak"
        );*/


    }
}
