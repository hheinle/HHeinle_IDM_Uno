package org.xtexthheinle.uno.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtexthheinle.uno.services.MyUnoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUnoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'nom_variante'", "'{'", "'}'", "'Depart'", "':'", "'riviere'", "'temps_limite:'", "';'", "'etat_main'", "'nb_mains'", "'nb_cartes_main'", "'nb_talons'", "'Manche'", "'Inversion'", "'('", "')'", "'Tourner_mains'", "'Nb_cartes_jouables'", "'Cartes_1_a_9'", "'Cumul'", "'Contestations'", "'avec_carte_inversion'", "'avec_carte_sept'", "'avec_carte_zero'", "'avec_carte_uno'", "'suites'", "'suites_royales'", "'interception'", "'Pioche'", "'nb_cartes_a_piocher:'", "'jouer_apres_pioche:'", "'cumul_plus_2'", "'cumul_plus_4'", "'cumul_carte_couleur'", "'cumul_carte_uno'", "'inter_contestable'", "'plus4_contestable'", "'Fin_manche'", "'dire_uno_obligatoire'", "'Points_manche'", "'vainqueur_manche:'", "'perdants_manche:'", "'pm_zero_pts'", "'pm_pts_selon_cartes_restantes'", "'elimination_si_500_pts'", "'Fin_Partie'", "'vainqueur_total'", "'visible'", "'cachee'", "'1'", "'3'", "'7'", "'4'", "'5'", "'une_par_une'", "'plusieurs_a_la_fois_autorise'", "'mm_nb'", "'mm_couleur'", "'mm_nb_couleur'", "'une_seule'", "'au_plus_trois'", "'droit_de_jouer'", "'pas_droit_de_jouer'", "'manche_gagnee'", "'vm_pts_selon_carte_adversaires'", "'vm_zero_pts'", "'score_le_plus_grd'", "'nb_manches_gagnees'", "'moins_de_500_pts'", "'score_le_plus_petit'"
    };
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


        public InternalMyUnoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyUnoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyUnoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyUno.g"; }



     	private MyUnoGrammarAccess grammarAccess;

        public InternalMyUnoParser(TokenStream input, MyUnoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Variante_UNO";
       	}

       	@Override
       	protected MyUnoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVariante_UNO"
    // InternalMyUno.g:65:1: entryRuleVariante_UNO returns [EObject current=null] : iv_ruleVariante_UNO= ruleVariante_UNO EOF ;
    public final EObject entryRuleVariante_UNO() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariante_UNO = null;


        try {
            // InternalMyUno.g:65:53: (iv_ruleVariante_UNO= ruleVariante_UNO EOF )
            // InternalMyUno.g:66:2: iv_ruleVariante_UNO= ruleVariante_UNO EOF
            {
             newCompositeNode(grammarAccess.getVariante_UNORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariante_UNO=ruleVariante_UNO();

            state._fsp--;

             current =iv_ruleVariante_UNO; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariante_UNO"


    // $ANTLR start "ruleVariante_UNO"
    // InternalMyUno.g:72:1: ruleVariante_UNO returns [EObject current=null] : (otherlv_0= 'nom_variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_manche_5_0= ruleFin_Manche ) ) ( (lv_fin_partie_6_0= ruleFin_Partie ) ) otherlv_7= '}' ) ;
    public final EObject ruleVariante_UNO() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_configuration_depart_3_0 = null;

        EObject lv_manche_4_0 = null;

        EObject lv_fin_manche_5_0 = null;

        EObject lv_fin_partie_6_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:78:2: ( (otherlv_0= 'nom_variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_manche_5_0= ruleFin_Manche ) ) ( (lv_fin_partie_6_0= ruleFin_Partie ) ) otherlv_7= '}' ) )
            // InternalMyUno.g:79:2: (otherlv_0= 'nom_variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_manche_5_0= ruleFin_Manche ) ) ( (lv_fin_partie_6_0= ruleFin_Partie ) ) otherlv_7= '}' )
            {
            // InternalMyUno.g:79:2: (otherlv_0= 'nom_variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_manche_5_0= ruleFin_Manche ) ) ( (lv_fin_partie_6_0= ruleFin_Partie ) ) otherlv_7= '}' )
            // InternalMyUno.g:80:3: otherlv_0= 'nom_variante' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '{' ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) ) ( (lv_manche_4_0= ruleManche ) ) ( (lv_fin_manche_5_0= ruleFin_Manche ) ) ( (lv_fin_partie_6_0= ruleFin_Partie ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVariante_UNOAccess().getNom_varianteKeyword_0());
            		
            // InternalMyUno.g:84:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalMyUno.g:85:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalMyUno.g:85:4: (lv_name_1_0= RULE_STRING )
            // InternalMyUno.g:86:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariante_UNOAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariante_UNORule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getVariante_UNOAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyUno.g:106:3: ( (lv_configuration_depart_3_0= ruleConfiguration_Depart ) )
            // InternalMyUno.g:107:4: (lv_configuration_depart_3_0= ruleConfiguration_Depart )
            {
            // InternalMyUno.g:107:4: (lv_configuration_depart_3_0= ruleConfiguration_Depart )
            // InternalMyUno.g:108:5: lv_configuration_depart_3_0= ruleConfiguration_Depart
            {

            					newCompositeNode(grammarAccess.getVariante_UNOAccess().getConfiguration_departConfiguration_DepartParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_configuration_depart_3_0=ruleConfiguration_Depart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariante_UNORule());
            					}
            					set(
            						current,
            						"configuration_depart",
            						lv_configuration_depart_3_0,
            						"org.xtexthheinle.uno.MyUno.Configuration_Depart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:125:3: ( (lv_manche_4_0= ruleManche ) )
            // InternalMyUno.g:126:4: (lv_manche_4_0= ruleManche )
            {
            // InternalMyUno.g:126:4: (lv_manche_4_0= ruleManche )
            // InternalMyUno.g:127:5: lv_manche_4_0= ruleManche
            {

            					newCompositeNode(grammarAccess.getVariante_UNOAccess().getMancheMancheParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_manche_4_0=ruleManche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariante_UNORule());
            					}
            					set(
            						current,
            						"manche",
            						lv_manche_4_0,
            						"org.xtexthheinle.uno.MyUno.Manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:144:3: ( (lv_fin_manche_5_0= ruleFin_Manche ) )
            // InternalMyUno.g:145:4: (lv_fin_manche_5_0= ruleFin_Manche )
            {
            // InternalMyUno.g:145:4: (lv_fin_manche_5_0= ruleFin_Manche )
            // InternalMyUno.g:146:5: lv_fin_manche_5_0= ruleFin_Manche
            {

            					newCompositeNode(grammarAccess.getVariante_UNOAccess().getFin_mancheFin_MancheParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_fin_manche_5_0=ruleFin_Manche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariante_UNORule());
            					}
            					set(
            						current,
            						"fin_manche",
            						lv_fin_manche_5_0,
            						"org.xtexthheinle.uno.MyUno.Fin_Manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:163:3: ( (lv_fin_partie_6_0= ruleFin_Partie ) )
            // InternalMyUno.g:164:4: (lv_fin_partie_6_0= ruleFin_Partie )
            {
            // InternalMyUno.g:164:4: (lv_fin_partie_6_0= ruleFin_Partie )
            // InternalMyUno.g:165:5: lv_fin_partie_6_0= ruleFin_Partie
            {

            					newCompositeNode(grammarAccess.getVariante_UNOAccess().getFin_partieFin_PartieParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_fin_partie_6_0=ruleFin_Partie();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariante_UNORule());
            					}
            					set(
            						current,
            						"fin_partie",
            						lv_fin_partie_6_0,
            						"org.xtexthheinle.uno.MyUno.Fin_Partie");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariante_UNOAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariante_UNO"


    // $ANTLR start "entryRuleConfiguration_Depart"
    // InternalMyUno.g:190:1: entryRuleConfiguration_Depart returns [EObject current=null] : iv_ruleConfiguration_Depart= ruleConfiguration_Depart EOF ;
    public final EObject entryRuleConfiguration_Depart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration_Depart = null;


        try {
            // InternalMyUno.g:190:61: (iv_ruleConfiguration_Depart= ruleConfiguration_Depart EOF )
            // InternalMyUno.g:191:2: iv_ruleConfiguration_Depart= ruleConfiguration_Depart EOF
            {
             newCompositeNode(grammarAccess.getConfiguration_DepartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration_Depart=ruleConfiguration_Depart();

            state._fsp--;

             current =iv_ruleConfiguration_Depart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration_Depart"


    // $ANTLR start "ruleConfiguration_Depart"
    // InternalMyUno.g:197:1: ruleConfiguration_Depart returns [EObject current=null] : (otherlv_0= 'Depart' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_talon_3_0= ruleTalon ) ) ( (lv_riviere_4_0= 'riviere' ) )? ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleConfiguration_Depart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_riviere_4_0=null;
        Token lv_temps_limite_5_0=null;
        Token lv_secondes_6_0=null;
        Token otherlv_7=null;
        EObject lv_main_2_0 = null;

        EObject lv_talon_3_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:203:2: ( (otherlv_0= 'Depart' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_talon_3_0= ruleTalon ) ) ( (lv_riviere_4_0= 'riviere' ) )? ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )? otherlv_7= ';' ) )
            // InternalMyUno.g:204:2: (otherlv_0= 'Depart' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_talon_3_0= ruleTalon ) ) ( (lv_riviere_4_0= 'riviere' ) )? ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )? otherlv_7= ';' )
            {
            // InternalMyUno.g:204:2: (otherlv_0= 'Depart' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_talon_3_0= ruleTalon ) ) ( (lv_riviere_4_0= 'riviere' ) )? ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )? otherlv_7= ';' )
            // InternalMyUno.g:205:3: otherlv_0= 'Depart' otherlv_1= ':' ( (lv_main_2_0= ruleMain ) ) ( (lv_talon_3_0= ruleTalon ) ) ( (lv_riviere_4_0= 'riviere' ) )? ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )? otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getConfiguration_DepartAccess().getDepartKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getConfiguration_DepartAccess().getColonKeyword_1());
            		
            // InternalMyUno.g:213:3: ( (lv_main_2_0= ruleMain ) )
            // InternalMyUno.g:214:4: (lv_main_2_0= ruleMain )
            {
            // InternalMyUno.g:214:4: (lv_main_2_0= ruleMain )
            // InternalMyUno.g:215:5: lv_main_2_0= ruleMain
            {

            					newCompositeNode(grammarAccess.getConfiguration_DepartAccess().getMainMainParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_main_2_0=ruleMain();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguration_DepartRule());
            					}
            					set(
            						current,
            						"main",
            						lv_main_2_0,
            						"org.xtexthheinle.uno.MyUno.Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:232:3: ( (lv_talon_3_0= ruleTalon ) )
            // InternalMyUno.g:233:4: (lv_talon_3_0= ruleTalon )
            {
            // InternalMyUno.g:233:4: (lv_talon_3_0= ruleTalon )
            // InternalMyUno.g:234:5: lv_talon_3_0= ruleTalon
            {

            					newCompositeNode(grammarAccess.getConfiguration_DepartAccess().getTalonTalonParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_talon_3_0=ruleTalon();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConfiguration_DepartRule());
            					}
            					set(
            						current,
            						"talon",
            						lv_talon_3_0,
            						"org.xtexthheinle.uno.MyUno.Talon");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:251:3: ( (lv_riviere_4_0= 'riviere' ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUno.g:252:4: (lv_riviere_4_0= 'riviere' )
                    {
                    // InternalMyUno.g:252:4: (lv_riviere_4_0= 'riviere' )
                    // InternalMyUno.g:253:5: lv_riviere_4_0= 'riviere'
                    {
                    lv_riviere_4_0=(Token)match(input,16,FOLLOW_14); 

                    					newLeafNode(lv_riviere_4_0, grammarAccess.getConfiguration_DepartAccess().getRiviereRiviereKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConfiguration_DepartRule());
                    					}
                    					setWithLastConsumed(current, "riviere", lv_riviere_4_0, "riviere");
                    				

                    }


                    }
                    break;

            }

            // InternalMyUno.g:265:3: ( ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyUno.g:266:4: ( (lv_temps_limite_5_0= 'temps_limite:' ) ) ( (lv_secondes_6_0= RULE_INT ) )
                    {
                    // InternalMyUno.g:266:4: ( (lv_temps_limite_5_0= 'temps_limite:' ) )
                    // InternalMyUno.g:267:5: (lv_temps_limite_5_0= 'temps_limite:' )
                    {
                    // InternalMyUno.g:267:5: (lv_temps_limite_5_0= 'temps_limite:' )
                    // InternalMyUno.g:268:6: lv_temps_limite_5_0= 'temps_limite:'
                    {
                    lv_temps_limite_5_0=(Token)match(input,17,FOLLOW_15); 

                    						newLeafNode(lv_temps_limite_5_0, grammarAccess.getConfiguration_DepartAccess().getTemps_limiteTemps_limiteKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfiguration_DepartRule());
                    						}
                    						setWithLastConsumed(current, "temps_limite", lv_temps_limite_5_0, "temps_limite:");
                    					

                    }


                    }

                    // InternalMyUno.g:280:4: ( (lv_secondes_6_0= RULE_INT ) )
                    // InternalMyUno.g:281:5: (lv_secondes_6_0= RULE_INT )
                    {
                    // InternalMyUno.g:281:5: (lv_secondes_6_0= RULE_INT )
                    // InternalMyUno.g:282:6: lv_secondes_6_0= RULE_INT
                    {
                    lv_secondes_6_0=(Token)match(input,RULE_INT,FOLLOW_16); 

                    						newLeafNode(lv_secondes_6_0, grammarAccess.getConfiguration_DepartAccess().getSecondesINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConfiguration_DepartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"secondes",
                    							lv_secondes_6_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getConfiguration_DepartAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration_Depart"


    // $ANTLR start "entryRuleMain"
    // InternalMyUno.g:307:1: entryRuleMain returns [EObject current=null] : iv_ruleMain= ruleMain EOF ;
    public final EObject entryRuleMain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMain = null;


        try {
            // InternalMyUno.g:307:45: (iv_ruleMain= ruleMain EOF )
            // InternalMyUno.g:308:2: iv_ruleMain= ruleMain EOF
            {
             newCompositeNode(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMain=ruleMain();

            state._fsp--;

             current =iv_ruleMain; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyUno.g:314:1: ruleMain returns [EObject current=null] : (otherlv_0= 'etat_main' otherlv_1= ':' ( (lv_etat_main_2_0= ruleEtat_Main ) ) otherlv_3= 'nb_mains' otherlv_4= ':' ( (lv_nb_mains_5_0= ruleNb_Mains ) ) otherlv_6= 'nb_cartes_main' otherlv_7= ':' ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) ) ) ;
    public final EObject ruleMain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Enumerator lv_etat_main_2_0 = null;

        Enumerator lv_nb_mains_5_0 = null;

        Enumerator lv_nb_cartes_mains_8_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:320:2: ( (otherlv_0= 'etat_main' otherlv_1= ':' ( (lv_etat_main_2_0= ruleEtat_Main ) ) otherlv_3= 'nb_mains' otherlv_4= ':' ( (lv_nb_mains_5_0= ruleNb_Mains ) ) otherlv_6= 'nb_cartes_main' otherlv_7= ':' ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) ) ) )
            // InternalMyUno.g:321:2: (otherlv_0= 'etat_main' otherlv_1= ':' ( (lv_etat_main_2_0= ruleEtat_Main ) ) otherlv_3= 'nb_mains' otherlv_4= ':' ( (lv_nb_mains_5_0= ruleNb_Mains ) ) otherlv_6= 'nb_cartes_main' otherlv_7= ':' ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) ) )
            {
            // InternalMyUno.g:321:2: (otherlv_0= 'etat_main' otherlv_1= ':' ( (lv_etat_main_2_0= ruleEtat_Main ) ) otherlv_3= 'nb_mains' otherlv_4= ':' ( (lv_nb_mains_5_0= ruleNb_Mains ) ) otherlv_6= 'nb_cartes_main' otherlv_7= ':' ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) ) )
            // InternalMyUno.g:322:3: otherlv_0= 'etat_main' otherlv_1= ':' ( (lv_etat_main_2_0= ruleEtat_Main ) ) otherlv_3= 'nb_mains' otherlv_4= ':' ( (lv_nb_mains_5_0= ruleNb_Mains ) ) otherlv_6= 'nb_cartes_main' otherlv_7= ':' ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMainAccess().getEtat_mainKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getMainAccess().getColonKeyword_1());
            		
            // InternalMyUno.g:330:3: ( (lv_etat_main_2_0= ruleEtat_Main ) )
            // InternalMyUno.g:331:4: (lv_etat_main_2_0= ruleEtat_Main )
            {
            // InternalMyUno.g:331:4: (lv_etat_main_2_0= ruleEtat_Main )
            // InternalMyUno.g:332:5: lv_etat_main_2_0= ruleEtat_Main
            {

            					newCompositeNode(grammarAccess.getMainAccess().getEtat_mainEtat_MainEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
            lv_etat_main_2_0=ruleEtat_Main();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"etat_main",
            						lv_etat_main_2_0,
            						"org.xtexthheinle.uno.MyUno.Etat_Main");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getMainAccess().getNb_mainsKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getMainAccess().getColonKeyword_4());
            		
            // InternalMyUno.g:357:3: ( (lv_nb_mains_5_0= ruleNb_Mains ) )
            // InternalMyUno.g:358:4: (lv_nb_mains_5_0= ruleNb_Mains )
            {
            // InternalMyUno.g:358:4: (lv_nb_mains_5_0= ruleNb_Mains )
            // InternalMyUno.g:359:5: lv_nb_mains_5_0= ruleNb_Mains
            {

            					newCompositeNode(grammarAccess.getMainAccess().getNb_mainsNb_MainsEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_20);
            lv_nb_mains_5_0=ruleNb_Mains();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"nb_mains",
            						lv_nb_mains_5_0,
            						"org.xtexthheinle.uno.MyUno.Nb_Mains");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getMainAccess().getNb_cartes_mainKeyword_6());
            		
            otherlv_7=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getMainAccess().getColonKeyword_7());
            		
            // InternalMyUno.g:384:3: ( (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains ) )
            // InternalMyUno.g:385:4: (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains )
            {
            // InternalMyUno.g:385:4: (lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains )
            // InternalMyUno.g:386:5: lv_nb_cartes_mains_8_0= ruleNb_Cartes_Mains
            {

            					newCompositeNode(grammarAccess.getMainAccess().getNb_cartes_mainsNb_Cartes_MainsEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_nb_cartes_mains_8_0=ruleNb_Cartes_Mains();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMainRule());
            					}
            					set(
            						current,
            						"nb_cartes_mains",
            						lv_nb_cartes_mains_8_0,
            						"org.xtexthheinle.uno.MyUno.Nb_Cartes_Mains");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleTalon"
    // InternalMyUno.g:407:1: entryRuleTalon returns [EObject current=null] : iv_ruleTalon= ruleTalon EOF ;
    public final EObject entryRuleTalon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTalon = null;


        try {
            // InternalMyUno.g:407:46: (iv_ruleTalon= ruleTalon EOF )
            // InternalMyUno.g:408:2: iv_ruleTalon= ruleTalon EOF
            {
             newCompositeNode(grammarAccess.getTalonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTalon=ruleTalon();

            state._fsp--;

             current =iv_ruleTalon; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTalon"


    // $ANTLR start "ruleTalon"
    // InternalMyUno.g:414:1: ruleTalon returns [EObject current=null] : (otherlv_0= 'nb_talons' otherlv_1= ':' ( (lv_nb_talons_2_0= ruleNb_Talons ) ) ) ;
    public final EObject ruleTalon() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_nb_talons_2_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:420:2: ( (otherlv_0= 'nb_talons' otherlv_1= ':' ( (lv_nb_talons_2_0= ruleNb_Talons ) ) ) )
            // InternalMyUno.g:421:2: (otherlv_0= 'nb_talons' otherlv_1= ':' ( (lv_nb_talons_2_0= ruleNb_Talons ) ) )
            {
            // InternalMyUno.g:421:2: (otherlv_0= 'nb_talons' otherlv_1= ':' ( (lv_nb_talons_2_0= ruleNb_Talons ) ) )
            // InternalMyUno.g:422:3: otherlv_0= 'nb_talons' otherlv_1= ':' ( (lv_nb_talons_2_0= ruleNb_Talons ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTalonAccess().getNb_talonsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getTalonAccess().getColonKeyword_1());
            		
            // InternalMyUno.g:430:3: ( (lv_nb_talons_2_0= ruleNb_Talons ) )
            // InternalMyUno.g:431:4: (lv_nb_talons_2_0= ruleNb_Talons )
            {
            // InternalMyUno.g:431:4: (lv_nb_talons_2_0= ruleNb_Talons )
            // InternalMyUno.g:432:5: lv_nb_talons_2_0= ruleNb_Talons
            {

            					newCompositeNode(grammarAccess.getTalonAccess().getNb_talonsNb_TalonsEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_nb_talons_2_0=ruleNb_Talons();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTalonRule());
            					}
            					set(
            						current,
            						"nb_talons",
            						lv_nb_talons_2_0,
            						"org.xtexthheinle.uno.MyUno.Nb_Talons");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTalon"


    // $ANTLR start "entryRuleManche"
    // InternalMyUno.g:453:1: entryRuleManche returns [EObject current=null] : iv_ruleManche= ruleManche EOF ;
    public final EObject entryRuleManche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleManche = null;


        try {
            // InternalMyUno.g:453:47: (iv_ruleManche= ruleManche EOF )
            // InternalMyUno.g:454:2: iv_ruleManche= ruleManche EOF
            {
             newCompositeNode(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleManche=ruleManche();

            state._fsp--;

             current =iv_ruleManche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalMyUno.g:460:1: ruleManche returns [EObject current=null] : (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )? (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )? otherlv_10= 'Nb_cartes_jouables' otherlv_11= '(' ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) ) otherlv_13= ')' (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )? ( (lv_pioche_18_0= rulePioche ) ) (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )? (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )? otherlv_27= ';' ) ;
    public final EObject ruleManche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        EObject lv_inversion_4_0 = null;

        EObject lv_tourner_les_mains_8_0 = null;

        Enumerator lv_nb_cartes_jouables_12_0 = null;

        EObject lv_cartes_1_9_16_0 = null;

        EObject lv_pioche_18_0 = null;

        EObject lv_cumul_21_0 = null;

        EObject lv_contestations_25_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:466:2: ( (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )? (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )? otherlv_10= 'Nb_cartes_jouables' otherlv_11= '(' ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) ) otherlv_13= ')' (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )? ( (lv_pioche_18_0= rulePioche ) ) (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )? (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )? otherlv_27= ';' ) )
            // InternalMyUno.g:467:2: (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )? (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )? otherlv_10= 'Nb_cartes_jouables' otherlv_11= '(' ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) ) otherlv_13= ')' (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )? ( (lv_pioche_18_0= rulePioche ) ) (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )? (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )? otherlv_27= ';' )
            {
            // InternalMyUno.g:467:2: (otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )? (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )? otherlv_10= 'Nb_cartes_jouables' otherlv_11= '(' ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) ) otherlv_13= ')' (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )? ( (lv_pioche_18_0= rulePioche ) ) (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )? (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )? otherlv_27= ';' )
            // InternalMyUno.g:468:3: otherlv_0= 'Manche' otherlv_1= ':' (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )? (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )? otherlv_10= 'Nb_cartes_jouables' otherlv_11= '(' ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) ) otherlv_13= ')' (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )? ( (lv_pioche_18_0= rulePioche ) ) (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )? (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )? otherlv_27= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMancheAccess().getMancheKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getMancheAccess().getColonKeyword_1());
            		
            // InternalMyUno.g:476:3: (otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyUno.g:477:4: otherlv_2= 'Inversion' otherlv_3= '(' ( (lv_inversion_4_0= ruleInversion ) ) otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getMancheAccess().getInversionKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,25,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1());
                    			
                    // InternalMyUno.g:485:4: ( (lv_inversion_4_0= ruleInversion ) )
                    // InternalMyUno.g:486:5: (lv_inversion_4_0= ruleInversion )
                    {
                    // InternalMyUno.g:486:5: (lv_inversion_4_0= ruleInversion )
                    // InternalMyUno.g:487:6: lv_inversion_4_0= ruleInversion
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getInversionInversionParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_inversion_4_0=ruleInversion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"inversion",
                    							lv_inversion_4_0,
                    							"org.xtexthheinle.uno.MyUno.Inversion");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            // InternalMyUno.g:509:3: (otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyUno.g:510:4: otherlv_6= 'Tourner_mains' otherlv_7= '(' ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_6, grammarAccess.getMancheAccess().getTourner_mainsKeyword_3_0());
                    			
                    otherlv_7=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyUno.g:518:4: ( (lv_tourner_les_mains_8_0= ruleTourner_les_mains ) )
                    // InternalMyUno.g:519:5: (lv_tourner_les_mains_8_0= ruleTourner_les_mains )
                    {
                    // InternalMyUno.g:519:5: (lv_tourner_les_mains_8_0= ruleTourner_les_mains )
                    // InternalMyUno.g:520:6: lv_tourner_les_mains_8_0= ruleTourner_les_mains
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getTourner_les_mainsTourner_les_mainsParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_tourner_les_mains_8_0=ruleTourner_les_mains();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"tourner_les_mains",
                    							lv_tourner_les_mains_8_0,
                    							"org.xtexthheinle.uno.MyUno.Tourner_les_mains");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_9, grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getMancheAccess().getNb_cartes_jouablesKeyword_4());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMyUno.g:550:3: ( (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables ) )
            // InternalMyUno.g:551:4: (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables )
            {
            // InternalMyUno.g:551:4: (lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables )
            // InternalMyUno.g:552:5: lv_nb_cartes_jouables_12_0= ruleNb_cartes_jouables
            {

            					newCompositeNode(grammarAccess.getMancheAccess().getNb_cartes_jouablesNb_cartes_jouablesEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_nb_cartes_jouables_12_0=ruleNb_cartes_jouables();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMancheRule());
            					}
            					set(
            						current,
            						"nb_cartes_jouables",
            						lv_nb_cartes_jouables_12_0,
            						"org.xtexthheinle.uno.MyUno.Nb_cartes_jouables");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,26,FOLLOW_30); 

            			newLeafNode(otherlv_13, grammarAccess.getMancheAccess().getRightParenthesisKeyword_7());
            		
            // InternalMyUno.g:573:3: (otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==29) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyUno.g:574:4: otherlv_14= 'Cartes_1_a_9' otherlv_15= '(' ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) ) otherlv_17= ')'
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_23); 

                    				newLeafNode(otherlv_14, grammarAccess.getMancheAccess().getCartes_1_a_9Keyword_8_0());
                    			
                    otherlv_15=(Token)match(input,25,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyUno.g:582:4: ( (lv_cartes_1_9_16_0= ruleCartes_1_9 ) )
                    // InternalMyUno.g:583:5: (lv_cartes_1_9_16_0= ruleCartes_1_9 )
                    {
                    // InternalMyUno.g:583:5: (lv_cartes_1_9_16_0= ruleCartes_1_9 )
                    // InternalMyUno.g:584:6: lv_cartes_1_9_16_0= ruleCartes_1_9
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getCartes_1_9Cartes_1_9ParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_cartes_1_9_16_0=ruleCartes_1_9();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"cartes_1_9",
                    							lv_cartes_1_9_16_0,
                    							"org.xtexthheinle.uno.MyUno.Cartes_1_9");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,26,FOLLOW_30); 

                    				newLeafNode(otherlv_17, grammarAccess.getMancheAccess().getRightParenthesisKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalMyUno.g:606:3: ( (lv_pioche_18_0= rulePioche ) )
            // InternalMyUno.g:607:4: (lv_pioche_18_0= rulePioche )
            {
            // InternalMyUno.g:607:4: (lv_pioche_18_0= rulePioche )
            // InternalMyUno.g:608:5: lv_pioche_18_0= rulePioche
            {

            					newCompositeNode(grammarAccess.getMancheAccess().getPiochePiocheParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_32);
            lv_pioche_18_0=rulePioche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMancheRule());
            					}
            					set(
            						current,
            						"pioche",
            						lv_pioche_18_0,
            						"org.xtexthheinle.uno.MyUno.Pioche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyUno.g:625:3: (otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyUno.g:626:4: otherlv_19= 'Cumul' otherlv_20= '(' ( (lv_cumul_21_0= ruleCumul ) ) otherlv_22= ')'
                    {
                    otherlv_19=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getMancheAccess().getCumulKeyword_10_0());
                    			
                    otherlv_20=(Token)match(input,25,FOLLOW_33); 

                    				newLeafNode(otherlv_20, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_10_1());
                    			
                    // InternalMyUno.g:634:4: ( (lv_cumul_21_0= ruleCumul ) )
                    // InternalMyUno.g:635:5: (lv_cumul_21_0= ruleCumul )
                    {
                    // InternalMyUno.g:635:5: (lv_cumul_21_0= ruleCumul )
                    // InternalMyUno.g:636:6: lv_cumul_21_0= ruleCumul
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getCumulCumulParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_cumul_21_0=ruleCumul();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"cumul",
                    							lv_cumul_21_0,
                    							"org.xtexthheinle.uno.MyUno.Cumul");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,26,FOLLOW_34); 

                    				newLeafNode(otherlv_22, grammarAccess.getMancheAccess().getRightParenthesisKeyword_10_3());
                    			

                    }
                    break;

            }

            // InternalMyUno.g:658:3: (otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUno.g:659:4: otherlv_23= 'Contestations' otherlv_24= '(' ( (lv_contestations_25_0= ruleContestations ) ) otherlv_26= ')'
                    {
                    otherlv_23=(Token)match(input,31,FOLLOW_23); 

                    				newLeafNode(otherlv_23, grammarAccess.getMancheAccess().getContestationsKeyword_11_0());
                    			
                    otherlv_24=(Token)match(input,25,FOLLOW_35); 

                    				newLeafNode(otherlv_24, grammarAccess.getMancheAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalMyUno.g:667:4: ( (lv_contestations_25_0= ruleContestations ) )
                    // InternalMyUno.g:668:5: (lv_contestations_25_0= ruleContestations )
                    {
                    // InternalMyUno.g:668:5: (lv_contestations_25_0= ruleContestations )
                    // InternalMyUno.g:669:6: lv_contestations_25_0= ruleContestations
                    {

                    						newCompositeNode(grammarAccess.getMancheAccess().getContestationsContestationsParserRuleCall_11_2_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_contestations_25_0=ruleContestations();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMancheRule());
                    						}
                    						set(
                    							current,
                    							"contestations",
                    							lv_contestations_25_0,
                    							"org.xtexthheinle.uno.MyUno.Contestations");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_26=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_26, grammarAccess.getMancheAccess().getRightParenthesisKeyword_11_3());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getMancheAccess().getSemicolonKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleInversion"
    // InternalMyUno.g:699:1: entryRuleInversion returns [EObject current=null] : iv_ruleInversion= ruleInversion EOF ;
    public final EObject entryRuleInversion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInversion = null;


        try {
            // InternalMyUno.g:699:50: (iv_ruleInversion= ruleInversion EOF )
            // InternalMyUno.g:700:2: iv_ruleInversion= ruleInversion EOF
            {
             newCompositeNode(grammarAccess.getInversionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInversion=ruleInversion();

            state._fsp--;

             current =iv_ruleInversion; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInversion"


    // $ANTLR start "ruleInversion"
    // InternalMyUno.g:706:1: ruleInversion returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleInversion() throws RecognitionException {
        EObject current = null;

        Token lv_avec_carte_inversion_1_0=null;
        Token lv_avec_carte_sept_2_0=null;


        	enterRule();

        try {
            // InternalMyUno.g:712:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) ) ) )
            // InternalMyUno.g:713:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) ) )
            {
            // InternalMyUno.g:713:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) ) )
            // InternalMyUno.g:714:3: ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) )
            {
            // InternalMyUno.g:714:3: ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* ) )
            // InternalMyUno.g:715:4: ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getInversionAccess().getUnorderedGroup());
            			
            // InternalMyUno.g:718:4: ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )* )
            // InternalMyUno.g:719:5: ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )*
            {
            // InternalMyUno.g:719:5: ( ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( LA8_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyUno.g:720:3: ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:720:3: ({...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) ) )
            	    // InternalMyUno.g:721:4: {...}? => ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleInversion", "getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyUno.g:721:103: ( ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) ) )
            	    // InternalMyUno.g:722:5: ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInversionAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyUno.g:725:8: ({...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) ) )
            	    // InternalMyUno.g:725:9: {...}? => ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInversion", "true");
            	    }
            	    // InternalMyUno.g:725:18: ( (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' ) )
            	    // InternalMyUno.g:725:19: (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' )
            	    {
            	    // InternalMyUno.g:725:19: (lv_avec_carte_inversion_1_0= 'avec_carte_inversion' )
            	    // InternalMyUno.g:726:9: lv_avec_carte_inversion_1_0= 'avec_carte_inversion'
            	    {
            	    lv_avec_carte_inversion_1_0=(Token)match(input,32,FOLLOW_36); 

            	    									newLeafNode(lv_avec_carte_inversion_1_0, grammarAccess.getInversionAccess().getAvec_carte_inversionAvec_carte_inversionKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getInversionRule());
            	    									}
            	    									setWithLastConsumed(current, "avec_carte_inversion", lv_avec_carte_inversion_1_0, "avec_carte_inversion");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInversionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUno.g:743:3: ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:743:3: ({...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) ) )
            	    // InternalMyUno.g:744:4: {...}? => ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleInversion", "getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyUno.g:744:103: ( ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) ) )
            	    // InternalMyUno.g:745:5: ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getInversionAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyUno.g:748:8: ({...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) ) )
            	    // InternalMyUno.g:748:9: {...}? => ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleInversion", "true");
            	    }
            	    // InternalMyUno.g:748:18: ( (lv_avec_carte_sept_2_0= 'avec_carte_sept' ) )
            	    // InternalMyUno.g:748:19: (lv_avec_carte_sept_2_0= 'avec_carte_sept' )
            	    {
            	    // InternalMyUno.g:748:19: (lv_avec_carte_sept_2_0= 'avec_carte_sept' )
            	    // InternalMyUno.g:749:9: lv_avec_carte_sept_2_0= 'avec_carte_sept'
            	    {
            	    lv_avec_carte_sept_2_0=(Token)match(input,33,FOLLOW_36); 

            	    									newLeafNode(lv_avec_carte_sept_2_0, grammarAccess.getInversionAccess().getAvec_carte_septAvec_carte_septKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getInversionRule());
            	    									}
            	    									setWithLastConsumed(current, "avec_carte_sept", lv_avec_carte_sept_2_0, "avec_carte_sept");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInversionAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getInversionAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInversion"


    // $ANTLR start "entryRuleTourner_les_mains"
    // InternalMyUno.g:776:1: entryRuleTourner_les_mains returns [EObject current=null] : iv_ruleTourner_les_mains= ruleTourner_les_mains EOF ;
    public final EObject entryRuleTourner_les_mains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTourner_les_mains = null;


        try {
            // InternalMyUno.g:776:58: (iv_ruleTourner_les_mains= ruleTourner_les_mains EOF )
            // InternalMyUno.g:777:2: iv_ruleTourner_les_mains= ruleTourner_les_mains EOF
            {
             newCompositeNode(grammarAccess.getTourner_les_mainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTourner_les_mains=ruleTourner_les_mains();

            state._fsp--;

             current =iv_ruleTourner_les_mains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTourner_les_mains"


    // $ANTLR start "ruleTourner_les_mains"
    // InternalMyUno.g:783:1: ruleTourner_les_mains returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleTourner_les_mains() throws RecognitionException {
        EObject current = null;

        Token lv_avec_carte_zero_1_0=null;
        Token lv_avec_carte_uno_2_0=null;


        	enterRule();

        try {
            // InternalMyUno.g:789:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) ) ) )
            // InternalMyUno.g:790:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) ) )
            {
            // InternalMyUno.g:790:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) ) )
            // InternalMyUno.g:791:3: ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) )
            {
            // InternalMyUno.g:791:3: ( ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* ) )
            // InternalMyUno.g:792:4: ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            			
            // InternalMyUno.g:795:4: ( ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )* )
            // InternalMyUno.g:796:5: ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )*
            {
            // InternalMyUno.g:796:5: ( ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyUno.g:797:3: ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:797:3: ({...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) ) )
            	    // InternalMyUno.g:798:4: {...}? => ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTourner_les_mains", "getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyUno.g:798:111: ( ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) ) )
            	    // InternalMyUno.g:799:5: ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyUno.g:802:8: ({...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) ) )
            	    // InternalMyUno.g:802:9: {...}? => ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTourner_les_mains", "true");
            	    }
            	    // InternalMyUno.g:802:18: ( (lv_avec_carte_zero_1_0= 'avec_carte_zero' ) )
            	    // InternalMyUno.g:802:19: (lv_avec_carte_zero_1_0= 'avec_carte_zero' )
            	    {
            	    // InternalMyUno.g:802:19: (lv_avec_carte_zero_1_0= 'avec_carte_zero' )
            	    // InternalMyUno.g:803:9: lv_avec_carte_zero_1_0= 'avec_carte_zero'
            	    {
            	    lv_avec_carte_zero_1_0=(Token)match(input,34,FOLLOW_37); 

            	    									newLeafNode(lv_avec_carte_zero_1_0, grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAvec_carte_zeroKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getTourner_les_mainsRule());
            	    									}
            	    									setWithLastConsumed(current, "avec_carte_zero", lv_avec_carte_zero_1_0, "avec_carte_zero");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUno.g:820:3: ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:820:3: ({...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) ) )
            	    // InternalMyUno.g:821:4: {...}? => ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTourner_les_mains", "getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyUno.g:821:111: ( ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) ) )
            	    // InternalMyUno.g:822:5: ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyUno.g:825:8: ({...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) ) )
            	    // InternalMyUno.g:825:9: {...}? => ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTourner_les_mains", "true");
            	    }
            	    // InternalMyUno.g:825:18: ( (lv_avec_carte_uno_2_0= 'avec_carte_uno' ) )
            	    // InternalMyUno.g:825:19: (lv_avec_carte_uno_2_0= 'avec_carte_uno' )
            	    {
            	    // InternalMyUno.g:825:19: (lv_avec_carte_uno_2_0= 'avec_carte_uno' )
            	    // InternalMyUno.g:826:9: lv_avec_carte_uno_2_0= 'avec_carte_uno'
            	    {
            	    lv_avec_carte_uno_2_0=(Token)match(input,35,FOLLOW_37); 

            	    									newLeafNode(lv_avec_carte_uno_2_0, grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAvec_carte_unoKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getTourner_les_mainsRule());
            	    									}
            	    									setWithLastConsumed(current, "avec_carte_uno", lv_avec_carte_uno_2_0, "avec_carte_uno");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTourner_les_mains"


    // $ANTLR start "entryRuleCartes_1_9"
    // InternalMyUno.g:853:1: entryRuleCartes_1_9 returns [EObject current=null] : iv_ruleCartes_1_9= ruleCartes_1_9 EOF ;
    public final EObject entryRuleCartes_1_9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCartes_1_9 = null;


        try {
            // InternalMyUno.g:853:51: (iv_ruleCartes_1_9= ruleCartes_1_9 EOF )
            // InternalMyUno.g:854:2: iv_ruleCartes_1_9= ruleCartes_1_9 EOF
            {
             newCompositeNode(grammarAccess.getCartes_1_9Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCartes_1_9=ruleCartes_1_9();

            state._fsp--;

             current =iv_ruleCartes_1_9; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCartes_1_9"


    // $ANTLR start "ruleCartes_1_9"
    // InternalMyUno.g:860:1: ruleCartes_1_9 returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) ) ) ;
    public final EObject ruleCartes_1_9() throws RecognitionException {
        EObject current = null;

        Token lv_suites_1_0=null;
        Token lv_suites_royales_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_interception_5_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:866:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) ) ) )
            // InternalMyUno.g:867:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) ) )
            {
            // InternalMyUno.g:867:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) ) )
            // InternalMyUno.g:868:3: ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) )
            {
            // InternalMyUno.g:868:3: ( ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* ) )
            // InternalMyUno.g:869:4: ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            			
            // InternalMyUno.g:872:4: ( ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )* )
            // InternalMyUno.g:873:5: ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )*
            {
            // InternalMyUno.g:873:5: ( ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) ) )*
            loop10:
            do {
                int alt10=4;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                    alt10=3;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyUno.g:874:3: ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:874:3: ({...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) ) )
            	    // InternalMyUno.g:875:4: {...}? => ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyUno.g:875:104: ( ({...}? => ( (lv_suites_1_0= 'suites' ) ) ) )
            	    // InternalMyUno.g:876:5: ({...}? => ( (lv_suites_1_0= 'suites' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyUno.g:879:8: ({...}? => ( (lv_suites_1_0= 'suites' ) ) )
            	    // InternalMyUno.g:879:9: {...}? => ( (lv_suites_1_0= 'suites' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "true");
            	    }
            	    // InternalMyUno.g:879:18: ( (lv_suites_1_0= 'suites' ) )
            	    // InternalMyUno.g:879:19: (lv_suites_1_0= 'suites' )
            	    {
            	    // InternalMyUno.g:879:19: (lv_suites_1_0= 'suites' )
            	    // InternalMyUno.g:880:9: lv_suites_1_0= 'suites'
            	    {
            	    lv_suites_1_0=(Token)match(input,36,FOLLOW_38); 

            	    									newLeafNode(lv_suites_1_0, grammarAccess.getCartes_1_9Access().getSuitesSuitesKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCartes_1_9Rule());
            	    									}
            	    									setWithLastConsumed(current, "suites", lv_suites_1_0, "suites");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUno.g:897:3: ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:897:3: ({...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) ) )
            	    // InternalMyUno.g:898:4: {...}? => ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyUno.g:898:104: ( ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) ) )
            	    // InternalMyUno.g:899:5: ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyUno.g:902:8: ({...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) ) )
            	    // InternalMyUno.g:902:9: {...}? => ( (lv_suites_royales_2_0= 'suites_royales' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "true");
            	    }
            	    // InternalMyUno.g:902:18: ( (lv_suites_royales_2_0= 'suites_royales' ) )
            	    // InternalMyUno.g:902:19: (lv_suites_royales_2_0= 'suites_royales' )
            	    {
            	    // InternalMyUno.g:902:19: (lv_suites_royales_2_0= 'suites_royales' )
            	    // InternalMyUno.g:903:9: lv_suites_royales_2_0= 'suites_royales'
            	    {
            	    lv_suites_royales_2_0=(Token)match(input,37,FOLLOW_38); 

            	    									newLeafNode(lv_suites_royales_2_0, grammarAccess.getCartes_1_9Access().getSuites_royalesSuites_royalesKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCartes_1_9Rule());
            	    									}
            	    									setWithLastConsumed(current, "suites_royales", lv_suites_royales_2_0, "suites_royales");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUno.g:920:3: ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) )
            	    {
            	    // InternalMyUno.g:920:3: ({...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) ) )
            	    // InternalMyUno.g:921:4: {...}? => ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyUno.g:921:104: ( ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) ) )
            	    // InternalMyUno.g:922:5: ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyUno.g:925:8: ({...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' ) )
            	    // InternalMyUno.g:925:9: {...}? => (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCartes_1_9", "true");
            	    }
            	    // InternalMyUno.g:925:18: (otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}' )
            	    // InternalMyUno.g:925:19: otherlv_3= 'interception' otherlv_4= '{' ( (lv_interception_5_0= ruleInterception ) ) otherlv_6= '}'
            	    {
            	    otherlv_3=(Token)match(input,38,FOLLOW_4); 

            	    								newLeafNode(otherlv_3, grammarAccess.getCartes_1_9Access().getInterceptionKeyword_2_0());
            	    							
            	    otherlv_4=(Token)match(input,12,FOLLOW_39); 

            	    								newLeafNode(otherlv_4, grammarAccess.getCartes_1_9Access().getLeftCurlyBracketKeyword_2_1());
            	    							
            	    // InternalMyUno.g:933:8: ( (lv_interception_5_0= ruleInterception ) )
            	    // InternalMyUno.g:934:9: (lv_interception_5_0= ruleInterception )
            	    {
            	    // InternalMyUno.g:934:9: (lv_interception_5_0= ruleInterception )
            	    // InternalMyUno.g:935:10: lv_interception_5_0= ruleInterception
            	    {

            	    										newCompositeNode(grammarAccess.getCartes_1_9Access().getInterceptionInterceptionEnumRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_9);
            	    lv_interception_5_0=ruleInterception();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCartes_1_9Rule());
            	    										}
            	    										set(
            	    											current,
            	    											"interception",
            	    											lv_interception_5_0,
            	    											"org.xtexthheinle.uno.MyUno.Interception");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_6=(Token)match(input,13,FOLLOW_38); 

            	    								newLeafNode(otherlv_6, grammarAccess.getCartes_1_9Access().getRightCurlyBracketKeyword_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCartes_1_9"


    // $ANTLR start "entryRulePioche"
    // InternalMyUno.g:972:1: entryRulePioche returns [EObject current=null] : iv_rulePioche= rulePioche EOF ;
    public final EObject entryRulePioche() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePioche = null;


        try {
            // InternalMyUno.g:972:47: (iv_rulePioche= rulePioche EOF )
            // InternalMyUno.g:973:2: iv_rulePioche= rulePioche EOF
            {
             newCompositeNode(grammarAccess.getPiocheRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePioche=rulePioche();

            state._fsp--;

             current =iv_rulePioche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePioche"


    // $ANTLR start "rulePioche"
    // InternalMyUno.g:979:1: rulePioche returns [EObject current=null] : (otherlv_0= 'Pioche' otherlv_1= '(' otherlv_2= 'nb_cartes_a_piocher:' ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) ) otherlv_4= 'jouer_apres_pioche:' ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) ) otherlv_6= ')' ) ;
    public final EObject rulePioche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_nb_cartes_a_piocher_3_0 = null;

        Enumerator lv_jouer_apres_pioche_5_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:985:2: ( (otherlv_0= 'Pioche' otherlv_1= '(' otherlv_2= 'nb_cartes_a_piocher:' ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) ) otherlv_4= 'jouer_apres_pioche:' ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) ) otherlv_6= ')' ) )
            // InternalMyUno.g:986:2: (otherlv_0= 'Pioche' otherlv_1= '(' otherlv_2= 'nb_cartes_a_piocher:' ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) ) otherlv_4= 'jouer_apres_pioche:' ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) ) otherlv_6= ')' )
            {
            // InternalMyUno.g:986:2: (otherlv_0= 'Pioche' otherlv_1= '(' otherlv_2= 'nb_cartes_a_piocher:' ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) ) otherlv_4= 'jouer_apres_pioche:' ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) ) otherlv_6= ')' )
            // InternalMyUno.g:987:3: otherlv_0= 'Pioche' otherlv_1= '(' otherlv_2= 'nb_cartes_a_piocher:' ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) ) otherlv_4= 'jouer_apres_pioche:' ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getPiocheAccess().getPiocheKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getPiocheAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getPiocheAccess().getNb_cartes_a_piocherKeyword_2());
            		
            // InternalMyUno.g:999:3: ( (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher ) )
            // InternalMyUno.g:1000:4: (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher )
            {
            // InternalMyUno.g:1000:4: (lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher )
            // InternalMyUno.g:1001:5: lv_nb_cartes_a_piocher_3_0= ruleNb_cartes_a_piocher
            {

            					newCompositeNode(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherNb_cartes_a_piocherEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
            lv_nb_cartes_a_piocher_3_0=ruleNb_cartes_a_piocher();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPiocheRule());
            					}
            					set(
            						current,
            						"nb_cartes_a_piocher",
            						lv_nb_cartes_a_piocher_3_0,
            						"org.xtexthheinle.uno.MyUno.Nb_cartes_a_piocher");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getPiocheAccess().getJouer_apres_piocheKeyword_4());
            		
            // InternalMyUno.g:1022:3: ( (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche ) )
            // InternalMyUno.g:1023:4: (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche )
            {
            // InternalMyUno.g:1023:4: (lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche )
            // InternalMyUno.g:1024:5: lv_jouer_apres_pioche_5_0= ruleJouer_apres_pioche
            {

            					newCompositeNode(grammarAccess.getPiocheAccess().getJouer_apres_piocheJouer_apres_piocheEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_jouer_apres_pioche_5_0=ruleJouer_apres_pioche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPiocheRule());
            					}
            					set(
            						current,
            						"jouer_apres_pioche",
            						lv_jouer_apres_pioche_5_0,
            						"org.xtexthheinle.uno.MyUno.Jouer_apres_pioche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPiocheAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePioche"


    // $ANTLR start "entryRuleCumul"
    // InternalMyUno.g:1049:1: entryRuleCumul returns [EObject current=null] : iv_ruleCumul= ruleCumul EOF ;
    public final EObject entryRuleCumul() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCumul = null;


        try {
            // InternalMyUno.g:1049:46: (iv_ruleCumul= ruleCumul EOF )
            // InternalMyUno.g:1050:2: iv_ruleCumul= ruleCumul EOF
            {
             newCompositeNode(grammarAccess.getCumulRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCumul=ruleCumul();

            state._fsp--;

             current =iv_ruleCumul; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCumul"


    // $ANTLR start "ruleCumul"
    // InternalMyUno.g:1056:1: ruleCumul returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleCumul() throws RecognitionException {
        EObject current = null;

        Token lv_cumul_plus_2_1_0=null;
        Token lv_cumul_plus_4_2_0=null;
        Token lv_cumul_carte_couleur_3_0=null;
        Token lv_cumul_carte_uno_4_0=null;


        	enterRule();

        try {
            // InternalMyUno.g:1062:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) ) ) )
            // InternalMyUno.g:1063:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) ) )
            {
            // InternalMyUno.g:1063:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) ) )
            // InternalMyUno.g:1064:3: ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) )
            {
            // InternalMyUno.g:1064:3: ( ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* ) )
            // InternalMyUno.g:1065:4: ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getCumulAccess().getUnorderedGroup());
            			
            // InternalMyUno.g:1068:4: ( ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )* )
            // InternalMyUno.g:1069:5: ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )*
            {
            // InternalMyUno.g:1069:5: ( ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyUno.g:1070:3: ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1070:3: ({...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) ) )
            	    // InternalMyUno.g:1071:4: {...}? => ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyUno.g:1071:99: ( ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) ) )
            	    // InternalMyUno.g:1072:5: ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyUno.g:1075:8: ({...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) ) )
            	    // InternalMyUno.g:1075:9: {...}? => ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "true");
            	    }
            	    // InternalMyUno.g:1075:18: ( (lv_cumul_plus_2_1_0= 'cumul_plus_2' ) )
            	    // InternalMyUno.g:1075:19: (lv_cumul_plus_2_1_0= 'cumul_plus_2' )
            	    {
            	    // InternalMyUno.g:1075:19: (lv_cumul_plus_2_1_0= 'cumul_plus_2' )
            	    // InternalMyUno.g:1076:9: lv_cumul_plus_2_1_0= 'cumul_plus_2'
            	    {
            	    lv_cumul_plus_2_1_0=(Token)match(input,42,FOLLOW_44); 

            	    									newLeafNode(lv_cumul_plus_2_1_0, grammarAccess.getCumulAccess().getCumul_plus_2Cumul_plus_2Keyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCumulRule());
            	    									}
            	    									setWithLastConsumed(current, "cumul_plus_2", lv_cumul_plus_2_1_0, "cumul_plus_2");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumulAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUno.g:1093:3: ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1093:3: ({...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) ) )
            	    // InternalMyUno.g:1094:4: {...}? => ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyUno.g:1094:99: ( ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) ) )
            	    // InternalMyUno.g:1095:5: ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyUno.g:1098:8: ({...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) ) )
            	    // InternalMyUno.g:1098:9: {...}? => ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "true");
            	    }
            	    // InternalMyUno.g:1098:18: ( (lv_cumul_plus_4_2_0= 'cumul_plus_4' ) )
            	    // InternalMyUno.g:1098:19: (lv_cumul_plus_4_2_0= 'cumul_plus_4' )
            	    {
            	    // InternalMyUno.g:1098:19: (lv_cumul_plus_4_2_0= 'cumul_plus_4' )
            	    // InternalMyUno.g:1099:9: lv_cumul_plus_4_2_0= 'cumul_plus_4'
            	    {
            	    lv_cumul_plus_4_2_0=(Token)match(input,43,FOLLOW_44); 

            	    									newLeafNode(lv_cumul_plus_4_2_0, grammarAccess.getCumulAccess().getCumul_plus_4Cumul_plus_4Keyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCumulRule());
            	    									}
            	    									setWithLastConsumed(current, "cumul_plus_4", lv_cumul_plus_4_2_0, "cumul_plus_4");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumulAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyUno.g:1116:3: ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1116:3: ({...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) ) )
            	    // InternalMyUno.g:1117:4: {...}? => ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalMyUno.g:1117:99: ( ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) ) )
            	    // InternalMyUno.g:1118:5: ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalMyUno.g:1121:8: ({...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) ) )
            	    // InternalMyUno.g:1121:9: {...}? => ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "true");
            	    }
            	    // InternalMyUno.g:1121:18: ( (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' ) )
            	    // InternalMyUno.g:1121:19: (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' )
            	    {
            	    // InternalMyUno.g:1121:19: (lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur' )
            	    // InternalMyUno.g:1122:9: lv_cumul_carte_couleur_3_0= 'cumul_carte_couleur'
            	    {
            	    lv_cumul_carte_couleur_3_0=(Token)match(input,44,FOLLOW_44); 

            	    									newLeafNode(lv_cumul_carte_couleur_3_0, grammarAccess.getCumulAccess().getCumul_carte_couleurCumul_carte_couleurKeyword_2_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCumulRule());
            	    									}
            	    									setWithLastConsumed(current, "cumul_carte_couleur", lv_cumul_carte_couleur_3_0, "cumul_carte_couleur");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumulAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyUno.g:1139:3: ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1139:3: ({...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) ) )
            	    // InternalMyUno.g:1140:4: {...}? => ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalMyUno.g:1140:99: ( ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) ) )
            	    // InternalMyUno.g:1141:5: ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalMyUno.g:1144:8: ({...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) ) )
            	    // InternalMyUno.g:1144:9: {...}? => ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCumul", "true");
            	    }
            	    // InternalMyUno.g:1144:18: ( (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' ) )
            	    // InternalMyUno.g:1144:19: (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' )
            	    {
            	    // InternalMyUno.g:1144:19: (lv_cumul_carte_uno_4_0= 'cumul_carte_uno' )
            	    // InternalMyUno.g:1145:9: lv_cumul_carte_uno_4_0= 'cumul_carte_uno'
            	    {
            	    lv_cumul_carte_uno_4_0=(Token)match(input,45,FOLLOW_44); 

            	    									newLeafNode(lv_cumul_carte_uno_4_0, grammarAccess.getCumulAccess().getCumul_carte_unoCumul_carte_unoKeyword_3_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getCumulRule());
            	    									}
            	    									setWithLastConsumed(current, "cumul_carte_uno", lv_cumul_carte_uno_4_0, "cumul_carte_uno");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumulAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getCumulAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCumul"


    // $ANTLR start "entryRuleContestations"
    // InternalMyUno.g:1172:1: entryRuleContestations returns [EObject current=null] : iv_ruleContestations= ruleContestations EOF ;
    public final EObject entryRuleContestations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContestations = null;


        try {
            // InternalMyUno.g:1172:54: (iv_ruleContestations= ruleContestations EOF )
            // InternalMyUno.g:1173:2: iv_ruleContestations= ruleContestations EOF
            {
             newCompositeNode(grammarAccess.getContestationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContestations=ruleContestations();

            state._fsp--;

             current =iv_ruleContestations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContestations"


    // $ANTLR start "ruleContestations"
    // InternalMyUno.g:1179:1: ruleContestations returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) ) ) ;
    public final EObject ruleContestations() throws RecognitionException {
        EObject current = null;

        Token lv_inter_contestable_1_0=null;
        Token lv_plus4_contestable_2_0=null;


        	enterRule();

        try {
            // InternalMyUno.g:1185:2: ( ( ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) ) ) )
            // InternalMyUno.g:1186:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) ) )
            {
            // InternalMyUno.g:1186:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) ) )
            // InternalMyUno.g:1187:3: ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) )
            {
            // InternalMyUno.g:1187:3: ( ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* ) )
            // InternalMyUno.g:1188:4: ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getContestationsAccess().getUnorderedGroup());
            			
            // InternalMyUno.g:1191:4: ( ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )* )
            // InternalMyUno.g:1192:5: ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )*
            {
            // InternalMyUno.g:1192:5: ( ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) ) )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyUno.g:1193:3: ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1193:3: ({...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) ) )
            	    // InternalMyUno.g:1194:4: {...}? => ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMyUno.g:1194:107: ( ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) ) )
            	    // InternalMyUno.g:1195:5: ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalMyUno.g:1198:8: ({...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) ) )
            	    // InternalMyUno.g:1198:9: {...}? => ( (lv_inter_contestable_1_0= 'inter_contestable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "true");
            	    }
            	    // InternalMyUno.g:1198:18: ( (lv_inter_contestable_1_0= 'inter_contestable' ) )
            	    // InternalMyUno.g:1198:19: (lv_inter_contestable_1_0= 'inter_contestable' )
            	    {
            	    // InternalMyUno.g:1198:19: (lv_inter_contestable_1_0= 'inter_contestable' )
            	    // InternalMyUno.g:1199:9: lv_inter_contestable_1_0= 'inter_contestable'
            	    {
            	    lv_inter_contestable_1_0=(Token)match(input,46,FOLLOW_45); 

            	    									newLeafNode(lv_inter_contestable_1_0, grammarAccess.getContestationsAccess().getInter_contestableInter_contestableKeyword_0_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getContestationsRule());
            	    									}
            	    									setWithLastConsumed(current, "inter_contestable", lv_inter_contestable_1_0, "inter_contestable");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContestationsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyUno.g:1216:3: ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) )
            	    {
            	    // InternalMyUno.g:1216:3: ({...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) ) )
            	    // InternalMyUno.g:1217:4: {...}? => ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMyUno.g:1217:107: ( ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) ) )
            	    // InternalMyUno.g:1218:5: ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalMyUno.g:1221:8: ({...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) ) )
            	    // InternalMyUno.g:1221:9: {...}? => ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContestations", "true");
            	    }
            	    // InternalMyUno.g:1221:18: ( (lv_plus4_contestable_2_0= 'plus4_contestable' ) )
            	    // InternalMyUno.g:1221:19: (lv_plus4_contestable_2_0= 'plus4_contestable' )
            	    {
            	    // InternalMyUno.g:1221:19: (lv_plus4_contestable_2_0= 'plus4_contestable' )
            	    // InternalMyUno.g:1222:9: lv_plus4_contestable_2_0= 'plus4_contestable'
            	    {
            	    lv_plus4_contestable_2_0=(Token)match(input,47,FOLLOW_45); 

            	    									newLeafNode(lv_plus4_contestable_2_0, grammarAccess.getContestationsAccess().getPlus4_contestablePlus4_contestableKeyword_1_0());
            	    								

            	    									if (current==null) {
            	    										current = createModelElement(grammarAccess.getContestationsRule());
            	    									}
            	    									setWithLastConsumed(current, "plus4_contestable", lv_plus4_contestable_2_0, "plus4_contestable");
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContestationsAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getContestationsAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContestations"


    // $ANTLR start "entryRuleFin_Manche"
    // InternalMyUno.g:1249:1: entryRuleFin_Manche returns [EObject current=null] : iv_ruleFin_Manche= ruleFin_Manche EOF ;
    public final EObject entryRuleFin_Manche() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFin_Manche = null;


        try {
            // InternalMyUno.g:1249:51: (iv_ruleFin_Manche= ruleFin_Manche EOF )
            // InternalMyUno.g:1250:2: iv_ruleFin_Manche= ruleFin_Manche EOF
            {
             newCompositeNode(grammarAccess.getFin_MancheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFin_Manche=ruleFin_Manche();

            state._fsp--;

             current =iv_ruleFin_Manche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFin_Manche"


    // $ANTLR start "ruleFin_Manche"
    // InternalMyUno.g:1256:1: ruleFin_Manche returns [EObject current=null] : (otherlv_0= 'Fin_manche' otherlv_1= ':' ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )? ( (lv_points_manche_3_0= rulePoints_manche ) ) otherlv_4= ';' ) ;
    public final EObject ruleFin_Manche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_dire_uno_obligatoire_2_0=null;
        Token otherlv_4=null;
        EObject lv_points_manche_3_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:1262:2: ( (otherlv_0= 'Fin_manche' otherlv_1= ':' ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )? ( (lv_points_manche_3_0= rulePoints_manche ) ) otherlv_4= ';' ) )
            // InternalMyUno.g:1263:2: (otherlv_0= 'Fin_manche' otherlv_1= ':' ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )? ( (lv_points_manche_3_0= rulePoints_manche ) ) otherlv_4= ';' )
            {
            // InternalMyUno.g:1263:2: (otherlv_0= 'Fin_manche' otherlv_1= ':' ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )? ( (lv_points_manche_3_0= rulePoints_manche ) ) otherlv_4= ';' )
            // InternalMyUno.g:1264:3: otherlv_0= 'Fin_manche' otherlv_1= ':' ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )? ( (lv_points_manche_3_0= rulePoints_manche ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFin_MancheAccess().getFin_mancheKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getFin_MancheAccess().getColonKeyword_1());
            		
            // InternalMyUno.g:1272:3: ( (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyUno.g:1273:4: (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' )
                    {
                    // InternalMyUno.g:1273:4: (lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire' )
                    // InternalMyUno.g:1274:5: lv_dire_uno_obligatoire_2_0= 'dire_uno_obligatoire'
                    {
                    lv_dire_uno_obligatoire_2_0=(Token)match(input,49,FOLLOW_46); 

                    					newLeafNode(lv_dire_uno_obligatoire_2_0, grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireDire_uno_obligatoireKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFin_MancheRule());
                    					}
                    					setWithLastConsumed(current, "dire_uno_obligatoire", lv_dire_uno_obligatoire_2_0, "dire_uno_obligatoire");
                    				

                    }


                    }
                    break;

            }

            // InternalMyUno.g:1286:3: ( (lv_points_manche_3_0= rulePoints_manche ) )
            // InternalMyUno.g:1287:4: (lv_points_manche_3_0= rulePoints_manche )
            {
            // InternalMyUno.g:1287:4: (lv_points_manche_3_0= rulePoints_manche )
            // InternalMyUno.g:1288:5: lv_points_manche_3_0= rulePoints_manche
            {

            					newCompositeNode(grammarAccess.getFin_MancheAccess().getPoints_manchePoints_mancheParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_points_manche_3_0=rulePoints_manche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFin_MancheRule());
            					}
            					set(
            						current,
            						"points_manche",
            						lv_points_manche_3_0,
            						"org.xtexthheinle.uno.MyUno.Points_manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getFin_MancheAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFin_Manche"


    // $ANTLR start "entryRulePoints_manche"
    // InternalMyUno.g:1313:1: entryRulePoints_manche returns [EObject current=null] : iv_rulePoints_manche= rulePoints_manche EOF ;
    public final EObject entryRulePoints_manche() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoints_manche = null;


        try {
            // InternalMyUno.g:1313:54: (iv_rulePoints_manche= rulePoints_manche EOF )
            // InternalMyUno.g:1314:2: iv_rulePoints_manche= rulePoints_manche EOF
            {
             newCompositeNode(grammarAccess.getPoints_mancheRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoints_manche=rulePoints_manche();

            state._fsp--;

             current =iv_rulePoints_manche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoints_manche"


    // $ANTLR start "rulePoints_manche"
    // InternalMyUno.g:1320:1: rulePoints_manche returns [EObject current=null] : (otherlv_0= 'Points_manche' otherlv_1= '(' otherlv_2= 'vainqueur_manche:' ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) ) otherlv_4= 'perdants_manche:' ( (lv_perdants_manche_5_0= rulePerdants_manche ) ) otherlv_6= ')' ) ;
    public final EObject rulePoints_manche() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_vainqueur_manche_3_0 = null;

        EObject lv_perdants_manche_5_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:1326:2: ( (otherlv_0= 'Points_manche' otherlv_1= '(' otherlv_2= 'vainqueur_manche:' ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) ) otherlv_4= 'perdants_manche:' ( (lv_perdants_manche_5_0= rulePerdants_manche ) ) otherlv_6= ')' ) )
            // InternalMyUno.g:1327:2: (otherlv_0= 'Points_manche' otherlv_1= '(' otherlv_2= 'vainqueur_manche:' ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) ) otherlv_4= 'perdants_manche:' ( (lv_perdants_manche_5_0= rulePerdants_manche ) ) otherlv_6= ')' )
            {
            // InternalMyUno.g:1327:2: (otherlv_0= 'Points_manche' otherlv_1= '(' otherlv_2= 'vainqueur_manche:' ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) ) otherlv_4= 'perdants_manche:' ( (lv_perdants_manche_5_0= rulePerdants_manche ) ) otherlv_6= ')' )
            // InternalMyUno.g:1328:3: otherlv_0= 'Points_manche' otherlv_1= '(' otherlv_2= 'vainqueur_manche:' ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) ) otherlv_4= 'perdants_manche:' ( (lv_perdants_manche_5_0= rulePerdants_manche ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getPoints_mancheAccess().getPoints_mancheKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getPoints_mancheAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getPoints_mancheAccess().getVainqueur_mancheKeyword_2());
            		
            // InternalMyUno.g:1340:3: ( (lv_vainqueur_manche_3_0= ruleVainqueur_manche ) )
            // InternalMyUno.g:1341:4: (lv_vainqueur_manche_3_0= ruleVainqueur_manche )
            {
            // InternalMyUno.g:1341:4: (lv_vainqueur_manche_3_0= ruleVainqueur_manche )
            // InternalMyUno.g:1342:5: lv_vainqueur_manche_3_0= ruleVainqueur_manche
            {

            					newCompositeNode(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheVainqueur_mancheEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_vainqueur_manche_3_0=ruleVainqueur_manche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoints_mancheRule());
            					}
            					set(
            						current,
            						"vainqueur_manche",
            						lv_vainqueur_manche_3_0,
            						"org.xtexthheinle.uno.MyUno.Vainqueur_manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,52,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getPoints_mancheAccess().getPerdants_mancheKeyword_4());
            		
            // InternalMyUno.g:1363:3: ( (lv_perdants_manche_5_0= rulePerdants_manche ) )
            // InternalMyUno.g:1364:4: (lv_perdants_manche_5_0= rulePerdants_manche )
            {
            // InternalMyUno.g:1364:4: (lv_perdants_manche_5_0= rulePerdants_manche )
            // InternalMyUno.g:1365:5: lv_perdants_manche_5_0= rulePerdants_manche
            {

            					newCompositeNode(grammarAccess.getPoints_mancheAccess().getPerdants_manchePerdants_mancheParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_25);
            lv_perdants_manche_5_0=rulePerdants_manche();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPoints_mancheRule());
            					}
            					set(
            						current,
            						"perdants_manche",
            						lv_perdants_manche_5_0,
            						"org.xtexthheinle.uno.MyUno.Perdants_manche");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPoints_mancheAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoints_manche"


    // $ANTLR start "entryRulePerdants_manche"
    // InternalMyUno.g:1390:1: entryRulePerdants_manche returns [EObject current=null] : iv_rulePerdants_manche= rulePerdants_manche EOF ;
    public final EObject entryRulePerdants_manche() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerdants_manche = null;


        try {
            // InternalMyUno.g:1390:56: (iv_rulePerdants_manche= rulePerdants_manche EOF )
            // InternalMyUno.g:1391:2: iv_rulePerdants_manche= rulePerdants_manche EOF
            {
             newCompositeNode(grammarAccess.getPerdants_mancheRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerdants_manche=rulePerdants_manche();

            state._fsp--;

             current =iv_rulePerdants_manche; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerdants_manche"


    // $ANTLR start "rulePerdants_manche"
    // InternalMyUno.g:1397:1: rulePerdants_manche returns [EObject current=null] : ( () ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )? ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )? ) ;
    public final EObject rulePerdants_manche() throws RecognitionException {
        EObject current = null;

        Token lv_pm_zero_pts_1_0=null;
        Token lv_pm_pts_selon_cartes_restantes_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyUno.g:1403:2: ( ( () ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )? ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )? ) )
            // InternalMyUno.g:1404:2: ( () ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )? ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )? )
            {
            // InternalMyUno.g:1404:2: ( () ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )? ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )? )
            // InternalMyUno.g:1405:3: () ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )? ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )?
            {
            // InternalMyUno.g:1405:3: ()
            // InternalMyUno.g:1406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPerdants_mancheAccess().getPerdants_mancheAction_0(),
            					current);
            			

            }

            // InternalMyUno.g:1412:3: ( (lv_pm_zero_pts_1_0= 'pm_zero_pts' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyUno.g:1413:4: (lv_pm_zero_pts_1_0= 'pm_zero_pts' )
                    {
                    // InternalMyUno.g:1413:4: (lv_pm_zero_pts_1_0= 'pm_zero_pts' )
                    // InternalMyUno.g:1414:5: lv_pm_zero_pts_1_0= 'pm_zero_pts'
                    {
                    lv_pm_zero_pts_1_0=(Token)match(input,53,FOLLOW_51); 

                    					newLeafNode(lv_pm_zero_pts_1_0, grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsPm_zero_ptsKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPerdants_mancheRule());
                    					}
                    					setWithLastConsumed(current, "pm_zero_pts", lv_pm_zero_pts_1_0, "pm_zero_pts");
                    				

                    }


                    }
                    break;

            }

            // InternalMyUno.g:1426:3: ( ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )? )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==54) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyUno.g:1427:4: ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) ) (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )?
                    {
                    // InternalMyUno.g:1427:4: ( (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' ) )
                    // InternalMyUno.g:1428:5: (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' )
                    {
                    // InternalMyUno.g:1428:5: (lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes' )
                    // InternalMyUno.g:1429:6: lv_pm_pts_selon_cartes_restantes_2_0= 'pm_pts_selon_cartes_restantes'
                    {
                    lv_pm_pts_selon_cartes_restantes_2_0=(Token)match(input,54,FOLLOW_52); 

                    						newLeafNode(lv_pm_pts_selon_cartes_restantes_2_0, grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesPm_pts_selon_cartes_restantesKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPerdants_mancheRule());
                    						}
                    						setWithLastConsumed(current, "pm_pts_selon_cartes_restantes", lv_pm_pts_selon_cartes_restantes_2_0, "pm_pts_selon_cartes_restantes");
                    					

                    }


                    }

                    // InternalMyUno.g:1441:4: (otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==12) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalMyUno.g:1442:5: otherlv_3= '{' otherlv_4= 'elimination_si_500_pts' otherlv_5= '}'
                            {
                            otherlv_3=(Token)match(input,12,FOLLOW_53); 

                            					newLeafNode(otherlv_3, grammarAccess.getPerdants_mancheAccess().getLeftCurlyBracketKeyword_2_1_0());
                            				
                            otherlv_4=(Token)match(input,55,FOLLOW_9); 

                            					newLeafNode(otherlv_4, grammarAccess.getPerdants_mancheAccess().getElimination_si_500_ptsKeyword_2_1_1());
                            				
                            otherlv_5=(Token)match(input,13,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getPerdants_mancheAccess().getRightCurlyBracketKeyword_2_1_2());
                            				

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerdants_manche"


    // $ANTLR start "entryRuleFin_Partie"
    // InternalMyUno.g:1460:1: entryRuleFin_Partie returns [EObject current=null] : iv_ruleFin_Partie= ruleFin_Partie EOF ;
    public final EObject entryRuleFin_Partie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFin_Partie = null;


        try {
            // InternalMyUno.g:1460:51: (iv_ruleFin_Partie= ruleFin_Partie EOF )
            // InternalMyUno.g:1461:2: iv_ruleFin_Partie= ruleFin_Partie EOF
            {
             newCompositeNode(grammarAccess.getFin_PartieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFin_Partie=ruleFin_Partie();

            state._fsp--;

             current =iv_ruleFin_Partie; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFin_Partie"


    // $ANTLR start "ruleFin_Partie"
    // InternalMyUno.g:1467:1: ruleFin_Partie returns [EObject current=null] : (otherlv_0= 'Fin_Partie' otherlv_1= ':' otherlv_2= 'vainqueur_total' otherlv_3= '(' ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) ) otherlv_5= ')' otherlv_6= ';' ) ;
    public final EObject ruleFin_Partie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Enumerator lv_vainqueur_total_4_0 = null;



        	enterRule();

        try {
            // InternalMyUno.g:1473:2: ( (otherlv_0= 'Fin_Partie' otherlv_1= ':' otherlv_2= 'vainqueur_total' otherlv_3= '(' ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) ) otherlv_5= ')' otherlv_6= ';' ) )
            // InternalMyUno.g:1474:2: (otherlv_0= 'Fin_Partie' otherlv_1= ':' otherlv_2= 'vainqueur_total' otherlv_3= '(' ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) ) otherlv_5= ')' otherlv_6= ';' )
            {
            // InternalMyUno.g:1474:2: (otherlv_0= 'Fin_Partie' otherlv_1= ':' otherlv_2= 'vainqueur_total' otherlv_3= '(' ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) ) otherlv_5= ')' otherlv_6= ';' )
            // InternalMyUno.g:1475:3: otherlv_0= 'Fin_Partie' otherlv_1= ':' otherlv_2= 'vainqueur_total' otherlv_3= '(' ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) ) otherlv_5= ')' otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getFin_PartieAccess().getFin_PartieKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getFin_PartieAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getFin_PartieAccess().getVainqueur_totalKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getFin_PartieAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMyUno.g:1491:3: ( (lv_vainqueur_total_4_0= ruleVainqueur_total ) )
            // InternalMyUno.g:1492:4: (lv_vainqueur_total_4_0= ruleVainqueur_total )
            {
            // InternalMyUno.g:1492:4: (lv_vainqueur_total_4_0= ruleVainqueur_total )
            // InternalMyUno.g:1493:5: lv_vainqueur_total_4_0= ruleVainqueur_total
            {

            					newCompositeNode(grammarAccess.getFin_PartieAccess().getVainqueur_totalVainqueur_totalEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
            lv_vainqueur_total_4_0=ruleVainqueur_total();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFin_PartieRule());
            					}
            					set(
            						current,
            						"vainqueur_total",
            						lv_vainqueur_total_4_0,
            						"org.xtexthheinle.uno.MyUno.Vainqueur_total");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getFin_PartieAccess().getRightParenthesisKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFin_PartieAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFin_Partie"


    // $ANTLR start "ruleEtat_Main"
    // InternalMyUno.g:1522:1: ruleEtat_Main returns [Enumerator current=null] : ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) ) ;
    public final Enumerator ruleEtat_Main() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1528:2: ( ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) ) )
            // InternalMyUno.g:1529:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) )
            {
            // InternalMyUno.g:1529:2: ( (enumLiteral_0= 'visible' ) | (enumLiteral_1= 'cachee' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==58) ) {
                alt17=1;
            }
            else if ( (LA17_0==59) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyUno.g:1530:3: (enumLiteral_0= 'visible' )
                    {
                    // InternalMyUno.g:1530:3: (enumLiteral_0= 'visible' )
                    // InternalMyUno.g:1531:4: enumLiteral_0= 'visible'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getEtat_MainAccess().getVisibleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEtat_MainAccess().getVisibleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1538:3: (enumLiteral_1= 'cachee' )
                    {
                    // InternalMyUno.g:1538:3: (enumLiteral_1= 'cachee' )
                    // InternalMyUno.g:1539:4: enumLiteral_1= 'cachee'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getEtat_MainAccess().getCacheeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEtat_MainAccess().getCacheeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEtat_Main"


    // $ANTLR start "ruleNb_Mains"
    // InternalMyUno.g:1549:1: ruleNb_Mains returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) ;
    public final Enumerator ruleNb_Mains() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1555:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) )
            // InternalMyUno.g:1556:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            {
            // InternalMyUno.g:1556:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==60) ) {
                alt18=1;
            }
            else if ( (LA18_0==61) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyUno.g:1557:3: (enumLiteral_0= '1' )
                    {
                    // InternalMyUno.g:1557:3: (enumLiteral_0= '1' )
                    // InternalMyUno.g:1558:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNb_MainsAccess().getUne_mainEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNb_MainsAccess().getUne_mainEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1565:3: (enumLiteral_1= '3' )
                    {
                    // InternalMyUno.g:1565:3: (enumLiteral_1= '3' )
                    // InternalMyUno.g:1566:4: enumLiteral_1= '3'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNb_MainsAccess().getTrois_mainsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNb_MainsAccess().getTrois_mainsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNb_Mains"


    // $ANTLR start "ruleNb_Cartes_Mains"
    // InternalMyUno.g:1576:1: ruleNb_Cartes_Mains returns [Enumerator current=null] : ( (enumLiteral_0= '7' ) | (enumLiteral_1= '4' ) | (enumLiteral_2= '5' ) ) ;
    public final Enumerator ruleNb_Cartes_Mains() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyUno.g:1582:2: ( ( (enumLiteral_0= '7' ) | (enumLiteral_1= '4' ) | (enumLiteral_2= '5' ) ) )
            // InternalMyUno.g:1583:2: ( (enumLiteral_0= '7' ) | (enumLiteral_1= '4' ) | (enumLiteral_2= '5' ) )
            {
            // InternalMyUno.g:1583:2: ( (enumLiteral_0= '7' ) | (enumLiteral_1= '4' ) | (enumLiteral_2= '5' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt19=1;
                }
                break;
            case 63:
                {
                alt19=2;
                }
                break;
            case 64:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMyUno.g:1584:3: (enumLiteral_0= '7' )
                    {
                    // InternalMyUno.g:1584:3: (enumLiteral_0= '7' )
                    // InternalMyUno.g:1585:4: enumLiteral_0= '7'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getNb_Cartes_MainsAccess().getSept_cartesEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNb_Cartes_MainsAccess().getSept_cartesEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1592:3: (enumLiteral_1= '4' )
                    {
                    // InternalMyUno.g:1592:3: (enumLiteral_1= '4' )
                    // InternalMyUno.g:1593:4: enumLiteral_1= '4'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getNb_Cartes_MainsAccess().getQuatre_cartesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNb_Cartes_MainsAccess().getQuatre_cartesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:1600:3: (enumLiteral_2= '5' )
                    {
                    // InternalMyUno.g:1600:3: (enumLiteral_2= '5' )
                    // InternalMyUno.g:1601:4: enumLiteral_2= '5'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getNb_Cartes_MainsAccess().getCinq_cartesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNb_Cartes_MainsAccess().getCinq_cartesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNb_Cartes_Mains"


    // $ANTLR start "ruleNb_Talons"
    // InternalMyUno.g:1611:1: ruleNb_Talons returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) ;
    public final Enumerator ruleNb_Talons() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1617:2: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) ) )
            // InternalMyUno.g:1618:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            {
            // InternalMyUno.g:1618:2: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '3' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==60) ) {
                alt20=1;
            }
            else if ( (LA20_0==61) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyUno.g:1619:3: (enumLiteral_0= '1' )
                    {
                    // InternalMyUno.g:1619:3: (enumLiteral_0= '1' )
                    // InternalMyUno.g:1620:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getNb_TalonsAccess().getUn_talonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNb_TalonsAccess().getUn_talonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1627:3: (enumLiteral_1= '3' )
                    {
                    // InternalMyUno.g:1627:3: (enumLiteral_1= '3' )
                    // InternalMyUno.g:1628:4: enumLiteral_1= '3'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getNb_TalonsAccess().getTrois_talonsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNb_TalonsAccess().getTrois_talonsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNb_Talons"


    // $ANTLR start "ruleNb_cartes_jouables"
    // InternalMyUno.g:1638:1: ruleNb_cartes_jouables returns [Enumerator current=null] : ( (enumLiteral_0= 'une_par_une' ) | (enumLiteral_1= 'plusieurs_a_la_fois_autorise' ) ) ;
    public final Enumerator ruleNb_cartes_jouables() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1644:2: ( ( (enumLiteral_0= 'une_par_une' ) | (enumLiteral_1= 'plusieurs_a_la_fois_autorise' ) ) )
            // InternalMyUno.g:1645:2: ( (enumLiteral_0= 'une_par_une' ) | (enumLiteral_1= 'plusieurs_a_la_fois_autorise' ) )
            {
            // InternalMyUno.g:1645:2: ( (enumLiteral_0= 'une_par_une' ) | (enumLiteral_1= 'plusieurs_a_la_fois_autorise' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==65) ) {
                alt21=1;
            }
            else if ( (LA21_0==66) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyUno.g:1646:3: (enumLiteral_0= 'une_par_une' )
                    {
                    // InternalMyUno.g:1646:3: (enumLiteral_0= 'une_par_une' )
                    // InternalMyUno.g:1647:4: enumLiteral_0= 'une_par_une'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getNb_cartes_jouablesAccess().getUne_par_uneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNb_cartes_jouablesAccess().getUne_par_uneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1654:3: (enumLiteral_1= 'plusieurs_a_la_fois_autorise' )
                    {
                    // InternalMyUno.g:1654:3: (enumLiteral_1= 'plusieurs_a_la_fois_autorise' )
                    // InternalMyUno.g:1655:4: enumLiteral_1= 'plusieurs_a_la_fois_autorise'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getNb_cartes_jouablesAccess().getPlusieurs_a_la_fois_autoriseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNb_cartes_jouablesAccess().getPlusieurs_a_la_fois_autoriseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNb_cartes_jouables"


    // $ANTLR start "ruleInterception"
    // InternalMyUno.g:1665:1: ruleInterception returns [Enumerator current=null] : ( (enumLiteral_0= 'mm_nb' ) | (enumLiteral_1= 'mm_couleur' ) | (enumLiteral_2= 'mm_nb_couleur' ) ) ;
    public final Enumerator ruleInterception() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyUno.g:1671:2: ( ( (enumLiteral_0= 'mm_nb' ) | (enumLiteral_1= 'mm_couleur' ) | (enumLiteral_2= 'mm_nb_couleur' ) ) )
            // InternalMyUno.g:1672:2: ( (enumLiteral_0= 'mm_nb' ) | (enumLiteral_1= 'mm_couleur' ) | (enumLiteral_2= 'mm_nb_couleur' ) )
            {
            // InternalMyUno.g:1672:2: ( (enumLiteral_0= 'mm_nb' ) | (enumLiteral_1= 'mm_couleur' ) | (enumLiteral_2= 'mm_nb_couleur' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt22=1;
                }
                break;
            case 68:
                {
                alt22=2;
                }
                break;
            case 69:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyUno.g:1673:3: (enumLiteral_0= 'mm_nb' )
                    {
                    // InternalMyUno.g:1673:3: (enumLiteral_0= 'mm_nb' )
                    // InternalMyUno.g:1674:4: enumLiteral_0= 'mm_nb'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getInterceptionAccess().getMm_nbEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getInterceptionAccess().getMm_nbEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1681:3: (enumLiteral_1= 'mm_couleur' )
                    {
                    // InternalMyUno.g:1681:3: (enumLiteral_1= 'mm_couleur' )
                    // InternalMyUno.g:1682:4: enumLiteral_1= 'mm_couleur'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getInterceptionAccess().getMm_couleurEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getInterceptionAccess().getMm_couleurEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:1689:3: (enumLiteral_2= 'mm_nb_couleur' )
                    {
                    // InternalMyUno.g:1689:3: (enumLiteral_2= 'mm_nb_couleur' )
                    // InternalMyUno.g:1690:4: enumLiteral_2= 'mm_nb_couleur'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getInterceptionAccess().getMm_nb_couleurEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getInterceptionAccess().getMm_nb_couleurEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterception"


    // $ANTLR start "ruleNb_cartes_a_piocher"
    // InternalMyUno.g:1700:1: ruleNb_cartes_a_piocher returns [Enumerator current=null] : ( (enumLiteral_0= 'une_seule' ) | (enumLiteral_1= 'au_plus_trois' ) ) ;
    public final Enumerator ruleNb_cartes_a_piocher() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1706:2: ( ( (enumLiteral_0= 'une_seule' ) | (enumLiteral_1= 'au_plus_trois' ) ) )
            // InternalMyUno.g:1707:2: ( (enumLiteral_0= 'une_seule' ) | (enumLiteral_1= 'au_plus_trois' ) )
            {
            // InternalMyUno.g:1707:2: ( (enumLiteral_0= 'une_seule' ) | (enumLiteral_1= 'au_plus_trois' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==70) ) {
                alt23=1;
            }
            else if ( (LA23_0==71) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyUno.g:1708:3: (enumLiteral_0= 'une_seule' )
                    {
                    // InternalMyUno.g:1708:3: (enumLiteral_0= 'une_seule' )
                    // InternalMyUno.g:1709:4: enumLiteral_0= 'une_seule'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getNb_cartes_a_piocherAccess().getUne_seuleEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNb_cartes_a_piocherAccess().getUne_seuleEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1716:3: (enumLiteral_1= 'au_plus_trois' )
                    {
                    // InternalMyUno.g:1716:3: (enumLiteral_1= 'au_plus_trois' )
                    // InternalMyUno.g:1717:4: enumLiteral_1= 'au_plus_trois'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getNb_cartes_a_piocherAccess().getAu_plus_troisEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNb_cartes_a_piocherAccess().getAu_plus_troisEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNb_cartes_a_piocher"


    // $ANTLR start "ruleJouer_apres_pioche"
    // InternalMyUno.g:1727:1: ruleJouer_apres_pioche returns [Enumerator current=null] : ( (enumLiteral_0= 'droit_de_jouer' ) | (enumLiteral_1= 'pas_droit_de_jouer' ) ) ;
    public final Enumerator ruleJouer_apres_pioche() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyUno.g:1733:2: ( ( (enumLiteral_0= 'droit_de_jouer' ) | (enumLiteral_1= 'pas_droit_de_jouer' ) ) )
            // InternalMyUno.g:1734:2: ( (enumLiteral_0= 'droit_de_jouer' ) | (enumLiteral_1= 'pas_droit_de_jouer' ) )
            {
            // InternalMyUno.g:1734:2: ( (enumLiteral_0= 'droit_de_jouer' ) | (enumLiteral_1= 'pas_droit_de_jouer' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==72) ) {
                alt24=1;
            }
            else if ( (LA24_0==73) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyUno.g:1735:3: (enumLiteral_0= 'droit_de_jouer' )
                    {
                    // InternalMyUno.g:1735:3: (enumLiteral_0= 'droit_de_jouer' )
                    // InternalMyUno.g:1736:4: enumLiteral_0= 'droit_de_jouer'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getJouer_apres_piocheAccess().getDroit_de_jouerEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getJouer_apres_piocheAccess().getDroit_de_jouerEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1743:3: (enumLiteral_1= 'pas_droit_de_jouer' )
                    {
                    // InternalMyUno.g:1743:3: (enumLiteral_1= 'pas_droit_de_jouer' )
                    // InternalMyUno.g:1744:4: enumLiteral_1= 'pas_droit_de_jouer'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getJouer_apres_piocheAccess().getPas_droit_de_jouerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getJouer_apres_piocheAccess().getPas_droit_de_jouerEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJouer_apres_pioche"


    // $ANTLR start "ruleVainqueur_manche"
    // InternalMyUno.g:1754:1: ruleVainqueur_manche returns [Enumerator current=null] : ( (enumLiteral_0= 'manche_gagnee' ) | (enumLiteral_1= 'vm_pts_selon_carte_adversaires' ) | (enumLiteral_2= 'vm_zero_pts' ) ) ;
    public final Enumerator ruleVainqueur_manche() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyUno.g:1760:2: ( ( (enumLiteral_0= 'manche_gagnee' ) | (enumLiteral_1= 'vm_pts_selon_carte_adversaires' ) | (enumLiteral_2= 'vm_zero_pts' ) ) )
            // InternalMyUno.g:1761:2: ( (enumLiteral_0= 'manche_gagnee' ) | (enumLiteral_1= 'vm_pts_selon_carte_adversaires' ) | (enumLiteral_2= 'vm_zero_pts' ) )
            {
            // InternalMyUno.g:1761:2: ( (enumLiteral_0= 'manche_gagnee' ) | (enumLiteral_1= 'vm_pts_selon_carte_adversaires' ) | (enumLiteral_2= 'vm_zero_pts' ) )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt25=1;
                }
                break;
            case 75:
                {
                alt25=2;
                }
                break;
            case 76:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMyUno.g:1762:3: (enumLiteral_0= 'manche_gagnee' )
                    {
                    // InternalMyUno.g:1762:3: (enumLiteral_0= 'manche_gagnee' )
                    // InternalMyUno.g:1763:4: enumLiteral_0= 'manche_gagnee'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_mancheAccess().getManche_gagneeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVainqueur_mancheAccess().getManche_gagneeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1770:3: (enumLiteral_1= 'vm_pts_selon_carte_adversaires' )
                    {
                    // InternalMyUno.g:1770:3: (enumLiteral_1= 'vm_pts_selon_carte_adversaires' )
                    // InternalMyUno.g:1771:4: enumLiteral_1= 'vm_pts_selon_carte_adversaires'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_mancheAccess().getVm_pts_selon_carte_adversairesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVainqueur_mancheAccess().getVm_pts_selon_carte_adversairesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:1778:3: (enumLiteral_2= 'vm_zero_pts' )
                    {
                    // InternalMyUno.g:1778:3: (enumLiteral_2= 'vm_zero_pts' )
                    // InternalMyUno.g:1779:4: enumLiteral_2= 'vm_zero_pts'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_mancheAccess().getVm_zero_ptsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVainqueur_mancheAccess().getVm_zero_ptsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVainqueur_manche"


    // $ANTLR start "ruleVainqueur_total"
    // InternalMyUno.g:1789:1: ruleVainqueur_total returns [Enumerator current=null] : ( (enumLiteral_0= 'score_le_plus_grd' ) | (enumLiteral_1= 'nb_manches_gagnees' ) | (enumLiteral_2= 'moins_de_500_pts' ) | (enumLiteral_3= 'score_le_plus_petit' ) ) ;
    public final Enumerator ruleVainqueur_total() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyUno.g:1795:2: ( ( (enumLiteral_0= 'score_le_plus_grd' ) | (enumLiteral_1= 'nb_manches_gagnees' ) | (enumLiteral_2= 'moins_de_500_pts' ) | (enumLiteral_3= 'score_le_plus_petit' ) ) )
            // InternalMyUno.g:1796:2: ( (enumLiteral_0= 'score_le_plus_grd' ) | (enumLiteral_1= 'nb_manches_gagnees' ) | (enumLiteral_2= 'moins_de_500_pts' ) | (enumLiteral_3= 'score_le_plus_petit' ) )
            {
            // InternalMyUno.g:1796:2: ( (enumLiteral_0= 'score_le_plus_grd' ) | (enumLiteral_1= 'nb_manches_gagnees' ) | (enumLiteral_2= 'moins_de_500_pts' ) | (enumLiteral_3= 'score_le_plus_petit' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt26=1;
                }
                break;
            case 78:
                {
                alt26=2;
                }
                break;
            case 79:
                {
                alt26=3;
                }
                break;
            case 80:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalMyUno.g:1797:3: (enumLiteral_0= 'score_le_plus_grd' )
                    {
                    // InternalMyUno.g:1797:3: (enumLiteral_0= 'score_le_plus_grd' )
                    // InternalMyUno.g:1798:4: enumLiteral_0= 'score_le_plus_grd'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_totalAccess().getScore_le_plus_grdEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVainqueur_totalAccess().getScore_le_plus_grdEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:1805:3: (enumLiteral_1= 'nb_manches_gagnees' )
                    {
                    // InternalMyUno.g:1805:3: (enumLiteral_1= 'nb_manches_gagnees' )
                    // InternalMyUno.g:1806:4: enumLiteral_1= 'nb_manches_gagnees'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_totalAccess().getNb_manches_gagneesEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVainqueur_totalAccess().getNb_manches_gagneesEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:1813:3: (enumLiteral_2= 'moins_de_500_pts' )
                    {
                    // InternalMyUno.g:1813:3: (enumLiteral_2= 'moins_de_500_pts' )
                    // InternalMyUno.g:1814:4: enumLiteral_2= 'moins_de_500_pts'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_totalAccess().getMoins_de_500_ptsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVainqueur_totalAccess().getMoins_de_500_ptsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUno.g:1821:3: (enumLiteral_3= 'score_le_plus_petit' )
                    {
                    // InternalMyUno.g:1821:3: (enumLiteral_3= 'score_le_plus_petit' )
                    // InternalMyUno.g:1822:4: enumLiteral_3= 'score_le_plus_petit'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getVainqueur_totalAccess().getScore_le_plus_petitEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVainqueur_totalAccess().getScore_le_plus_petitEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVainqueur_total"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000019000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000304000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C04000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000007004000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000C0040000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00003C0004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000080040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00004000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000007000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00003C0000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0060000004000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x000000000001E000L});

}
