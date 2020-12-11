package org.xtexthheinle.uno.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUnoLexer extends Lexer {
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalMyUnoLexer() {;} 
    public InternalMyUnoLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMyUnoLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMyUno.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:11:7: ( 'nom_variante' )
            // InternalMyUno.g:11:9: 'nom_variante'
            {
            match("nom_variante"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:12:7: ( '{' )
            // InternalMyUno.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:13:7: ( '}' )
            // InternalMyUno.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:14:7: ( 'Depart' )
            // InternalMyUno.g:14:9: 'Depart'
            {
            match("Depart"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:15:7: ( ':' )
            // InternalMyUno.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:16:7: ( 'riviere' )
            // InternalMyUno.g:16:9: 'riviere'
            {
            match("riviere"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:17:7: ( 'temps_limite:' )
            // InternalMyUno.g:17:9: 'temps_limite:'
            {
            match("temps_limite:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:18:7: ( ';' )
            // InternalMyUno.g:18:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:19:7: ( 'etat_main' )
            // InternalMyUno.g:19:9: 'etat_main'
            {
            match("etat_main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:20:7: ( 'nb_mains' )
            // InternalMyUno.g:20:9: 'nb_mains'
            {
            match("nb_mains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:21:7: ( 'nb_cartes_main' )
            // InternalMyUno.g:21:9: 'nb_cartes_main'
            {
            match("nb_cartes_main"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:22:7: ( 'nb_talons' )
            // InternalMyUno.g:22:9: 'nb_talons'
            {
            match("nb_talons"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:23:7: ( 'Manche' )
            // InternalMyUno.g:23:9: 'Manche'
            {
            match("Manche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:24:7: ( 'Inversion' )
            // InternalMyUno.g:24:9: 'Inversion'
            {
            match("Inversion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:25:7: ( '(' )
            // InternalMyUno.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:26:7: ( ')' )
            // InternalMyUno.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:27:7: ( 'Tourner_mains' )
            // InternalMyUno.g:27:9: 'Tourner_mains'
            {
            match("Tourner_mains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:28:7: ( 'Nb_cartes_jouables' )
            // InternalMyUno.g:28:9: 'Nb_cartes_jouables'
            {
            match("Nb_cartes_jouables"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:29:7: ( 'Cartes_1_a_9' )
            // InternalMyUno.g:29:9: 'Cartes_1_a_9'
            {
            match("Cartes_1_a_9"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:30:7: ( 'Cumul' )
            // InternalMyUno.g:30:9: 'Cumul'
            {
            match("Cumul"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:31:7: ( 'Contestations' )
            // InternalMyUno.g:31:9: 'Contestations'
            {
            match("Contestations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:32:7: ( 'avec_carte_inversion' )
            // InternalMyUno.g:32:9: 'avec_carte_inversion'
            {
            match("avec_carte_inversion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:33:7: ( 'avec_carte_sept' )
            // InternalMyUno.g:33:9: 'avec_carte_sept'
            {
            match("avec_carte_sept"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:34:7: ( 'avec_carte_zero' )
            // InternalMyUno.g:34:9: 'avec_carte_zero'
            {
            match("avec_carte_zero"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:35:7: ( 'avec_carte_uno' )
            // InternalMyUno.g:35:9: 'avec_carte_uno'
            {
            match("avec_carte_uno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:36:7: ( 'suites' )
            // InternalMyUno.g:36:9: 'suites'
            {
            match("suites"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:37:7: ( 'suites_royales' )
            // InternalMyUno.g:37:9: 'suites_royales'
            {
            match("suites_royales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:38:7: ( 'interception' )
            // InternalMyUno.g:38:9: 'interception'
            {
            match("interception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:39:7: ( 'Pioche' )
            // InternalMyUno.g:39:9: 'Pioche'
            {
            match("Pioche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:40:7: ( 'nb_cartes_a_piocher:' )
            // InternalMyUno.g:40:9: 'nb_cartes_a_piocher:'
            {
            match("nb_cartes_a_piocher:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:41:7: ( 'jouer_apres_pioche:' )
            // InternalMyUno.g:41:9: 'jouer_apres_pioche:'
            {
            match("jouer_apres_pioche:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:42:7: ( 'cumul_plus_2' )
            // InternalMyUno.g:42:9: 'cumul_plus_2'
            {
            match("cumul_plus_2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:43:7: ( 'cumul_plus_4' )
            // InternalMyUno.g:43:9: 'cumul_plus_4'
            {
            match("cumul_plus_4"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:44:7: ( 'cumul_carte_couleur' )
            // InternalMyUno.g:44:9: 'cumul_carte_couleur'
            {
            match("cumul_carte_couleur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:45:7: ( 'cumul_carte_uno' )
            // InternalMyUno.g:45:9: 'cumul_carte_uno'
            {
            match("cumul_carte_uno"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:46:7: ( 'inter_contestable' )
            // InternalMyUno.g:46:9: 'inter_contestable'
            {
            match("inter_contestable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:47:7: ( 'plus4_contestable' )
            // InternalMyUno.g:47:9: 'plus4_contestable'
            {
            match("plus4_contestable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:48:7: ( 'Fin_manche' )
            // InternalMyUno.g:48:9: 'Fin_manche'
            {
            match("Fin_manche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:49:7: ( 'dire_uno_obligatoire' )
            // InternalMyUno.g:49:9: 'dire_uno_obligatoire'
            {
            match("dire_uno_obligatoire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:50:7: ( 'Points_manche' )
            // InternalMyUno.g:50:9: 'Points_manche'
            {
            match("Points_manche"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:51:7: ( 'vainqueur_manche:' )
            // InternalMyUno.g:51:9: 'vainqueur_manche:'
            {
            match("vainqueur_manche:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:52:7: ( 'perdants_manche:' )
            // InternalMyUno.g:52:9: 'perdants_manche:'
            {
            match("perdants_manche:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:53:7: ( 'pm_zero_pts' )
            // InternalMyUno.g:53:9: 'pm_zero_pts'
            {
            match("pm_zero_pts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:54:7: ( 'pm_pts_selon_cartes_restantes' )
            // InternalMyUno.g:54:9: 'pm_pts_selon_cartes_restantes'
            {
            match("pm_pts_selon_cartes_restantes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:55:7: ( 'elimination_si_500_pts' )
            // InternalMyUno.g:55:9: 'elimination_si_500_pts'
            {
            match("elimination_si_500_pts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:56:7: ( 'Fin_Partie' )
            // InternalMyUno.g:56:9: 'Fin_Partie'
            {
            match("Fin_Partie"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:57:7: ( 'vainqueur_total' )
            // InternalMyUno.g:57:9: 'vainqueur_total'
            {
            match("vainqueur_total"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:58:7: ( 'visible' )
            // InternalMyUno.g:58:9: 'visible'
            {
            match("visible"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:59:7: ( 'cachee' )
            // InternalMyUno.g:59:9: 'cachee'
            {
            match("cachee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:60:7: ( '1' )
            // InternalMyUno.g:60:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:61:7: ( '3' )
            // InternalMyUno.g:61:9: '3'
            {
            match('3'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:62:7: ( '7' )
            // InternalMyUno.g:62:9: '7'
            {
            match('7'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:63:7: ( '4' )
            // InternalMyUno.g:63:9: '4'
            {
            match('4'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:64:7: ( '5' )
            // InternalMyUno.g:64:9: '5'
            {
            match('5'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:65:7: ( 'une_par_une' )
            // InternalMyUno.g:65:9: 'une_par_une'
            {
            match("une_par_une"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:66:7: ( 'plusieurs_a_la_fois_autorise' )
            // InternalMyUno.g:66:9: 'plusieurs_a_la_fois_autorise'
            {
            match("plusieurs_a_la_fois_autorise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:67:7: ( 'mm_nb' )
            // InternalMyUno.g:67:9: 'mm_nb'
            {
            match("mm_nb"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:68:7: ( 'mm_couleur' )
            // InternalMyUno.g:68:9: 'mm_couleur'
            {
            match("mm_couleur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:69:7: ( 'mm_nb_couleur' )
            // InternalMyUno.g:69:9: 'mm_nb_couleur'
            {
            match("mm_nb_couleur"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:70:7: ( 'une_seule' )
            // InternalMyUno.g:70:9: 'une_seule'
            {
            match("une_seule"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:71:7: ( 'au_plus_trois' )
            // InternalMyUno.g:71:9: 'au_plus_trois'
            {
            match("au_plus_trois"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:72:7: ( 'droit_de_jouer' )
            // InternalMyUno.g:72:9: 'droit_de_jouer'
            {
            match("droit_de_jouer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:73:7: ( 'pas_droit_de_jouer' )
            // InternalMyUno.g:73:9: 'pas_droit_de_jouer'
            {
            match("pas_droit_de_jouer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:74:7: ( 'manche_gagnee' )
            // InternalMyUno.g:74:9: 'manche_gagnee'
            {
            match("manche_gagnee"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:75:7: ( 'vm_pts_selon_carte_adversaires' )
            // InternalMyUno.g:75:9: 'vm_pts_selon_carte_adversaires'
            {
            match("vm_pts_selon_carte_adversaires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:76:7: ( 'vm_zero_pts' )
            // InternalMyUno.g:76:9: 'vm_zero_pts'
            {
            match("vm_zero_pts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:77:7: ( 'score_le_plus_grd' )
            // InternalMyUno.g:77:9: 'score_le_plus_grd'
            {
            match("score_le_plus_grd"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:78:7: ( 'nb_manches_gagnees' )
            // InternalMyUno.g:78:9: 'nb_manches_gagnees'
            {
            match("nb_manches_gagnees"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:79:7: ( 'moins_de_500_pts' )
            // InternalMyUno.g:79:9: 'moins_de_500_pts'
            {
            match("moins_de_500_pts"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:80:7: ( 'score_le_plus_petit' )
            // InternalMyUno.g:80:9: 'score_le_plus_petit'
            {
            match("score_le_plus_petit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1831:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMyUno.g:1831:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMyUno.g:1831:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUno.g:1831:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMyUno.g:1831:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyUno.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1833:10: ( ( '0' .. '9' )+ )
            // InternalMyUno.g:1833:12: ( '0' .. '9' )+
            {
            // InternalMyUno.g:1833:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyUno.g:1833:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1835:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMyUno.g:1835:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMyUno.g:1835:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUno.g:1835:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMyUno.g:1835:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyUno.g:1835:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUno.g:1835:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1835:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMyUno.g:1835:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyUno.g:1835:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMyUno.g:1835:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1837:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMyUno.g:1837:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMyUno.g:1837:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyUno.g:1837:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1839:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMyUno.g:1839:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMyUno.g:1839:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyUno.g:1839:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMyUno.g:1839:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyUno.g:1839:41: ( '\\r' )? '\\n'
                    {
                    // InternalMyUno.g:1839:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMyUno.g:1839:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1841:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMyUno.g:1841:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMyUno.g:1841:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyUno.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMyUno.g:1843:16: ( . )
            // InternalMyUno.g:1843:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMyUno.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=77;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMyUno.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalMyUno.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalMyUno.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalMyUno.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalMyUno.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalMyUno.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalMyUno.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalMyUno.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalMyUno.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalMyUno.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalMyUno.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalMyUno.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalMyUno.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalMyUno.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalMyUno.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalMyUno.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalMyUno.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalMyUno.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalMyUno.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalMyUno.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalMyUno.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalMyUno.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalMyUno.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalMyUno.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalMyUno.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalMyUno.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalMyUno.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalMyUno.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalMyUno.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalMyUno.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalMyUno.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalMyUno.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // InternalMyUno.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // InternalMyUno.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // InternalMyUno.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // InternalMyUno.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // InternalMyUno.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // InternalMyUno.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // InternalMyUno.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // InternalMyUno.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // InternalMyUno.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // InternalMyUno.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // InternalMyUno.g:1:262: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // InternalMyUno.g:1:268: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // InternalMyUno.g:1:274: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // InternalMyUno.g:1:280: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // InternalMyUno.g:1:286: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // InternalMyUno.g:1:292: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // InternalMyUno.g:1:298: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // InternalMyUno.g:1:304: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // InternalMyUno.g:1:310: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // InternalMyUno.g:1:316: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // InternalMyUno.g:1:322: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // InternalMyUno.g:1:328: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // InternalMyUno.g:1:334: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // InternalMyUno.g:1:340: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // InternalMyUno.g:1:346: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // InternalMyUno.g:1:352: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // InternalMyUno.g:1:358: T__69
                {
                mT__69(); 

                }
                break;
            case 60 :
                // InternalMyUno.g:1:364: T__70
                {
                mT__70(); 

                }
                break;
            case 61 :
                // InternalMyUno.g:1:370: T__71
                {
                mT__71(); 

                }
                break;
            case 62 :
                // InternalMyUno.g:1:376: T__72
                {
                mT__72(); 

                }
                break;
            case 63 :
                // InternalMyUno.g:1:382: T__73
                {
                mT__73(); 

                }
                break;
            case 64 :
                // InternalMyUno.g:1:388: T__74
                {
                mT__74(); 

                }
                break;
            case 65 :
                // InternalMyUno.g:1:394: T__75
                {
                mT__75(); 

                }
                break;
            case 66 :
                // InternalMyUno.g:1:400: T__76
                {
                mT__76(); 

                }
                break;
            case 67 :
                // InternalMyUno.g:1:406: T__77
                {
                mT__77(); 

                }
                break;
            case 68 :
                // InternalMyUno.g:1:412: T__78
                {
                mT__78(); 

                }
                break;
            case 69 :
                // InternalMyUno.g:1:418: T__79
                {
                mT__79(); 

                }
                break;
            case 70 :
                // InternalMyUno.g:1:424: T__80
                {
                mT__80(); 

                }
                break;
            case 71 :
                // InternalMyUno.g:1:430: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 72 :
                // InternalMyUno.g:1:438: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 73 :
                // InternalMyUno.g:1:447: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 74 :
                // InternalMyUno.g:1:459: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 75 :
                // InternalMyUno.g:1:475: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 76 :
                // InternalMyUno.g:1:491: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 77 :
                // InternalMyUno.g:1:499: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\54\2\uffff\1\54\1\uffff\2\54\1\uffff\3\54\2\uffff\15\54\1\123\1\125\1\126\1\127\1\130\2\54\1\51\2\uffff\3\51\2\uffff\2\54\3\uffff\1\54\1\uffff\2\54\1\uffff\4\54\2\uffff\31\54\6\uffff\4\54\4\uffff\137\54\1\u00ef\33\54\1\u010d\10\54\1\u0116\4\54\1\u011b\4\54\1\uffff\3\54\1\u0124\3\54\1\u0128\3\54\1\u012d\21\54\1\uffff\10\54\1\uffff\1\u0147\3\54\1\uffff\10\54\1\uffff\3\54\1\uffff\4\54\1\uffff\13\54\1\u0165\11\54\1\u016f\3\54\1\uffff\35\54\1\uffff\11\54\1\uffff\2\54\1\u019b\1\54\1\u019d\1\54\1\u019f\34\54\1\u01bc\7\54\1\uffff\1\54\1\uffff\1\54\1\uffff\24\54\1\u01db\1\u01dc\6\54\1\uffff\1\54\1\u01e5\31\54\1\u0203\2\54\2\uffff\5\54\1\u020b\1\u020c\1\54\1\uffff\2\54\1\u0210\7\54\1\u0218\10\54\1\u0221\3\54\1\u0225\1\u0226\4\54\1\uffff\7\54\2\uffff\3\54\1\uffff\3\54\1\uffff\1\54\1\u023a\1\54\1\uffff\1\u023c\4\54\1\u0241\2\54\1\uffff\1\54\1\u0245\1\54\2\uffff\14\54\1\u0253\1\u0254\2\54\1\u0257\2\54\1\uffff\1\54\1\uffff\3\54\1\u025e\1\uffff\1\u025f\2\54\1\uffff\11\54\1\u026c\3\54\2\uffff\2\54\1\uffff\4\54\1\u0276\1\u0277\2\uffff\5\54\1\u027d\6\54\1\uffff\1\54\1\u0285\7\54\2\uffff\5\54\1\uffff\2\54\1\uffff\4\54\1\uffff\1\54\1\u0299\5\54\1\u029f\1\54\1\u02a1\2\54\1\u02a4\4\54\1\uffff\1\54\1\uffff\1\u02aa\2\54\1\u02ad\1\54\1\uffff\1\54\1\uffff\2\54\1\uffff\2\54\1\u02b4\2\54\1\uffff\2\54\1\uffff\1\54\1\u02ba\1\uffff\1\u02bb\2\54\1\uffff\2\54\1\uffff\1\54\1\u02c1\2\uffff\2\54\1\u02c4\2\54\1\uffff\2\54\1\uffff\1\54\1\u02ca\3\54\1\uffff\17\54\1\u02dd\2\54\1\uffff\1\u02e0\1\54\1\uffff\1\u02e2\1\uffff";
    static final String DFA12_eofS =
        "\u02e3\uffff";
    static final String DFA12_minS =
        "\1\0\1\142\2\uffff\1\145\1\uffff\1\151\1\145\1\uffff\1\154\1\141\1\156\2\uffff\1\157\1\142\1\141\1\165\1\143\1\156\1\151\1\157\2\141\2\151\1\141\5\60\1\156\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\155\1\137\3\uffff\1\160\1\uffff\1\166\1\155\1\uffff\1\141\1\151\1\156\1\166\2\uffff\1\165\1\137\1\162\1\155\1\156\1\145\1\137\1\151\1\157\1\164\1\157\1\151\1\165\1\155\1\143\1\165\1\162\1\137\1\163\1\156\1\162\1\157\1\151\1\163\1\137\6\uffff\1\145\1\137\1\156\1\151\4\uffff\1\137\1\143\1\141\1\151\1\160\1\164\1\155\1\143\1\145\1\162\1\143\1\164\1\165\1\164\1\143\1\160\1\164\1\162\1\145\1\143\1\156\1\145\1\165\1\150\1\163\1\144\1\160\2\137\1\145\1\151\1\156\1\151\1\160\1\137\2\143\1\156\1\166\3\141\1\162\1\145\1\163\1\137\1\151\1\150\1\162\1\156\1\141\1\145\1\154\1\145\1\137\1\154\2\145\1\162\1\150\1\164\1\162\1\154\1\145\1\64\1\141\1\145\1\164\1\144\1\120\1\137\1\164\1\161\1\142\1\164\1\145\1\160\1\142\1\157\1\150\1\163\1\141\1\151\1\162\1\154\1\164\1\162\1\137\1\155\1\156\1\145\1\163\1\145\1\162\1\163\1\60\1\163\1\143\1\165\1\163\2\137\1\145\1\163\2\137\1\145\1\137\1\145\1\156\1\162\1\163\1\162\2\141\1\165\1\137\1\165\1\154\1\163\1\162\1\141\1\145\1\60\1\165\1\145\1\137\1\162\1\156\1\143\1\164\1\157\1\60\1\145\1\154\2\141\1\60\1\151\1\162\1\164\1\137\1\uffff\1\164\1\141\1\163\1\60\1\154\1\145\1\143\1\60\1\137\1\141\1\143\1\60\1\143\1\165\1\164\1\157\1\137\1\157\1\156\1\162\1\156\1\144\2\145\1\137\1\157\1\162\1\165\1\143\1\uffff\1\154\1\137\1\144\1\151\1\163\1\150\1\145\1\156\1\uffff\1\60\2\151\1\164\1\uffff\1\157\1\137\1\145\1\61\1\141\1\162\1\137\1\162\1\uffff\1\145\1\160\1\157\1\uffff\1\155\1\160\1\154\1\141\1\uffff\1\157\1\162\1\163\1\137\1\163\1\151\1\143\1\164\1\157\1\145\1\165\1\60\1\163\2\137\1\154\1\157\1\145\1\147\1\145\1\141\1\60\1\145\2\163\1\uffff\1\155\1\156\1\151\1\156\1\155\1\163\1\137\3\164\1\157\1\137\1\164\1\156\1\141\1\162\1\165\1\162\1\156\1\163\1\137\1\160\1\145\1\164\1\150\1\151\2\137\1\162\1\uffff\1\145\1\160\1\165\1\145\2\165\1\141\1\137\1\156\1\uffff\1\163\1\137\1\60\1\151\1\60\1\157\1\60\1\141\1\137\1\141\1\151\1\145\1\162\1\171\1\160\1\151\1\164\1\156\1\145\1\163\2\164\1\137\1\155\1\164\1\154\1\137\2\145\1\157\1\152\1\137\1\154\1\164\1\156\1\60\1\154\1\162\1\147\1\65\1\164\1\137\1\141\1\uffff\1\164\1\uffff\1\156\1\uffff\1\151\1\152\1\137\1\157\1\137\1\157\1\141\1\154\1\157\1\145\1\143\1\163\1\137\2\145\2\141\1\163\1\157\1\144\2\60\1\142\1\157\1\155\1\157\1\163\1\145\1\uffff\1\145\1\60\1\156\1\60\1\145\1\147\1\141\1\137\1\145\1\137\1\156\1\157\1\71\1\156\2\151\1\154\1\165\1\156\1\163\1\150\1\137\1\62\1\137\1\163\1\137\1\156\1\60\1\156\1\145\2\uffff\1\154\1\165\1\141\1\157\1\156\2\60\1\165\1\uffff\1\145\2\60\1\141\1\151\1\160\1\72\2\163\1\165\1\60\1\163\1\156\2\145\1\156\1\163\1\145\1\163\1\60\1\164\1\145\1\160\2\60\1\143\1\164\1\154\1\143\1\uffff\2\137\1\151\1\145\1\156\1\164\1\137\2\uffff\1\162\1\145\1\137\1\uffff\1\147\1\156\1\151\1\uffff\1\151\1\60\1\141\1\uffff\1\60\1\166\1\160\1\162\1\157\1\60\1\163\1\137\1\uffff\1\141\1\60\1\151\2\uffff\1\157\1\156\2\141\1\150\1\143\1\152\1\147\1\162\1\143\1\141\1\143\2\60\1\160\1\156\1\60\1\157\1\137\1\uffff\1\142\1\uffff\1\145\1\164\1\157\1\60\1\uffff\1\60\1\147\1\142\1\uffff\1\157\1\165\1\157\1\142\1\137\1\145\1\141\1\157\1\141\1\60\1\150\1\154\1\141\2\uffff\1\164\1\145\1\uffff\1\143\1\65\1\154\1\162\2\60\2\uffff\1\162\1\145\1\154\1\143\1\154\1\60\1\154\1\146\1\72\1\162\1\165\1\164\1\uffff\1\145\1\60\1\162\1\163\1\145\1\150\1\60\1\145\1\163\2\uffff\1\144\1\164\1\145\1\150\1\145\1\uffff\1\145\1\157\1\uffff\1\164\1\145\1\157\1\72\1\uffff\1\164\1\60\1\163\1\145\1\60\1\163\1\151\1\60\1\151\1\60\1\145\1\165\1\60\1\151\1\145\1\162\1\151\1\uffff\1\145\1\uffff\1\60\1\162\1\137\1\60\1\157\1\uffff\1\164\1\uffff\1\72\1\162\1\uffff\2\163\1\60\1\162\1\137\1\uffff\1\72\1\160\1\uffff\1\156\1\60\1\uffff\1\60\2\137\1\uffff\1\145\1\141\1\uffff\1\164\1\60\2\uffff\1\141\1\162\1\60\1\144\1\163\1\uffff\1\165\1\145\1\uffff\1\166\1\60\1\164\1\163\1\145\1\uffff\1\157\1\164\2\162\1\141\1\163\1\151\1\156\1\141\1\163\1\164\1\151\2\145\1\162\1\60\1\163\1\145\1\uffff\1\60\1\163\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\157\2\uffff\1\145\1\uffff\1\151\1\145\1\uffff\1\164\1\141\1\156\2\uffff\1\157\1\142\1\165\1\166\1\165\1\156\2\157\1\165\1\155\1\151\1\162\1\155\5\71\1\156\1\157\1\172\2\uffff\2\uffff\1\57\2\uffff\1\155\1\137\3\uffff\1\160\1\uffff\1\166\1\155\1\uffff\1\141\1\151\1\156\1\166\2\uffff\1\165\1\137\1\162\1\155\1\156\1\145\1\137\1\151\1\157\1\164\1\157\1\151\1\165\1\155\1\143\1\165\1\162\1\137\1\163\1\156\1\162\1\157\1\151\1\163\1\137\6\uffff\1\145\1\137\1\156\1\151\4\uffff\1\137\1\164\1\141\1\151\1\160\1\164\1\155\1\143\1\145\1\162\1\143\1\164\1\165\1\164\1\143\1\160\1\164\1\162\1\145\1\143\1\156\1\145\1\165\1\150\1\163\1\144\1\172\2\137\1\145\1\151\1\156\1\151\1\172\1\137\1\156\1\143\1\156\1\166\3\141\1\162\1\145\1\163\1\137\1\151\1\150\1\162\1\156\1\141\1\145\1\154\1\145\1\137\1\154\2\145\1\162\1\150\1\164\1\162\1\154\1\145\1\151\1\141\1\145\1\164\1\144\1\155\1\137\1\164\1\161\1\142\1\164\1\145\1\163\1\142\1\157\1\150\1\163\1\141\1\156\1\162\1\154\1\164\1\162\1\137\1\155\1\156\1\145\1\163\1\145\1\162\1\163\1\172\1\163\1\143\1\165\1\163\1\137\1\143\1\145\1\163\2\137\1\145\1\137\1\145\1\156\1\162\1\163\1\162\2\141\1\165\1\137\1\165\1\154\1\163\1\162\1\141\1\145\1\172\1\165\1\145\1\137\1\162\1\156\1\143\1\164\1\157\1\172\1\145\1\154\2\141\1\172\1\151\1\162\1\164\1\137\1\uffff\1\164\1\141\1\163\1\172\1\154\1\145\1\143\1\172\1\137\1\141\1\160\1\172\1\143\1\165\1\164\1\157\1\137\1\157\1\156\1\162\1\156\1\144\2\145\1\137\1\157\1\162\1\165\1\143\1\uffff\1\154\1\137\1\144\1\151\1\163\1\150\1\145\1\156\1\uffff\1\172\2\151\1\164\1\uffff\1\157\1\137\1\145\1\61\1\141\1\162\1\137\1\162\1\uffff\1\145\1\160\1\157\1\uffff\1\155\1\160\1\154\1\141\1\uffff\1\157\1\162\1\163\1\137\1\163\1\151\1\143\1\164\1\157\1\145\1\165\1\172\1\163\2\137\1\154\1\157\1\145\1\147\1\145\1\141\1\172\1\145\2\163\1\uffff\1\155\1\156\1\151\1\156\1\155\1\163\1\137\3\164\1\157\1\137\1\164\1\156\1\141\1\162\1\165\1\162\1\156\1\163\1\137\1\160\1\145\1\164\1\150\1\151\2\137\1\162\1\uffff\1\145\1\160\1\165\1\145\2\165\1\141\1\137\1\156\1\uffff\1\163\1\137\1\172\1\151\1\172\1\157\1\172\1\141\1\137\1\141\1\151\1\145\1\162\1\171\1\160\1\151\1\164\1\156\1\145\1\163\2\164\1\137\1\155\1\164\1\154\1\137\2\145\1\157\1\152\1\137\1\154\1\164\1\156\1\172\1\154\1\162\1\147\1\65\1\164\1\137\1\155\1\uffff\1\164\1\uffff\1\156\1\uffff\1\151\1\152\1\137\1\157\1\137\1\157\1\141\1\154\1\157\1\145\1\143\1\163\1\137\2\145\2\141\1\163\1\157\1\144\2\172\1\142\1\157\1\164\1\157\1\163\1\145\1\uffff\1\145\1\172\1\156\1\60\1\145\1\147\1\141\1\137\1\145\1\137\1\156\1\157\1\71\1\156\1\172\1\151\1\154\1\165\1\156\1\163\1\150\1\137\1\64\1\137\1\163\1\137\1\156\1\172\1\156\1\145\2\uffff\1\154\1\165\1\141\1\157\1\156\2\172\1\165\1\uffff\1\145\1\60\1\172\1\141\1\151\1\160\1\72\2\163\1\165\1\172\1\163\1\156\2\145\1\156\1\163\1\145\1\163\1\172\1\164\1\145\1\160\2\172\1\165\1\164\1\154\1\143\1\uffff\2\137\1\151\1\145\1\156\1\164\1\137\2\uffff\1\162\1\145\1\137\1\uffff\1\147\1\156\1\151\1\uffff\1\151\1\172\1\141\1\uffff\1\172\1\166\1\160\1\162\1\157\1\172\1\163\1\137\1\uffff\1\141\1\172\1\151\2\uffff\1\157\1\156\2\141\1\150\1\143\1\152\1\147\1\162\1\143\1\141\1\143\2\172\1\160\1\156\1\172\1\157\1\137\1\uffff\1\142\1\uffff\1\145\1\164\1\157\1\172\1\uffff\1\172\1\160\1\142\1\uffff\1\157\1\165\1\157\1\142\1\137\1\145\1\141\1\157\1\141\1\172\1\150\1\154\1\141\2\uffff\1\164\1\145\1\uffff\1\143\1\65\1\154\1\162\2\172\2\uffff\1\162\1\145\1\154\1\143\1\154\1\172\1\154\1\146\1\72\1\162\1\165\1\164\1\uffff\1\145\1\172\1\162\1\163\1\145\1\150\1\60\1\145\1\163\2\uffff\1\144\1\164\1\145\1\150\1\145\1\uffff\1\145\1\157\1\uffff\1\164\1\145\1\157\1\72\1\uffff\1\164\1\172\1\163\1\145\1\60\1\163\1\151\1\172\1\151\1\172\1\145\1\165\1\172\1\151\1\145\1\162\1\151\1\uffff\1\145\1\uffff\1\172\1\162\1\137\1\172\1\157\1\uffff\1\164\1\uffff\1\72\1\162\1\uffff\2\163\1\172\1\162\1\137\1\uffff\1\72\1\160\1\uffff\1\156\1\172\1\uffff\1\172\2\137\1\uffff\1\145\1\141\1\uffff\1\164\1\172\2\uffff\1\141\1\162\1\172\1\144\1\163\1\uffff\1\165\1\145\1\uffff\1\166\1\172\1\164\1\163\1\145\1\uffff\1\157\1\164\2\162\1\141\1\163\1\151\1\156\1\141\1\163\1\164\1\151\2\145\1\162\1\172\1\163\1\145\1\uffff\1\172\1\163\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\2\uffff\1\10\3\uffff\1\17\1\20\25\uffff\1\107\1\110\3\uffff\1\114\1\115\2\uffff\1\107\1\2\1\3\1\uffff\1\5\2\uffff\1\10\4\uffff\1\17\1\20\31\uffff\1\62\1\110\1\63\1\64\1\65\1\66\4\uffff\1\111\1\112\1\113\1\114\u008e\uffff\1\24\35\uffff\1\71\10\uffff\1\4\4\uffff\1\15\10\uffff\1\32\3\uffff\1\35\4\uffff\1\61\31\uffff\1\6\35\uffff\1\60\11\uffff\1\12\53\uffff\1\14\1\uffff\1\11\1\uffff\1\16\34\uffff\1\74\36\uffff\1\46\1\56\10\uffff\1\72\35\uffff\1\53\7\uffff\1\102\1\67\3\uffff\1\1\3\uffff\1\7\3\uffff\1\23\10\uffff\1\34\3\uffff\1\40\1\41\23\uffff\1\21\1\uffff\1\25\4\uffff\1\75\3\uffff\1\50\15\uffff\1\73\1\100\2\uffff\1\13\6\uffff\1\31\1\33\14\uffff\1\76\11\uffff\1\27\1\30\5\uffff\1\43\2\uffff\1\52\4\uffff\1\57\21\uffff\1\51\1\uffff\1\105\5\uffff\1\103\1\uffff\1\44\2\uffff\1\45\5\uffff\1\104\2\uffff\1\22\2\uffff\1\37\3\uffff\1\77\2\uffff\1\36\2\uffff\1\106\1\42\5\uffff\1\26\2\uffff\1\47\5\uffff\1\55\22\uffff\1\70\2\uffff\1\54\1\uffff\1\101";
    static final String DFA12_specialS =
        "\1\0\44\uffff\1\1\1\2\u02bc\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\51\2\50\2\51\1\50\22\51\1\50\1\51\1\45\4\51\1\46\1\14\1\15\5\51\1\47\1\44\1\33\1\44\1\34\1\36\1\37\1\44\1\35\2\44\1\5\1\10\5\51\2\43\1\20\1\4\1\43\1\30\2\43\1\13\3\43\1\12\1\17\1\43\1\24\3\43\1\16\6\43\3\51\1\42\1\43\1\51\1\21\1\43\1\26\1\31\1\11\3\43\1\23\1\25\2\43\1\41\1\1\1\43\1\27\1\43\1\6\1\22\1\7\1\40\1\32\4\43\1\2\1\51\1\3\uff82\51",
            "\1\53\14\uffff\1\52",
            "",
            "",
            "\1\57",
            "",
            "\1\61",
            "\1\62",
            "",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\72",
            "\1\73",
            "\1\74\15\uffff\1\76\5\uffff\1\75",
            "\1\100\1\77",
            "\1\102\21\uffff\1\101",
            "\1\103",
            "\1\104\5\uffff\1\105",
            "\1\106",
            "\1\110\23\uffff\1\107",
            "\1\114\3\uffff\1\112\6\uffff\1\111\1\113",
            "\1\115",
            "\1\116\10\uffff\1\117",
            "\1\120\7\uffff\1\121\3\uffff\1\122",
            "\12\124",
            "\12\124",
            "\12\124",
            "\12\124",
            "\12\124",
            "\1\131",
            "\1\133\13\uffff\1\132\1\uffff\1\134",
            "\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\0\135",
            "\0\135",
            "\1\136\4\uffff\1\137",
            "",
            "",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "",
            "",
            "",
            "",
            "\1\u0087",
            "\1\u0089\11\uffff\1\u0088\6\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a4\11\uffff\1\u00a3",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab\11\uffff\1\u00ac",
            "\1\u00ad",
            "\1\u00af\12\uffff\1\u00ae",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc\64\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d3\34\uffff\1\u00d2",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\2\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1\4\uffff\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f6\3\uffff\1\u00f5",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\12\54\7\uffff\32\54\4\uffff\1\u010c\1\uffff\32\54",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "",
            "\1\u0120",
            "\1\u0121",
            "\1\u0122",
            "\12\54\7\uffff\32\54\4\uffff\1\u0123\1\uffff\32\54",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0129",
            "\1\u012a",
            "\1\u012c\14\uffff\1\u012b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u019e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c4\13\uffff\1\u01c3",
            "",
            "\1\u01c5",
            "",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df\6\uffff\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\u01e4",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\1\u01ee",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2\11\uffff\1\u01f3\1\uffff\1\u01f5\4\uffff\1\u01f4",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd\1\uffff\1\u01fe",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0204",
            "\1\u0205",
            "",
            "",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\1\u0209",
            "\1\u020a",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u020d",
            "",
            "\1\u020e",
            "\1\u020f",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0219",
            "\1\u021a",
            "\1\u021b",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0222",
            "\1\u0223",
            "\1\u0224",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0227\21\uffff\1\u0228",
            "\1\u0229",
            "\1\u022a",
            "\1\u022b",
            "",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "",
            "",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "",
            "\1\u0239",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u023b",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0242",
            "\1\u0243",
            "",
            "\1\u0244",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0246",
            "",
            "",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\1\u0252",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0255",
            "\1\u0256",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0258",
            "\1\u0259",
            "",
            "\1\u025a",
            "",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0260\10\uffff\1\u0261",
            "\1\u0262",
            "",
            "\1\u0263",
            "\1\u0264",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "",
            "",
            "\1\u0270",
            "\1\u0271",
            "",
            "\1\u0272",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u0278",
            "\1\u0279",
            "\1\u027a",
            "\1\u027b",
            "\1\u027c",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\1\u0283",
            "",
            "\1\u0284",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\1\u028b",
            "\1\u028c",
            "",
            "",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "",
            "\1\u0292",
            "\1\u0293",
            "",
            "\1\u0294",
            "\1\u0295",
            "\1\u0296",
            "\1\u0297",
            "",
            "\1\u0298",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02a0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02a2",
            "\1\u02a3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02a5",
            "\1\u02a6",
            "\1\u02a7",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02ab",
            "\1\u02ac",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02ae",
            "",
            "\1\u02af",
            "",
            "\1\u02b0",
            "\1\u02b1",
            "",
            "\1\u02b2",
            "\1\u02b3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02b5",
            "\1\u02b6",
            "",
            "\1\u02b7",
            "\1\u02b8",
            "",
            "\1\u02b9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02bc",
            "\1\u02bd",
            "",
            "\1\u02be",
            "\1\u02bf",
            "",
            "\1\u02c0",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "",
            "",
            "\1\u02c2",
            "\1\u02c3",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02c5",
            "\1\u02c6",
            "",
            "\1\u02c7",
            "\1\u02c8",
            "",
            "\1\u02c9",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02cd",
            "",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\1\u02d1",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\1\u02d5",
            "\1\u02d6",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02da",
            "\1\u02db",
            "\1\u02dc",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02de",
            "\1\u02df",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            "\1\u02e1",
            "",
            "\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='n') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='D') ) {s = 4;}

                        else if ( (LA12_0==':') ) {s = 5;}

                        else if ( (LA12_0=='r') ) {s = 6;}

                        else if ( (LA12_0=='t') ) {s = 7;}

                        else if ( (LA12_0==';') ) {s = 8;}

                        else if ( (LA12_0=='e') ) {s = 9;}

                        else if ( (LA12_0=='M') ) {s = 10;}

                        else if ( (LA12_0=='I') ) {s = 11;}

                        else if ( (LA12_0=='(') ) {s = 12;}

                        else if ( (LA12_0==')') ) {s = 13;}

                        else if ( (LA12_0=='T') ) {s = 14;}

                        else if ( (LA12_0=='N') ) {s = 15;}

                        else if ( (LA12_0=='C') ) {s = 16;}

                        else if ( (LA12_0=='a') ) {s = 17;}

                        else if ( (LA12_0=='s') ) {s = 18;}

                        else if ( (LA12_0=='i') ) {s = 19;}

                        else if ( (LA12_0=='P') ) {s = 20;}

                        else if ( (LA12_0=='j') ) {s = 21;}

                        else if ( (LA12_0=='c') ) {s = 22;}

                        else if ( (LA12_0=='p') ) {s = 23;}

                        else if ( (LA12_0=='F') ) {s = 24;}

                        else if ( (LA12_0=='d') ) {s = 25;}

                        else if ( (LA12_0=='v') ) {s = 26;}

                        else if ( (LA12_0=='1') ) {s = 27;}

                        else if ( (LA12_0=='3') ) {s = 28;}

                        else if ( (LA12_0=='7') ) {s = 29;}

                        else if ( (LA12_0=='4') ) {s = 30;}

                        else if ( (LA12_0=='5') ) {s = 31;}

                        else if ( (LA12_0=='u') ) {s = 32;}

                        else if ( (LA12_0=='m') ) {s = 33;}

                        else if ( (LA12_0=='^') ) {s = 34;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||LA12_0=='E'||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='L')||LA12_0=='O'||(LA12_0>='Q' && LA12_0<='S')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='k' && LA12_0<='l')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='w' && LA12_0<='z')) ) {s = 35;}

                        else if ( (LA12_0=='0'||LA12_0=='2'||LA12_0=='6'||(LA12_0>='8' && LA12_0<='9')) ) {s = 36;}

                        else if ( (LA12_0=='\"') ) {s = 37;}

                        else if ( (LA12_0=='\'') ) {s = 38;}

                        else if ( (LA12_0=='/') ) {s = 39;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 40;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='.')||(LA12_0>='<' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 41;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_37 = input.LA(1);

                        s = -1;
                        if ( ((LA12_37>='\u0000' && LA12_37<='\uFFFF')) ) {s = 93;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_38 = input.LA(1);

                        s = -1;
                        if ( ((LA12_38>='\u0000' && LA12_38<='\uFFFF')) ) {s = 93;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}