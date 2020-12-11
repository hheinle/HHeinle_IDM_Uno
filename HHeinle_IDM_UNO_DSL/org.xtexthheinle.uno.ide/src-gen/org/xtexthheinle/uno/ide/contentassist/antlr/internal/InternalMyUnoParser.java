package org.xtexthheinle.uno.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtexthheinle.uno.services.MyUnoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyUnoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'visible'", "'cachee'", "'1'", "'3'", "'7'", "'4'", "'5'", "'une_par_une'", "'plusieurs_a_la_fois_autorise'", "'mm_nb'", "'mm_couleur'", "'mm_nb_couleur'", "'une_seule'", "'au_plus_trois'", "'droit_de_jouer'", "'pas_droit_de_jouer'", "'manche_gagnee'", "'vm_pts_selon_carte_adversaires'", "'vm_zero_pts'", "'score_le_plus_grd'", "'nb_manches_gagnees'", "'moins_de_500_pts'", "'score_le_plus_petit'", "'nom_variante'", "'{'", "'}'", "'Depart'", "':'", "';'", "'etat_main'", "'nb_mains'", "'nb_cartes_main'", "'nb_talons'", "'Manche'", "'Nb_cartes_jouables'", "'('", "')'", "'Inversion'", "'Tourner_mains'", "'Cartes_1_a_9'", "'Cumul'", "'Contestations'", "'interception'", "'Pioche'", "'nb_cartes_a_piocher:'", "'jouer_apres_pioche:'", "'Fin_manche'", "'Points_manche'", "'vainqueur_manche:'", "'perdants_manche:'", "'elimination_si_500_pts'", "'Fin_Partie'", "'vainqueur_total'", "'riviere'", "'temps_limite:'", "'avec_carte_inversion'", "'avec_carte_sept'", "'avec_carte_zero'", "'avec_carte_uno'", "'suites'", "'suites_royales'", "'cumul_plus_2'", "'cumul_plus_4'", "'cumul_carte_couleur'", "'cumul_carte_uno'", "'inter_contestable'", "'plus4_contestable'", "'dire_uno_obligatoire'", "'pm_zero_pts'", "'pm_pts_selon_cartes_restantes'"
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

    	public void setGrammarAccess(MyUnoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleVariante_UNO"
    // InternalMyUno.g:53:1: entryRuleVariante_UNO : ruleVariante_UNO EOF ;
    public final void entryRuleVariante_UNO() throws RecognitionException {
        try {
            // InternalMyUno.g:54:1: ( ruleVariante_UNO EOF )
            // InternalMyUno.g:55:1: ruleVariante_UNO EOF
            {
             before(grammarAccess.getVariante_UNORule()); 
            pushFollow(FOLLOW_1);
            ruleVariante_UNO();

            state._fsp--;

             after(grammarAccess.getVariante_UNORule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariante_UNO"


    // $ANTLR start "ruleVariante_UNO"
    // InternalMyUno.g:62:1: ruleVariante_UNO : ( ( rule__Variante_UNO__Group__0 ) ) ;
    public final void ruleVariante_UNO() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:66:2: ( ( ( rule__Variante_UNO__Group__0 ) ) )
            // InternalMyUno.g:67:2: ( ( rule__Variante_UNO__Group__0 ) )
            {
            // InternalMyUno.g:67:2: ( ( rule__Variante_UNO__Group__0 ) )
            // InternalMyUno.g:68:3: ( rule__Variante_UNO__Group__0 )
            {
             before(grammarAccess.getVariante_UNOAccess().getGroup()); 
            // InternalMyUno.g:69:3: ( rule__Variante_UNO__Group__0 )
            // InternalMyUno.g:69:4: rule__Variante_UNO__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariante_UNO"


    // $ANTLR start "entryRuleConfiguration_Depart"
    // InternalMyUno.g:78:1: entryRuleConfiguration_Depart : ruleConfiguration_Depart EOF ;
    public final void entryRuleConfiguration_Depart() throws RecognitionException {
        try {
            // InternalMyUno.g:79:1: ( ruleConfiguration_Depart EOF )
            // InternalMyUno.g:80:1: ruleConfiguration_Depart EOF
            {
             before(grammarAccess.getConfiguration_DepartRule()); 
            pushFollow(FOLLOW_1);
            ruleConfiguration_Depart();

            state._fsp--;

             after(grammarAccess.getConfiguration_DepartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConfiguration_Depart"


    // $ANTLR start "ruleConfiguration_Depart"
    // InternalMyUno.g:87:1: ruleConfiguration_Depart : ( ( rule__Configuration_Depart__Group__0 ) ) ;
    public final void ruleConfiguration_Depart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:91:2: ( ( ( rule__Configuration_Depart__Group__0 ) ) )
            // InternalMyUno.g:92:2: ( ( rule__Configuration_Depart__Group__0 ) )
            {
            // InternalMyUno.g:92:2: ( ( rule__Configuration_Depart__Group__0 ) )
            // InternalMyUno.g:93:3: ( rule__Configuration_Depart__Group__0 )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getGroup()); 
            // InternalMyUno.g:94:3: ( rule__Configuration_Depart__Group__0 )
            // InternalMyUno.g:94:4: rule__Configuration_Depart__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_DepartAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConfiguration_Depart"


    // $ANTLR start "entryRuleMain"
    // InternalMyUno.g:103:1: entryRuleMain : ruleMain EOF ;
    public final void entryRuleMain() throws RecognitionException {
        try {
            // InternalMyUno.g:104:1: ( ruleMain EOF )
            // InternalMyUno.g:105:1: ruleMain EOF
            {
             before(grammarAccess.getMainRule()); 
            pushFollow(FOLLOW_1);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getMainRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMain"


    // $ANTLR start "ruleMain"
    // InternalMyUno.g:112:1: ruleMain : ( ( rule__Main__Group__0 ) ) ;
    public final void ruleMain() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:116:2: ( ( ( rule__Main__Group__0 ) ) )
            // InternalMyUno.g:117:2: ( ( rule__Main__Group__0 ) )
            {
            // InternalMyUno.g:117:2: ( ( rule__Main__Group__0 ) )
            // InternalMyUno.g:118:3: ( rule__Main__Group__0 )
            {
             before(grammarAccess.getMainAccess().getGroup()); 
            // InternalMyUno.g:119:3: ( rule__Main__Group__0 )
            // InternalMyUno.g:119:4: rule__Main__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMain"


    // $ANTLR start "entryRuleTalon"
    // InternalMyUno.g:128:1: entryRuleTalon : ruleTalon EOF ;
    public final void entryRuleTalon() throws RecognitionException {
        try {
            // InternalMyUno.g:129:1: ( ruleTalon EOF )
            // InternalMyUno.g:130:1: ruleTalon EOF
            {
             before(grammarAccess.getTalonRule()); 
            pushFollow(FOLLOW_1);
            ruleTalon();

            state._fsp--;

             after(grammarAccess.getTalonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTalon"


    // $ANTLR start "ruleTalon"
    // InternalMyUno.g:137:1: ruleTalon : ( ( rule__Talon__Group__0 ) ) ;
    public final void ruleTalon() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:141:2: ( ( ( rule__Talon__Group__0 ) ) )
            // InternalMyUno.g:142:2: ( ( rule__Talon__Group__0 ) )
            {
            // InternalMyUno.g:142:2: ( ( rule__Talon__Group__0 ) )
            // InternalMyUno.g:143:3: ( rule__Talon__Group__0 )
            {
             before(grammarAccess.getTalonAccess().getGroup()); 
            // InternalMyUno.g:144:3: ( rule__Talon__Group__0 )
            // InternalMyUno.g:144:4: rule__Talon__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Talon__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTalonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTalon"


    // $ANTLR start "entryRuleManche"
    // InternalMyUno.g:153:1: entryRuleManche : ruleManche EOF ;
    public final void entryRuleManche() throws RecognitionException {
        try {
            // InternalMyUno.g:154:1: ( ruleManche EOF )
            // InternalMyUno.g:155:1: ruleManche EOF
            {
             before(grammarAccess.getMancheRule()); 
            pushFollow(FOLLOW_1);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getMancheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleManche"


    // $ANTLR start "ruleManche"
    // InternalMyUno.g:162:1: ruleManche : ( ( rule__Manche__Group__0 ) ) ;
    public final void ruleManche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:166:2: ( ( ( rule__Manche__Group__0 ) ) )
            // InternalMyUno.g:167:2: ( ( rule__Manche__Group__0 ) )
            {
            // InternalMyUno.g:167:2: ( ( rule__Manche__Group__0 ) )
            // InternalMyUno.g:168:3: ( rule__Manche__Group__0 )
            {
             before(grammarAccess.getMancheAccess().getGroup()); 
            // InternalMyUno.g:169:3: ( rule__Manche__Group__0 )
            // InternalMyUno.g:169:4: rule__Manche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleManche"


    // $ANTLR start "entryRuleInversion"
    // InternalMyUno.g:178:1: entryRuleInversion : ruleInversion EOF ;
    public final void entryRuleInversion() throws RecognitionException {
        try {
            // InternalMyUno.g:179:1: ( ruleInversion EOF )
            // InternalMyUno.g:180:1: ruleInversion EOF
            {
             before(grammarAccess.getInversionRule()); 
            pushFollow(FOLLOW_1);
            ruleInversion();

            state._fsp--;

             after(grammarAccess.getInversionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInversion"


    // $ANTLR start "ruleInversion"
    // InternalMyUno.g:187:1: ruleInversion : ( ( rule__Inversion__UnorderedGroup ) ) ;
    public final void ruleInversion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:191:2: ( ( ( rule__Inversion__UnorderedGroup ) ) )
            // InternalMyUno.g:192:2: ( ( rule__Inversion__UnorderedGroup ) )
            {
            // InternalMyUno.g:192:2: ( ( rule__Inversion__UnorderedGroup ) )
            // InternalMyUno.g:193:3: ( rule__Inversion__UnorderedGroup )
            {
             before(grammarAccess.getInversionAccess().getUnorderedGroup()); 
            // InternalMyUno.g:194:3: ( rule__Inversion__UnorderedGroup )
            // InternalMyUno.g:194:4: rule__Inversion__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Inversion__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getInversionAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInversion"


    // $ANTLR start "entryRuleTourner_les_mains"
    // InternalMyUno.g:203:1: entryRuleTourner_les_mains : ruleTourner_les_mains EOF ;
    public final void entryRuleTourner_les_mains() throws RecognitionException {
        try {
            // InternalMyUno.g:204:1: ( ruleTourner_les_mains EOF )
            // InternalMyUno.g:205:1: ruleTourner_les_mains EOF
            {
             before(grammarAccess.getTourner_les_mainsRule()); 
            pushFollow(FOLLOW_1);
            ruleTourner_les_mains();

            state._fsp--;

             after(grammarAccess.getTourner_les_mainsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTourner_les_mains"


    // $ANTLR start "ruleTourner_les_mains"
    // InternalMyUno.g:212:1: ruleTourner_les_mains : ( ( rule__Tourner_les_mains__UnorderedGroup ) ) ;
    public final void ruleTourner_les_mains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:216:2: ( ( ( rule__Tourner_les_mains__UnorderedGroup ) ) )
            // InternalMyUno.g:217:2: ( ( rule__Tourner_les_mains__UnorderedGroup ) )
            {
            // InternalMyUno.g:217:2: ( ( rule__Tourner_les_mains__UnorderedGroup ) )
            // InternalMyUno.g:218:3: ( rule__Tourner_les_mains__UnorderedGroup )
            {
             before(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup()); 
            // InternalMyUno.g:219:3: ( rule__Tourner_les_mains__UnorderedGroup )
            // InternalMyUno.g:219:4: rule__Tourner_les_mains__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Tourner_les_mains__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTourner_les_mains"


    // $ANTLR start "entryRuleCartes_1_9"
    // InternalMyUno.g:228:1: entryRuleCartes_1_9 : ruleCartes_1_9 EOF ;
    public final void entryRuleCartes_1_9() throws RecognitionException {
        try {
            // InternalMyUno.g:229:1: ( ruleCartes_1_9 EOF )
            // InternalMyUno.g:230:1: ruleCartes_1_9 EOF
            {
             before(grammarAccess.getCartes_1_9Rule()); 
            pushFollow(FOLLOW_1);
            ruleCartes_1_9();

            state._fsp--;

             after(grammarAccess.getCartes_1_9Rule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCartes_1_9"


    // $ANTLR start "ruleCartes_1_9"
    // InternalMyUno.g:237:1: ruleCartes_1_9 : ( ( rule__Cartes_1_9__UnorderedGroup ) ) ;
    public final void ruleCartes_1_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:241:2: ( ( ( rule__Cartes_1_9__UnorderedGroup ) ) )
            // InternalMyUno.g:242:2: ( ( rule__Cartes_1_9__UnorderedGroup ) )
            {
            // InternalMyUno.g:242:2: ( ( rule__Cartes_1_9__UnorderedGroup ) )
            // InternalMyUno.g:243:3: ( rule__Cartes_1_9__UnorderedGroup )
            {
             before(grammarAccess.getCartes_1_9Access().getUnorderedGroup()); 
            // InternalMyUno.g:244:3: ( rule__Cartes_1_9__UnorderedGroup )
            // InternalMyUno.g:244:4: rule__Cartes_1_9__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getCartes_1_9Access().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCartes_1_9"


    // $ANTLR start "entryRulePioche"
    // InternalMyUno.g:253:1: entryRulePioche : rulePioche EOF ;
    public final void entryRulePioche() throws RecognitionException {
        try {
            // InternalMyUno.g:254:1: ( rulePioche EOF )
            // InternalMyUno.g:255:1: rulePioche EOF
            {
             before(grammarAccess.getPiocheRule()); 
            pushFollow(FOLLOW_1);
            rulePioche();

            state._fsp--;

             after(grammarAccess.getPiocheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePioche"


    // $ANTLR start "rulePioche"
    // InternalMyUno.g:262:1: rulePioche : ( ( rule__Pioche__Group__0 ) ) ;
    public final void rulePioche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:266:2: ( ( ( rule__Pioche__Group__0 ) ) )
            // InternalMyUno.g:267:2: ( ( rule__Pioche__Group__0 ) )
            {
            // InternalMyUno.g:267:2: ( ( rule__Pioche__Group__0 ) )
            // InternalMyUno.g:268:3: ( rule__Pioche__Group__0 )
            {
             before(grammarAccess.getPiocheAccess().getGroup()); 
            // InternalMyUno.g:269:3: ( rule__Pioche__Group__0 )
            // InternalMyUno.g:269:4: rule__Pioche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pioche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPiocheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePioche"


    // $ANTLR start "entryRuleCumul"
    // InternalMyUno.g:278:1: entryRuleCumul : ruleCumul EOF ;
    public final void entryRuleCumul() throws RecognitionException {
        try {
            // InternalMyUno.g:279:1: ( ruleCumul EOF )
            // InternalMyUno.g:280:1: ruleCumul EOF
            {
             before(grammarAccess.getCumulRule()); 
            pushFollow(FOLLOW_1);
            ruleCumul();

            state._fsp--;

             after(grammarAccess.getCumulRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCumul"


    // $ANTLR start "ruleCumul"
    // InternalMyUno.g:287:1: ruleCumul : ( ( rule__Cumul__UnorderedGroup ) ) ;
    public final void ruleCumul() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:291:2: ( ( ( rule__Cumul__UnorderedGroup ) ) )
            // InternalMyUno.g:292:2: ( ( rule__Cumul__UnorderedGroup ) )
            {
            // InternalMyUno.g:292:2: ( ( rule__Cumul__UnorderedGroup ) )
            // InternalMyUno.g:293:3: ( rule__Cumul__UnorderedGroup )
            {
             before(grammarAccess.getCumulAccess().getUnorderedGroup()); 
            // InternalMyUno.g:294:3: ( rule__Cumul__UnorderedGroup )
            // InternalMyUno.g:294:4: rule__Cumul__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Cumul__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getCumulAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCumul"


    // $ANTLR start "entryRuleContestations"
    // InternalMyUno.g:303:1: entryRuleContestations : ruleContestations EOF ;
    public final void entryRuleContestations() throws RecognitionException {
        try {
            // InternalMyUno.g:304:1: ( ruleContestations EOF )
            // InternalMyUno.g:305:1: ruleContestations EOF
            {
             before(grammarAccess.getContestationsRule()); 
            pushFollow(FOLLOW_1);
            ruleContestations();

            state._fsp--;

             after(grammarAccess.getContestationsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContestations"


    // $ANTLR start "ruleContestations"
    // InternalMyUno.g:312:1: ruleContestations : ( ( rule__Contestations__UnorderedGroup ) ) ;
    public final void ruleContestations() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:316:2: ( ( ( rule__Contestations__UnorderedGroup ) ) )
            // InternalMyUno.g:317:2: ( ( rule__Contestations__UnorderedGroup ) )
            {
            // InternalMyUno.g:317:2: ( ( rule__Contestations__UnorderedGroup ) )
            // InternalMyUno.g:318:3: ( rule__Contestations__UnorderedGroup )
            {
             before(grammarAccess.getContestationsAccess().getUnorderedGroup()); 
            // InternalMyUno.g:319:3: ( rule__Contestations__UnorderedGroup )
            // InternalMyUno.g:319:4: rule__Contestations__UnorderedGroup
            {
            pushFollow(FOLLOW_2);
            rule__Contestations__UnorderedGroup();

            state._fsp--;


            }

             after(grammarAccess.getContestationsAccess().getUnorderedGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContestations"


    // $ANTLR start "entryRuleFin_Manche"
    // InternalMyUno.g:328:1: entryRuleFin_Manche : ruleFin_Manche EOF ;
    public final void entryRuleFin_Manche() throws RecognitionException {
        try {
            // InternalMyUno.g:329:1: ( ruleFin_Manche EOF )
            // InternalMyUno.g:330:1: ruleFin_Manche EOF
            {
             before(grammarAccess.getFin_MancheRule()); 
            pushFollow(FOLLOW_1);
            ruleFin_Manche();

            state._fsp--;

             after(grammarAccess.getFin_MancheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFin_Manche"


    // $ANTLR start "ruleFin_Manche"
    // InternalMyUno.g:337:1: ruleFin_Manche : ( ( rule__Fin_Manche__Group__0 ) ) ;
    public final void ruleFin_Manche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:341:2: ( ( ( rule__Fin_Manche__Group__0 ) ) )
            // InternalMyUno.g:342:2: ( ( rule__Fin_Manche__Group__0 ) )
            {
            // InternalMyUno.g:342:2: ( ( rule__Fin_Manche__Group__0 ) )
            // InternalMyUno.g:343:3: ( rule__Fin_Manche__Group__0 )
            {
             before(grammarAccess.getFin_MancheAccess().getGroup()); 
            // InternalMyUno.g:344:3: ( rule__Fin_Manche__Group__0 )
            // InternalMyUno.g:344:4: rule__Fin_Manche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFin_MancheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFin_Manche"


    // $ANTLR start "entryRulePoints_manche"
    // InternalMyUno.g:353:1: entryRulePoints_manche : rulePoints_manche EOF ;
    public final void entryRulePoints_manche() throws RecognitionException {
        try {
            // InternalMyUno.g:354:1: ( rulePoints_manche EOF )
            // InternalMyUno.g:355:1: rulePoints_manche EOF
            {
             before(grammarAccess.getPoints_mancheRule()); 
            pushFollow(FOLLOW_1);
            rulePoints_manche();

            state._fsp--;

             after(grammarAccess.getPoints_mancheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePoints_manche"


    // $ANTLR start "rulePoints_manche"
    // InternalMyUno.g:362:1: rulePoints_manche : ( ( rule__Points_manche__Group__0 ) ) ;
    public final void rulePoints_manche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:366:2: ( ( ( rule__Points_manche__Group__0 ) ) )
            // InternalMyUno.g:367:2: ( ( rule__Points_manche__Group__0 ) )
            {
            // InternalMyUno.g:367:2: ( ( rule__Points_manche__Group__0 ) )
            // InternalMyUno.g:368:3: ( rule__Points_manche__Group__0 )
            {
             before(grammarAccess.getPoints_mancheAccess().getGroup()); 
            // InternalMyUno.g:369:3: ( rule__Points_manche__Group__0 )
            // InternalMyUno.g:369:4: rule__Points_manche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPoints_mancheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePoints_manche"


    // $ANTLR start "entryRulePerdants_manche"
    // InternalMyUno.g:378:1: entryRulePerdants_manche : rulePerdants_manche EOF ;
    public final void entryRulePerdants_manche() throws RecognitionException {
        try {
            // InternalMyUno.g:379:1: ( rulePerdants_manche EOF )
            // InternalMyUno.g:380:1: rulePerdants_manche EOF
            {
             before(grammarAccess.getPerdants_mancheRule()); 
            pushFollow(FOLLOW_1);
            rulePerdants_manche();

            state._fsp--;

             after(grammarAccess.getPerdants_mancheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerdants_manche"


    // $ANTLR start "rulePerdants_manche"
    // InternalMyUno.g:387:1: rulePerdants_manche : ( ( rule__Perdants_manche__Group__0 ) ) ;
    public final void rulePerdants_manche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:391:2: ( ( ( rule__Perdants_manche__Group__0 ) ) )
            // InternalMyUno.g:392:2: ( ( rule__Perdants_manche__Group__0 ) )
            {
            // InternalMyUno.g:392:2: ( ( rule__Perdants_manche__Group__0 ) )
            // InternalMyUno.g:393:3: ( rule__Perdants_manche__Group__0 )
            {
             before(grammarAccess.getPerdants_mancheAccess().getGroup()); 
            // InternalMyUno.g:394:3: ( rule__Perdants_manche__Group__0 )
            // InternalMyUno.g:394:4: rule__Perdants_manche__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPerdants_mancheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerdants_manche"


    // $ANTLR start "entryRuleFin_Partie"
    // InternalMyUno.g:403:1: entryRuleFin_Partie : ruleFin_Partie EOF ;
    public final void entryRuleFin_Partie() throws RecognitionException {
        try {
            // InternalMyUno.g:404:1: ( ruleFin_Partie EOF )
            // InternalMyUno.g:405:1: ruleFin_Partie EOF
            {
             before(grammarAccess.getFin_PartieRule()); 
            pushFollow(FOLLOW_1);
            ruleFin_Partie();

            state._fsp--;

             after(grammarAccess.getFin_PartieRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFin_Partie"


    // $ANTLR start "ruleFin_Partie"
    // InternalMyUno.g:412:1: ruleFin_Partie : ( ( rule__Fin_Partie__Group__0 ) ) ;
    public final void ruleFin_Partie() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:416:2: ( ( ( rule__Fin_Partie__Group__0 ) ) )
            // InternalMyUno.g:417:2: ( ( rule__Fin_Partie__Group__0 ) )
            {
            // InternalMyUno.g:417:2: ( ( rule__Fin_Partie__Group__0 ) )
            // InternalMyUno.g:418:3: ( rule__Fin_Partie__Group__0 )
            {
             before(grammarAccess.getFin_PartieAccess().getGroup()); 
            // InternalMyUno.g:419:3: ( rule__Fin_Partie__Group__0 )
            // InternalMyUno.g:419:4: rule__Fin_Partie__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFin_PartieAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFin_Partie"


    // $ANTLR start "ruleEtat_Main"
    // InternalMyUno.g:428:1: ruleEtat_Main : ( ( rule__Etat_Main__Alternatives ) ) ;
    public final void ruleEtat_Main() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:432:1: ( ( ( rule__Etat_Main__Alternatives ) ) )
            // InternalMyUno.g:433:2: ( ( rule__Etat_Main__Alternatives ) )
            {
            // InternalMyUno.g:433:2: ( ( rule__Etat_Main__Alternatives ) )
            // InternalMyUno.g:434:3: ( rule__Etat_Main__Alternatives )
            {
             before(grammarAccess.getEtat_MainAccess().getAlternatives()); 
            // InternalMyUno.g:435:3: ( rule__Etat_Main__Alternatives )
            // InternalMyUno.g:435:4: rule__Etat_Main__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Etat_Main__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEtat_MainAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEtat_Main"


    // $ANTLR start "ruleNb_Mains"
    // InternalMyUno.g:444:1: ruleNb_Mains : ( ( rule__Nb_Mains__Alternatives ) ) ;
    public final void ruleNb_Mains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:448:1: ( ( ( rule__Nb_Mains__Alternatives ) ) )
            // InternalMyUno.g:449:2: ( ( rule__Nb_Mains__Alternatives ) )
            {
            // InternalMyUno.g:449:2: ( ( rule__Nb_Mains__Alternatives ) )
            // InternalMyUno.g:450:3: ( rule__Nb_Mains__Alternatives )
            {
             before(grammarAccess.getNb_MainsAccess().getAlternatives()); 
            // InternalMyUno.g:451:3: ( rule__Nb_Mains__Alternatives )
            // InternalMyUno.g:451:4: rule__Nb_Mains__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nb_Mains__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNb_MainsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNb_Mains"


    // $ANTLR start "ruleNb_Cartes_Mains"
    // InternalMyUno.g:460:1: ruleNb_Cartes_Mains : ( ( rule__Nb_Cartes_Mains__Alternatives ) ) ;
    public final void ruleNb_Cartes_Mains() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:464:1: ( ( ( rule__Nb_Cartes_Mains__Alternatives ) ) )
            // InternalMyUno.g:465:2: ( ( rule__Nb_Cartes_Mains__Alternatives ) )
            {
            // InternalMyUno.g:465:2: ( ( rule__Nb_Cartes_Mains__Alternatives ) )
            // InternalMyUno.g:466:3: ( rule__Nb_Cartes_Mains__Alternatives )
            {
             before(grammarAccess.getNb_Cartes_MainsAccess().getAlternatives()); 
            // InternalMyUno.g:467:3: ( rule__Nb_Cartes_Mains__Alternatives )
            // InternalMyUno.g:467:4: rule__Nb_Cartes_Mains__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nb_Cartes_Mains__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNb_Cartes_MainsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNb_Cartes_Mains"


    // $ANTLR start "ruleNb_Talons"
    // InternalMyUno.g:476:1: ruleNb_Talons : ( ( rule__Nb_Talons__Alternatives ) ) ;
    public final void ruleNb_Talons() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:480:1: ( ( ( rule__Nb_Talons__Alternatives ) ) )
            // InternalMyUno.g:481:2: ( ( rule__Nb_Talons__Alternatives ) )
            {
            // InternalMyUno.g:481:2: ( ( rule__Nb_Talons__Alternatives ) )
            // InternalMyUno.g:482:3: ( rule__Nb_Talons__Alternatives )
            {
             before(grammarAccess.getNb_TalonsAccess().getAlternatives()); 
            // InternalMyUno.g:483:3: ( rule__Nb_Talons__Alternatives )
            // InternalMyUno.g:483:4: rule__Nb_Talons__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nb_Talons__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNb_TalonsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNb_Talons"


    // $ANTLR start "ruleNb_cartes_jouables"
    // InternalMyUno.g:492:1: ruleNb_cartes_jouables : ( ( rule__Nb_cartes_jouables__Alternatives ) ) ;
    public final void ruleNb_cartes_jouables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:496:1: ( ( ( rule__Nb_cartes_jouables__Alternatives ) ) )
            // InternalMyUno.g:497:2: ( ( rule__Nb_cartes_jouables__Alternatives ) )
            {
            // InternalMyUno.g:497:2: ( ( rule__Nb_cartes_jouables__Alternatives ) )
            // InternalMyUno.g:498:3: ( rule__Nb_cartes_jouables__Alternatives )
            {
             before(grammarAccess.getNb_cartes_jouablesAccess().getAlternatives()); 
            // InternalMyUno.g:499:3: ( rule__Nb_cartes_jouables__Alternatives )
            // InternalMyUno.g:499:4: rule__Nb_cartes_jouables__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nb_cartes_jouables__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNb_cartes_jouablesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNb_cartes_jouables"


    // $ANTLR start "ruleInterception"
    // InternalMyUno.g:508:1: ruleInterception : ( ( rule__Interception__Alternatives ) ) ;
    public final void ruleInterception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:512:1: ( ( ( rule__Interception__Alternatives ) ) )
            // InternalMyUno.g:513:2: ( ( rule__Interception__Alternatives ) )
            {
            // InternalMyUno.g:513:2: ( ( rule__Interception__Alternatives ) )
            // InternalMyUno.g:514:3: ( rule__Interception__Alternatives )
            {
             before(grammarAccess.getInterceptionAccess().getAlternatives()); 
            // InternalMyUno.g:515:3: ( rule__Interception__Alternatives )
            // InternalMyUno.g:515:4: rule__Interception__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Interception__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInterceptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInterception"


    // $ANTLR start "ruleNb_cartes_a_piocher"
    // InternalMyUno.g:524:1: ruleNb_cartes_a_piocher : ( ( rule__Nb_cartes_a_piocher__Alternatives ) ) ;
    public final void ruleNb_cartes_a_piocher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:528:1: ( ( ( rule__Nb_cartes_a_piocher__Alternatives ) ) )
            // InternalMyUno.g:529:2: ( ( rule__Nb_cartes_a_piocher__Alternatives ) )
            {
            // InternalMyUno.g:529:2: ( ( rule__Nb_cartes_a_piocher__Alternatives ) )
            // InternalMyUno.g:530:3: ( rule__Nb_cartes_a_piocher__Alternatives )
            {
             before(grammarAccess.getNb_cartes_a_piocherAccess().getAlternatives()); 
            // InternalMyUno.g:531:3: ( rule__Nb_cartes_a_piocher__Alternatives )
            // InternalMyUno.g:531:4: rule__Nb_cartes_a_piocher__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Nb_cartes_a_piocher__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNb_cartes_a_piocherAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNb_cartes_a_piocher"


    // $ANTLR start "ruleJouer_apres_pioche"
    // InternalMyUno.g:540:1: ruleJouer_apres_pioche : ( ( rule__Jouer_apres_pioche__Alternatives ) ) ;
    public final void ruleJouer_apres_pioche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:544:1: ( ( ( rule__Jouer_apres_pioche__Alternatives ) ) )
            // InternalMyUno.g:545:2: ( ( rule__Jouer_apres_pioche__Alternatives ) )
            {
            // InternalMyUno.g:545:2: ( ( rule__Jouer_apres_pioche__Alternatives ) )
            // InternalMyUno.g:546:3: ( rule__Jouer_apres_pioche__Alternatives )
            {
             before(grammarAccess.getJouer_apres_piocheAccess().getAlternatives()); 
            // InternalMyUno.g:547:3: ( rule__Jouer_apres_pioche__Alternatives )
            // InternalMyUno.g:547:4: rule__Jouer_apres_pioche__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Jouer_apres_pioche__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getJouer_apres_piocheAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJouer_apres_pioche"


    // $ANTLR start "ruleVainqueur_manche"
    // InternalMyUno.g:556:1: ruleVainqueur_manche : ( ( rule__Vainqueur_manche__Alternatives ) ) ;
    public final void ruleVainqueur_manche() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:560:1: ( ( ( rule__Vainqueur_manche__Alternatives ) ) )
            // InternalMyUno.g:561:2: ( ( rule__Vainqueur_manche__Alternatives ) )
            {
            // InternalMyUno.g:561:2: ( ( rule__Vainqueur_manche__Alternatives ) )
            // InternalMyUno.g:562:3: ( rule__Vainqueur_manche__Alternatives )
            {
             before(grammarAccess.getVainqueur_mancheAccess().getAlternatives()); 
            // InternalMyUno.g:563:3: ( rule__Vainqueur_manche__Alternatives )
            // InternalMyUno.g:563:4: rule__Vainqueur_manche__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Vainqueur_manche__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVainqueur_mancheAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVainqueur_manche"


    // $ANTLR start "ruleVainqueur_total"
    // InternalMyUno.g:572:1: ruleVainqueur_total : ( ( rule__Vainqueur_total__Alternatives ) ) ;
    public final void ruleVainqueur_total() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:576:1: ( ( ( rule__Vainqueur_total__Alternatives ) ) )
            // InternalMyUno.g:577:2: ( ( rule__Vainqueur_total__Alternatives ) )
            {
            // InternalMyUno.g:577:2: ( ( rule__Vainqueur_total__Alternatives ) )
            // InternalMyUno.g:578:3: ( rule__Vainqueur_total__Alternatives )
            {
             before(grammarAccess.getVainqueur_totalAccess().getAlternatives()); 
            // InternalMyUno.g:579:3: ( rule__Vainqueur_total__Alternatives )
            // InternalMyUno.g:579:4: rule__Vainqueur_total__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Vainqueur_total__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVainqueur_totalAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVainqueur_total"


    // $ANTLR start "rule__Etat_Main__Alternatives"
    // InternalMyUno.g:587:1: rule__Etat_Main__Alternatives : ( ( ( 'visible' ) ) | ( ( 'cachee' ) ) );
    public final void rule__Etat_Main__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:591:1: ( ( ( 'visible' ) ) | ( ( 'cachee' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyUno.g:592:2: ( ( 'visible' ) )
                    {
                    // InternalMyUno.g:592:2: ( ( 'visible' ) )
                    // InternalMyUno.g:593:3: ( 'visible' )
                    {
                     before(grammarAccess.getEtat_MainAccess().getVisibleEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:594:3: ( 'visible' )
                    // InternalMyUno.g:594:4: 'visible'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtat_MainAccess().getVisibleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:598:2: ( ( 'cachee' ) )
                    {
                    // InternalMyUno.g:598:2: ( ( 'cachee' ) )
                    // InternalMyUno.g:599:3: ( 'cachee' )
                    {
                     before(grammarAccess.getEtat_MainAccess().getCacheeEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:600:3: ( 'cachee' )
                    // InternalMyUno.g:600:4: 'cachee'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getEtat_MainAccess().getCacheeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Etat_Main__Alternatives"


    // $ANTLR start "rule__Nb_Mains__Alternatives"
    // InternalMyUno.g:608:1: rule__Nb_Mains__Alternatives : ( ( ( '1' ) ) | ( ( '3' ) ) );
    public final void rule__Nb_Mains__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:612:1: ( ( ( '1' ) ) | ( ( '3' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyUno.g:613:2: ( ( '1' ) )
                    {
                    // InternalMyUno.g:613:2: ( ( '1' ) )
                    // InternalMyUno.g:614:3: ( '1' )
                    {
                     before(grammarAccess.getNb_MainsAccess().getUne_mainEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:615:3: ( '1' )
                    // InternalMyUno.g:615:4: '1'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_MainsAccess().getUne_mainEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:619:2: ( ( '3' ) )
                    {
                    // InternalMyUno.g:619:2: ( ( '3' ) )
                    // InternalMyUno.g:620:3: ( '3' )
                    {
                     before(grammarAccess.getNb_MainsAccess().getTrois_mainsEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:621:3: ( '3' )
                    // InternalMyUno.g:621:4: '3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_MainsAccess().getTrois_mainsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nb_Mains__Alternatives"


    // $ANTLR start "rule__Nb_Cartes_Mains__Alternatives"
    // InternalMyUno.g:629:1: rule__Nb_Cartes_Mains__Alternatives : ( ( ( '7' ) ) | ( ( '4' ) ) | ( ( '5' ) ) );
    public final void rule__Nb_Cartes_Mains__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:633:1: ( ( ( '7' ) ) | ( ( '4' ) ) | ( ( '5' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyUno.g:634:2: ( ( '7' ) )
                    {
                    // InternalMyUno.g:634:2: ( ( '7' ) )
                    // InternalMyUno.g:635:3: ( '7' )
                    {
                     before(grammarAccess.getNb_Cartes_MainsAccess().getSept_cartesEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:636:3: ( '7' )
                    // InternalMyUno.g:636:4: '7'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_Cartes_MainsAccess().getSept_cartesEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:640:2: ( ( '4' ) )
                    {
                    // InternalMyUno.g:640:2: ( ( '4' ) )
                    // InternalMyUno.g:641:3: ( '4' )
                    {
                     before(grammarAccess.getNb_Cartes_MainsAccess().getQuatre_cartesEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:642:3: ( '4' )
                    // InternalMyUno.g:642:4: '4'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_Cartes_MainsAccess().getQuatre_cartesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:646:2: ( ( '5' ) )
                    {
                    // InternalMyUno.g:646:2: ( ( '5' ) )
                    // InternalMyUno.g:647:3: ( '5' )
                    {
                     before(grammarAccess.getNb_Cartes_MainsAccess().getCinq_cartesEnumLiteralDeclaration_2()); 
                    // InternalMyUno.g:648:3: ( '5' )
                    // InternalMyUno.g:648:4: '5'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_Cartes_MainsAccess().getCinq_cartesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nb_Cartes_Mains__Alternatives"


    // $ANTLR start "rule__Nb_Talons__Alternatives"
    // InternalMyUno.g:656:1: rule__Nb_Talons__Alternatives : ( ( ( '1' ) ) | ( ( '3' ) ) );
    public final void rule__Nb_Talons__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:660:1: ( ( ( '1' ) ) | ( ( '3' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyUno.g:661:2: ( ( '1' ) )
                    {
                    // InternalMyUno.g:661:2: ( ( '1' ) )
                    // InternalMyUno.g:662:3: ( '1' )
                    {
                     before(grammarAccess.getNb_TalonsAccess().getUn_talonEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:663:3: ( '1' )
                    // InternalMyUno.g:663:4: '1'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_TalonsAccess().getUn_talonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:667:2: ( ( '3' ) )
                    {
                    // InternalMyUno.g:667:2: ( ( '3' ) )
                    // InternalMyUno.g:668:3: ( '3' )
                    {
                     before(grammarAccess.getNb_TalonsAccess().getTrois_talonsEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:669:3: ( '3' )
                    // InternalMyUno.g:669:4: '3'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_TalonsAccess().getTrois_talonsEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nb_Talons__Alternatives"


    // $ANTLR start "rule__Nb_cartes_jouables__Alternatives"
    // InternalMyUno.g:677:1: rule__Nb_cartes_jouables__Alternatives : ( ( ( 'une_par_une' ) ) | ( ( 'plusieurs_a_la_fois_autorise' ) ) );
    public final void rule__Nb_cartes_jouables__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:681:1: ( ( ( 'une_par_une' ) ) | ( ( 'plusieurs_a_la_fois_autorise' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyUno.g:682:2: ( ( 'une_par_une' ) )
                    {
                    // InternalMyUno.g:682:2: ( ( 'une_par_une' ) )
                    // InternalMyUno.g:683:3: ( 'une_par_une' )
                    {
                     before(grammarAccess.getNb_cartes_jouablesAccess().getUne_par_uneEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:684:3: ( 'une_par_une' )
                    // InternalMyUno.g:684:4: 'une_par_une'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_cartes_jouablesAccess().getUne_par_uneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:688:2: ( ( 'plusieurs_a_la_fois_autorise' ) )
                    {
                    // InternalMyUno.g:688:2: ( ( 'plusieurs_a_la_fois_autorise' ) )
                    // InternalMyUno.g:689:3: ( 'plusieurs_a_la_fois_autorise' )
                    {
                     before(grammarAccess.getNb_cartes_jouablesAccess().getPlusieurs_a_la_fois_autoriseEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:690:3: ( 'plusieurs_a_la_fois_autorise' )
                    // InternalMyUno.g:690:4: 'plusieurs_a_la_fois_autorise'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_cartes_jouablesAccess().getPlusieurs_a_la_fois_autoriseEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nb_cartes_jouables__Alternatives"


    // $ANTLR start "rule__Interception__Alternatives"
    // InternalMyUno.g:698:1: rule__Interception__Alternatives : ( ( ( 'mm_nb' ) ) | ( ( 'mm_couleur' ) ) | ( ( 'mm_nb_couleur' ) ) );
    public final void rule__Interception__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:702:1: ( ( ( 'mm_nb' ) ) | ( ( 'mm_couleur' ) ) | ( ( 'mm_nb_couleur' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyUno.g:703:2: ( ( 'mm_nb' ) )
                    {
                    // InternalMyUno.g:703:2: ( ( 'mm_nb' ) )
                    // InternalMyUno.g:704:3: ( 'mm_nb' )
                    {
                     before(grammarAccess.getInterceptionAccess().getMm_nbEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:705:3: ( 'mm_nb' )
                    // InternalMyUno.g:705:4: 'mm_nb'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getInterceptionAccess().getMm_nbEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:709:2: ( ( 'mm_couleur' ) )
                    {
                    // InternalMyUno.g:709:2: ( ( 'mm_couleur' ) )
                    // InternalMyUno.g:710:3: ( 'mm_couleur' )
                    {
                     before(grammarAccess.getInterceptionAccess().getMm_couleurEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:711:3: ( 'mm_couleur' )
                    // InternalMyUno.g:711:4: 'mm_couleur'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getInterceptionAccess().getMm_couleurEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:715:2: ( ( 'mm_nb_couleur' ) )
                    {
                    // InternalMyUno.g:715:2: ( ( 'mm_nb_couleur' ) )
                    // InternalMyUno.g:716:3: ( 'mm_nb_couleur' )
                    {
                     before(grammarAccess.getInterceptionAccess().getMm_nb_couleurEnumLiteralDeclaration_2()); 
                    // InternalMyUno.g:717:3: ( 'mm_nb_couleur' )
                    // InternalMyUno.g:717:4: 'mm_nb_couleur'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getInterceptionAccess().getMm_nb_couleurEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Interception__Alternatives"


    // $ANTLR start "rule__Nb_cartes_a_piocher__Alternatives"
    // InternalMyUno.g:725:1: rule__Nb_cartes_a_piocher__Alternatives : ( ( ( 'une_seule' ) ) | ( ( 'au_plus_trois' ) ) );
    public final void rule__Nb_cartes_a_piocher__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:729:1: ( ( ( 'une_seule' ) ) | ( ( 'au_plus_trois' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            else if ( (LA7_0==24) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyUno.g:730:2: ( ( 'une_seule' ) )
                    {
                    // InternalMyUno.g:730:2: ( ( 'une_seule' ) )
                    // InternalMyUno.g:731:3: ( 'une_seule' )
                    {
                     before(grammarAccess.getNb_cartes_a_piocherAccess().getUne_seuleEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:732:3: ( 'une_seule' )
                    // InternalMyUno.g:732:4: 'une_seule'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_cartes_a_piocherAccess().getUne_seuleEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:736:2: ( ( 'au_plus_trois' ) )
                    {
                    // InternalMyUno.g:736:2: ( ( 'au_plus_trois' ) )
                    // InternalMyUno.g:737:3: ( 'au_plus_trois' )
                    {
                     before(grammarAccess.getNb_cartes_a_piocherAccess().getAu_plus_troisEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:738:3: ( 'au_plus_trois' )
                    // InternalMyUno.g:738:4: 'au_plus_trois'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getNb_cartes_a_piocherAccess().getAu_plus_troisEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Nb_cartes_a_piocher__Alternatives"


    // $ANTLR start "rule__Jouer_apres_pioche__Alternatives"
    // InternalMyUno.g:746:1: rule__Jouer_apres_pioche__Alternatives : ( ( ( 'droit_de_jouer' ) ) | ( ( 'pas_droit_de_jouer' ) ) );
    public final void rule__Jouer_apres_pioche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:750:1: ( ( ( 'droit_de_jouer' ) ) | ( ( 'pas_droit_de_jouer' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            else if ( (LA8_0==26) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyUno.g:751:2: ( ( 'droit_de_jouer' ) )
                    {
                    // InternalMyUno.g:751:2: ( ( 'droit_de_jouer' ) )
                    // InternalMyUno.g:752:3: ( 'droit_de_jouer' )
                    {
                     before(grammarAccess.getJouer_apres_piocheAccess().getDroit_de_jouerEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:753:3: ( 'droit_de_jouer' )
                    // InternalMyUno.g:753:4: 'droit_de_jouer'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getJouer_apres_piocheAccess().getDroit_de_jouerEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:757:2: ( ( 'pas_droit_de_jouer' ) )
                    {
                    // InternalMyUno.g:757:2: ( ( 'pas_droit_de_jouer' ) )
                    // InternalMyUno.g:758:3: ( 'pas_droit_de_jouer' )
                    {
                     before(grammarAccess.getJouer_apres_piocheAccess().getPas_droit_de_jouerEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:759:3: ( 'pas_droit_de_jouer' )
                    // InternalMyUno.g:759:4: 'pas_droit_de_jouer'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getJouer_apres_piocheAccess().getPas_droit_de_jouerEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Jouer_apres_pioche__Alternatives"


    // $ANTLR start "rule__Vainqueur_manche__Alternatives"
    // InternalMyUno.g:767:1: rule__Vainqueur_manche__Alternatives : ( ( ( 'manche_gagnee' ) ) | ( ( 'vm_pts_selon_carte_adversaires' ) ) | ( ( 'vm_zero_pts' ) ) );
    public final void rule__Vainqueur_manche__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:771:1: ( ( ( 'manche_gagnee' ) ) | ( ( 'vm_pts_selon_carte_adversaires' ) ) | ( ( 'vm_zero_pts' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt9=1;
                }
                break;
            case 28:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyUno.g:772:2: ( ( 'manche_gagnee' ) )
                    {
                    // InternalMyUno.g:772:2: ( ( 'manche_gagnee' ) )
                    // InternalMyUno.g:773:3: ( 'manche_gagnee' )
                    {
                     before(grammarAccess.getVainqueur_mancheAccess().getManche_gagneeEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:774:3: ( 'manche_gagnee' )
                    // InternalMyUno.g:774:4: 'manche_gagnee'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_mancheAccess().getManche_gagneeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:778:2: ( ( 'vm_pts_selon_carte_adversaires' ) )
                    {
                    // InternalMyUno.g:778:2: ( ( 'vm_pts_selon_carte_adversaires' ) )
                    // InternalMyUno.g:779:3: ( 'vm_pts_selon_carte_adversaires' )
                    {
                     before(grammarAccess.getVainqueur_mancheAccess().getVm_pts_selon_carte_adversairesEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:780:3: ( 'vm_pts_selon_carte_adversaires' )
                    // InternalMyUno.g:780:4: 'vm_pts_selon_carte_adversaires'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_mancheAccess().getVm_pts_selon_carte_adversairesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:784:2: ( ( 'vm_zero_pts' ) )
                    {
                    // InternalMyUno.g:784:2: ( ( 'vm_zero_pts' ) )
                    // InternalMyUno.g:785:3: ( 'vm_zero_pts' )
                    {
                     before(grammarAccess.getVainqueur_mancheAccess().getVm_zero_ptsEnumLiteralDeclaration_2()); 
                    // InternalMyUno.g:786:3: ( 'vm_zero_pts' )
                    // InternalMyUno.g:786:4: 'vm_zero_pts'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_mancheAccess().getVm_zero_ptsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vainqueur_manche__Alternatives"


    // $ANTLR start "rule__Vainqueur_total__Alternatives"
    // InternalMyUno.g:794:1: rule__Vainqueur_total__Alternatives : ( ( ( 'score_le_plus_grd' ) ) | ( ( 'nb_manches_gagnees' ) ) | ( ( 'moins_de_500_pts' ) ) | ( ( 'score_le_plus_petit' ) ) );
    public final void rule__Vainqueur_total__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:798:1: ( ( ( 'score_le_plus_grd' ) ) | ( ( 'nb_manches_gagnees' ) ) | ( ( 'moins_de_500_pts' ) ) | ( ( 'score_le_plus_petit' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyUno.g:799:2: ( ( 'score_le_plus_grd' ) )
                    {
                    // InternalMyUno.g:799:2: ( ( 'score_le_plus_grd' ) )
                    // InternalMyUno.g:800:3: ( 'score_le_plus_grd' )
                    {
                     before(grammarAccess.getVainqueur_totalAccess().getScore_le_plus_grdEnumLiteralDeclaration_0()); 
                    // InternalMyUno.g:801:3: ( 'score_le_plus_grd' )
                    // InternalMyUno.g:801:4: 'score_le_plus_grd'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_totalAccess().getScore_le_plus_grdEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:805:2: ( ( 'nb_manches_gagnees' ) )
                    {
                    // InternalMyUno.g:805:2: ( ( 'nb_manches_gagnees' ) )
                    // InternalMyUno.g:806:3: ( 'nb_manches_gagnees' )
                    {
                     before(grammarAccess.getVainqueur_totalAccess().getNb_manches_gagneesEnumLiteralDeclaration_1()); 
                    // InternalMyUno.g:807:3: ( 'nb_manches_gagnees' )
                    // InternalMyUno.g:807:4: 'nb_manches_gagnees'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_totalAccess().getNb_manches_gagneesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:811:2: ( ( 'moins_de_500_pts' ) )
                    {
                    // InternalMyUno.g:811:2: ( ( 'moins_de_500_pts' ) )
                    // InternalMyUno.g:812:3: ( 'moins_de_500_pts' )
                    {
                     before(grammarAccess.getVainqueur_totalAccess().getMoins_de_500_ptsEnumLiteralDeclaration_2()); 
                    // InternalMyUno.g:813:3: ( 'moins_de_500_pts' )
                    // InternalMyUno.g:813:4: 'moins_de_500_pts'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_totalAccess().getMoins_de_500_ptsEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyUno.g:817:2: ( ( 'score_le_plus_petit' ) )
                    {
                    // InternalMyUno.g:817:2: ( ( 'score_le_plus_petit' ) )
                    // InternalMyUno.g:818:3: ( 'score_le_plus_petit' )
                    {
                     before(grammarAccess.getVainqueur_totalAccess().getScore_le_plus_petitEnumLiteralDeclaration_3()); 
                    // InternalMyUno.g:819:3: ( 'score_le_plus_petit' )
                    // InternalMyUno.g:819:4: 'score_le_plus_petit'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVainqueur_totalAccess().getScore_le_plus_petitEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Vainqueur_total__Alternatives"


    // $ANTLR start "rule__Variante_UNO__Group__0"
    // InternalMyUno.g:827:1: rule__Variante_UNO__Group__0 : rule__Variante_UNO__Group__0__Impl rule__Variante_UNO__Group__1 ;
    public final void rule__Variante_UNO__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:831:1: ( rule__Variante_UNO__Group__0__Impl rule__Variante_UNO__Group__1 )
            // InternalMyUno.g:832:2: rule__Variante_UNO__Group__0__Impl rule__Variante_UNO__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Variante_UNO__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__0"


    // $ANTLR start "rule__Variante_UNO__Group__0__Impl"
    // InternalMyUno.g:839:1: rule__Variante_UNO__Group__0__Impl : ( 'nom_variante' ) ;
    public final void rule__Variante_UNO__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:843:1: ( ( 'nom_variante' ) )
            // InternalMyUno.g:844:1: ( 'nom_variante' )
            {
            // InternalMyUno.g:844:1: ( 'nom_variante' )
            // InternalMyUno.g:845:2: 'nom_variante'
            {
             before(grammarAccess.getVariante_UNOAccess().getNom_varianteKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVariante_UNOAccess().getNom_varianteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__0__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__1"
    // InternalMyUno.g:854:1: rule__Variante_UNO__Group__1 : rule__Variante_UNO__Group__1__Impl rule__Variante_UNO__Group__2 ;
    public final void rule__Variante_UNO__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:858:1: ( rule__Variante_UNO__Group__1__Impl rule__Variante_UNO__Group__2 )
            // InternalMyUno.g:859:2: rule__Variante_UNO__Group__1__Impl rule__Variante_UNO__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variante_UNO__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__1"


    // $ANTLR start "rule__Variante_UNO__Group__1__Impl"
    // InternalMyUno.g:866:1: rule__Variante_UNO__Group__1__Impl : ( ( rule__Variante_UNO__NameAssignment_1 ) ) ;
    public final void rule__Variante_UNO__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:870:1: ( ( ( rule__Variante_UNO__NameAssignment_1 ) ) )
            // InternalMyUno.g:871:1: ( ( rule__Variante_UNO__NameAssignment_1 ) )
            {
            // InternalMyUno.g:871:1: ( ( rule__Variante_UNO__NameAssignment_1 ) )
            // InternalMyUno.g:872:2: ( rule__Variante_UNO__NameAssignment_1 )
            {
             before(grammarAccess.getVariante_UNOAccess().getNameAssignment_1()); 
            // InternalMyUno.g:873:2: ( rule__Variante_UNO__NameAssignment_1 )
            // InternalMyUno.g:873:3: rule__Variante_UNO__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__1__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__2"
    // InternalMyUno.g:881:1: rule__Variante_UNO__Group__2 : rule__Variante_UNO__Group__2__Impl rule__Variante_UNO__Group__3 ;
    public final void rule__Variante_UNO__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:885:1: ( rule__Variante_UNO__Group__2__Impl rule__Variante_UNO__Group__3 )
            // InternalMyUno.g:886:2: rule__Variante_UNO__Group__2__Impl rule__Variante_UNO__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Variante_UNO__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__2"


    // $ANTLR start "rule__Variante_UNO__Group__2__Impl"
    // InternalMyUno.g:893:1: rule__Variante_UNO__Group__2__Impl : ( '{' ) ;
    public final void rule__Variante_UNO__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:897:1: ( ( '{' ) )
            // InternalMyUno.g:898:1: ( '{' )
            {
            // InternalMyUno.g:898:1: ( '{' )
            // InternalMyUno.g:899:2: '{'
            {
             before(grammarAccess.getVariante_UNOAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVariante_UNOAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__2__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__3"
    // InternalMyUno.g:908:1: rule__Variante_UNO__Group__3 : rule__Variante_UNO__Group__3__Impl rule__Variante_UNO__Group__4 ;
    public final void rule__Variante_UNO__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:912:1: ( rule__Variante_UNO__Group__3__Impl rule__Variante_UNO__Group__4 )
            // InternalMyUno.g:913:2: rule__Variante_UNO__Group__3__Impl rule__Variante_UNO__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Variante_UNO__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__3"


    // $ANTLR start "rule__Variante_UNO__Group__3__Impl"
    // InternalMyUno.g:920:1: rule__Variante_UNO__Group__3__Impl : ( ( rule__Variante_UNO__Configuration_departAssignment_3 ) ) ;
    public final void rule__Variante_UNO__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:924:1: ( ( ( rule__Variante_UNO__Configuration_departAssignment_3 ) ) )
            // InternalMyUno.g:925:1: ( ( rule__Variante_UNO__Configuration_departAssignment_3 ) )
            {
            // InternalMyUno.g:925:1: ( ( rule__Variante_UNO__Configuration_departAssignment_3 ) )
            // InternalMyUno.g:926:2: ( rule__Variante_UNO__Configuration_departAssignment_3 )
            {
             before(grammarAccess.getVariante_UNOAccess().getConfiguration_departAssignment_3()); 
            // InternalMyUno.g:927:2: ( rule__Variante_UNO__Configuration_departAssignment_3 )
            // InternalMyUno.g:927:3: rule__Variante_UNO__Configuration_departAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Configuration_departAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getConfiguration_departAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__3__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__4"
    // InternalMyUno.g:935:1: rule__Variante_UNO__Group__4 : rule__Variante_UNO__Group__4__Impl rule__Variante_UNO__Group__5 ;
    public final void rule__Variante_UNO__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:939:1: ( rule__Variante_UNO__Group__4__Impl rule__Variante_UNO__Group__5 )
            // InternalMyUno.g:940:2: rule__Variante_UNO__Group__4__Impl rule__Variante_UNO__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Variante_UNO__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__4"


    // $ANTLR start "rule__Variante_UNO__Group__4__Impl"
    // InternalMyUno.g:947:1: rule__Variante_UNO__Group__4__Impl : ( ( rule__Variante_UNO__MancheAssignment_4 ) ) ;
    public final void rule__Variante_UNO__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:951:1: ( ( ( rule__Variante_UNO__MancheAssignment_4 ) ) )
            // InternalMyUno.g:952:1: ( ( rule__Variante_UNO__MancheAssignment_4 ) )
            {
            // InternalMyUno.g:952:1: ( ( rule__Variante_UNO__MancheAssignment_4 ) )
            // InternalMyUno.g:953:2: ( rule__Variante_UNO__MancheAssignment_4 )
            {
             before(grammarAccess.getVariante_UNOAccess().getMancheAssignment_4()); 
            // InternalMyUno.g:954:2: ( rule__Variante_UNO__MancheAssignment_4 )
            // InternalMyUno.g:954:3: rule__Variante_UNO__MancheAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__MancheAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getMancheAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__4__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__5"
    // InternalMyUno.g:962:1: rule__Variante_UNO__Group__5 : rule__Variante_UNO__Group__5__Impl rule__Variante_UNO__Group__6 ;
    public final void rule__Variante_UNO__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:966:1: ( rule__Variante_UNO__Group__5__Impl rule__Variante_UNO__Group__6 )
            // InternalMyUno.g:967:2: rule__Variante_UNO__Group__5__Impl rule__Variante_UNO__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Variante_UNO__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__5"


    // $ANTLR start "rule__Variante_UNO__Group__5__Impl"
    // InternalMyUno.g:974:1: rule__Variante_UNO__Group__5__Impl : ( ( rule__Variante_UNO__Fin_mancheAssignment_5 ) ) ;
    public final void rule__Variante_UNO__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:978:1: ( ( ( rule__Variante_UNO__Fin_mancheAssignment_5 ) ) )
            // InternalMyUno.g:979:1: ( ( rule__Variante_UNO__Fin_mancheAssignment_5 ) )
            {
            // InternalMyUno.g:979:1: ( ( rule__Variante_UNO__Fin_mancheAssignment_5 ) )
            // InternalMyUno.g:980:2: ( rule__Variante_UNO__Fin_mancheAssignment_5 )
            {
             before(grammarAccess.getVariante_UNOAccess().getFin_mancheAssignment_5()); 
            // InternalMyUno.g:981:2: ( rule__Variante_UNO__Fin_mancheAssignment_5 )
            // InternalMyUno.g:981:3: rule__Variante_UNO__Fin_mancheAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Fin_mancheAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getFin_mancheAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__5__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__6"
    // InternalMyUno.g:989:1: rule__Variante_UNO__Group__6 : rule__Variante_UNO__Group__6__Impl rule__Variante_UNO__Group__7 ;
    public final void rule__Variante_UNO__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:993:1: ( rule__Variante_UNO__Group__6__Impl rule__Variante_UNO__Group__7 )
            // InternalMyUno.g:994:2: rule__Variante_UNO__Group__6__Impl rule__Variante_UNO__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Variante_UNO__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__6"


    // $ANTLR start "rule__Variante_UNO__Group__6__Impl"
    // InternalMyUno.g:1001:1: rule__Variante_UNO__Group__6__Impl : ( ( rule__Variante_UNO__Fin_partieAssignment_6 ) ) ;
    public final void rule__Variante_UNO__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1005:1: ( ( ( rule__Variante_UNO__Fin_partieAssignment_6 ) ) )
            // InternalMyUno.g:1006:1: ( ( rule__Variante_UNO__Fin_partieAssignment_6 ) )
            {
            // InternalMyUno.g:1006:1: ( ( rule__Variante_UNO__Fin_partieAssignment_6 ) )
            // InternalMyUno.g:1007:2: ( rule__Variante_UNO__Fin_partieAssignment_6 )
            {
             before(grammarAccess.getVariante_UNOAccess().getFin_partieAssignment_6()); 
            // InternalMyUno.g:1008:2: ( rule__Variante_UNO__Fin_partieAssignment_6 )
            // InternalMyUno.g:1008:3: rule__Variante_UNO__Fin_partieAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Fin_partieAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVariante_UNOAccess().getFin_partieAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__6__Impl"


    // $ANTLR start "rule__Variante_UNO__Group__7"
    // InternalMyUno.g:1016:1: rule__Variante_UNO__Group__7 : rule__Variante_UNO__Group__7__Impl ;
    public final void rule__Variante_UNO__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1020:1: ( rule__Variante_UNO__Group__7__Impl )
            // InternalMyUno.g:1021:2: rule__Variante_UNO__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variante_UNO__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__7"


    // $ANTLR start "rule__Variante_UNO__Group__7__Impl"
    // InternalMyUno.g:1027:1: rule__Variante_UNO__Group__7__Impl : ( '}' ) ;
    public final void rule__Variante_UNO__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1031:1: ( ( '}' ) )
            // InternalMyUno.g:1032:1: ( '}' )
            {
            // InternalMyUno.g:1032:1: ( '}' )
            // InternalMyUno.g:1033:2: '}'
            {
             before(grammarAccess.getVariante_UNOAccess().getRightCurlyBracketKeyword_7()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariante_UNOAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Group__7__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__0"
    // InternalMyUno.g:1043:1: rule__Configuration_Depart__Group__0 : rule__Configuration_Depart__Group__0__Impl rule__Configuration_Depart__Group__1 ;
    public final void rule__Configuration_Depart__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1047:1: ( rule__Configuration_Depart__Group__0__Impl rule__Configuration_Depart__Group__1 )
            // InternalMyUno.g:1048:2: rule__Configuration_Depart__Group__0__Impl rule__Configuration_Depart__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Configuration_Depart__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__0"


    // $ANTLR start "rule__Configuration_Depart__Group__0__Impl"
    // InternalMyUno.g:1055:1: rule__Configuration_Depart__Group__0__Impl : ( 'Depart' ) ;
    public final void rule__Configuration_Depart__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1059:1: ( ( 'Depart' ) )
            // InternalMyUno.g:1060:1: ( 'Depart' )
            {
            // InternalMyUno.g:1060:1: ( 'Depart' )
            // InternalMyUno.g:1061:2: 'Depart'
            {
             before(grammarAccess.getConfiguration_DepartAccess().getDepartKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getDepartKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__0__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__1"
    // InternalMyUno.g:1070:1: rule__Configuration_Depart__Group__1 : rule__Configuration_Depart__Group__1__Impl rule__Configuration_Depart__Group__2 ;
    public final void rule__Configuration_Depart__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1074:1: ( rule__Configuration_Depart__Group__1__Impl rule__Configuration_Depart__Group__2 )
            // InternalMyUno.g:1075:2: rule__Configuration_Depart__Group__1__Impl rule__Configuration_Depart__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Configuration_Depart__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__1"


    // $ANTLR start "rule__Configuration_Depart__Group__1__Impl"
    // InternalMyUno.g:1082:1: rule__Configuration_Depart__Group__1__Impl : ( ':' ) ;
    public final void rule__Configuration_Depart__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1086:1: ( ( ':' ) )
            // InternalMyUno.g:1087:1: ( ':' )
            {
            // InternalMyUno.g:1087:1: ( ':' )
            // InternalMyUno.g:1088:2: ':'
            {
             before(grammarAccess.getConfiguration_DepartAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__1__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__2"
    // InternalMyUno.g:1097:1: rule__Configuration_Depart__Group__2 : rule__Configuration_Depart__Group__2__Impl rule__Configuration_Depart__Group__3 ;
    public final void rule__Configuration_Depart__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1101:1: ( rule__Configuration_Depart__Group__2__Impl rule__Configuration_Depart__Group__3 )
            // InternalMyUno.g:1102:2: rule__Configuration_Depart__Group__2__Impl rule__Configuration_Depart__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Configuration_Depart__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__2"


    // $ANTLR start "rule__Configuration_Depart__Group__2__Impl"
    // InternalMyUno.g:1109:1: rule__Configuration_Depart__Group__2__Impl : ( ( rule__Configuration_Depart__MainAssignment_2 ) ) ;
    public final void rule__Configuration_Depart__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1113:1: ( ( ( rule__Configuration_Depart__MainAssignment_2 ) ) )
            // InternalMyUno.g:1114:1: ( ( rule__Configuration_Depart__MainAssignment_2 ) )
            {
            // InternalMyUno.g:1114:1: ( ( rule__Configuration_Depart__MainAssignment_2 ) )
            // InternalMyUno.g:1115:2: ( rule__Configuration_Depart__MainAssignment_2 )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getMainAssignment_2()); 
            // InternalMyUno.g:1116:2: ( rule__Configuration_Depart__MainAssignment_2 )
            // InternalMyUno.g:1116:3: rule__Configuration_Depart__MainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__MainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_DepartAccess().getMainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__2__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__3"
    // InternalMyUno.g:1124:1: rule__Configuration_Depart__Group__3 : rule__Configuration_Depart__Group__3__Impl rule__Configuration_Depart__Group__4 ;
    public final void rule__Configuration_Depart__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1128:1: ( rule__Configuration_Depart__Group__3__Impl rule__Configuration_Depart__Group__4 )
            // InternalMyUno.g:1129:2: rule__Configuration_Depart__Group__3__Impl rule__Configuration_Depart__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Configuration_Depart__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__3"


    // $ANTLR start "rule__Configuration_Depart__Group__3__Impl"
    // InternalMyUno.g:1136:1: rule__Configuration_Depart__Group__3__Impl : ( ( rule__Configuration_Depart__TalonAssignment_3 ) ) ;
    public final void rule__Configuration_Depart__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1140:1: ( ( ( rule__Configuration_Depart__TalonAssignment_3 ) ) )
            // InternalMyUno.g:1141:1: ( ( rule__Configuration_Depart__TalonAssignment_3 ) )
            {
            // InternalMyUno.g:1141:1: ( ( rule__Configuration_Depart__TalonAssignment_3 ) )
            // InternalMyUno.g:1142:2: ( rule__Configuration_Depart__TalonAssignment_3 )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getTalonAssignment_3()); 
            // InternalMyUno.g:1143:2: ( rule__Configuration_Depart__TalonAssignment_3 )
            // InternalMyUno.g:1143:3: rule__Configuration_Depart__TalonAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__TalonAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_DepartAccess().getTalonAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__3__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__4"
    // InternalMyUno.g:1151:1: rule__Configuration_Depart__Group__4 : rule__Configuration_Depart__Group__4__Impl rule__Configuration_Depart__Group__5 ;
    public final void rule__Configuration_Depart__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1155:1: ( rule__Configuration_Depart__Group__4__Impl rule__Configuration_Depart__Group__5 )
            // InternalMyUno.g:1156:2: rule__Configuration_Depart__Group__4__Impl rule__Configuration_Depart__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Configuration_Depart__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__4"


    // $ANTLR start "rule__Configuration_Depart__Group__4__Impl"
    // InternalMyUno.g:1163:1: rule__Configuration_Depart__Group__4__Impl : ( ( rule__Configuration_Depart__RiviereAssignment_4 )? ) ;
    public final void rule__Configuration_Depart__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1167:1: ( ( ( rule__Configuration_Depart__RiviereAssignment_4 )? ) )
            // InternalMyUno.g:1168:1: ( ( rule__Configuration_Depart__RiviereAssignment_4 )? )
            {
            // InternalMyUno.g:1168:1: ( ( rule__Configuration_Depart__RiviereAssignment_4 )? )
            // InternalMyUno.g:1169:2: ( rule__Configuration_Depart__RiviereAssignment_4 )?
            {
             before(grammarAccess.getConfiguration_DepartAccess().getRiviereAssignment_4()); 
            // InternalMyUno.g:1170:2: ( rule__Configuration_Depart__RiviereAssignment_4 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==64) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyUno.g:1170:3: rule__Configuration_Depart__RiviereAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration_Depart__RiviereAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguration_DepartAccess().getRiviereAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__4__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__5"
    // InternalMyUno.g:1178:1: rule__Configuration_Depart__Group__5 : rule__Configuration_Depart__Group__5__Impl rule__Configuration_Depart__Group__6 ;
    public final void rule__Configuration_Depart__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1182:1: ( rule__Configuration_Depart__Group__5__Impl rule__Configuration_Depart__Group__6 )
            // InternalMyUno.g:1183:2: rule__Configuration_Depart__Group__5__Impl rule__Configuration_Depart__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Configuration_Depart__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__5"


    // $ANTLR start "rule__Configuration_Depart__Group__5__Impl"
    // InternalMyUno.g:1190:1: rule__Configuration_Depart__Group__5__Impl : ( ( rule__Configuration_Depart__Group_5__0 )? ) ;
    public final void rule__Configuration_Depart__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1194:1: ( ( ( rule__Configuration_Depart__Group_5__0 )? ) )
            // InternalMyUno.g:1195:1: ( ( rule__Configuration_Depart__Group_5__0 )? )
            {
            // InternalMyUno.g:1195:1: ( ( rule__Configuration_Depart__Group_5__0 )? )
            // InternalMyUno.g:1196:2: ( rule__Configuration_Depart__Group_5__0 )?
            {
             before(grammarAccess.getConfiguration_DepartAccess().getGroup_5()); 
            // InternalMyUno.g:1197:2: ( rule__Configuration_Depart__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==65) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyUno.g:1197:3: rule__Configuration_Depart__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Configuration_Depart__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConfiguration_DepartAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__5__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group__6"
    // InternalMyUno.g:1205:1: rule__Configuration_Depart__Group__6 : rule__Configuration_Depart__Group__6__Impl ;
    public final void rule__Configuration_Depart__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1209:1: ( rule__Configuration_Depart__Group__6__Impl )
            // InternalMyUno.g:1210:2: rule__Configuration_Depart__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__6"


    // $ANTLR start "rule__Configuration_Depart__Group__6__Impl"
    // InternalMyUno.g:1216:1: rule__Configuration_Depart__Group__6__Impl : ( ';' ) ;
    public final void rule__Configuration_Depart__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1220:1: ( ( ';' ) )
            // InternalMyUno.g:1221:1: ( ';' )
            {
            // InternalMyUno.g:1221:1: ( ';' )
            // InternalMyUno.g:1222:2: ';'
            {
             before(grammarAccess.getConfiguration_DepartAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group__6__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group_5__0"
    // InternalMyUno.g:1232:1: rule__Configuration_Depart__Group_5__0 : rule__Configuration_Depart__Group_5__0__Impl rule__Configuration_Depart__Group_5__1 ;
    public final void rule__Configuration_Depart__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1236:1: ( rule__Configuration_Depart__Group_5__0__Impl rule__Configuration_Depart__Group_5__1 )
            // InternalMyUno.g:1237:2: rule__Configuration_Depart__Group_5__0__Impl rule__Configuration_Depart__Group_5__1
            {
            pushFollow(FOLLOW_14);
            rule__Configuration_Depart__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group_5__0"


    // $ANTLR start "rule__Configuration_Depart__Group_5__0__Impl"
    // InternalMyUno.g:1244:1: rule__Configuration_Depart__Group_5__0__Impl : ( ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 ) ) ;
    public final void rule__Configuration_Depart__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1248:1: ( ( ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 ) ) )
            // InternalMyUno.g:1249:1: ( ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 ) )
            {
            // InternalMyUno.g:1249:1: ( ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 ) )
            // InternalMyUno.g:1250:2: ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteAssignment_5_0()); 
            // InternalMyUno.g:1251:2: ( rule__Configuration_Depart__Temps_limiteAssignment_5_0 )
            // InternalMyUno.g:1251:3: rule__Configuration_Depart__Temps_limiteAssignment_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Temps_limiteAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteAssignment_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group_5__0__Impl"


    // $ANTLR start "rule__Configuration_Depart__Group_5__1"
    // InternalMyUno.g:1259:1: rule__Configuration_Depart__Group_5__1 : rule__Configuration_Depart__Group_5__1__Impl ;
    public final void rule__Configuration_Depart__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1263:1: ( rule__Configuration_Depart__Group_5__1__Impl )
            // InternalMyUno.g:1264:2: rule__Configuration_Depart__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group_5__1"


    // $ANTLR start "rule__Configuration_Depart__Group_5__1__Impl"
    // InternalMyUno.g:1270:1: rule__Configuration_Depart__Group_5__1__Impl : ( ( rule__Configuration_Depart__SecondesAssignment_5_1 ) ) ;
    public final void rule__Configuration_Depart__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1274:1: ( ( ( rule__Configuration_Depart__SecondesAssignment_5_1 ) ) )
            // InternalMyUno.g:1275:1: ( ( rule__Configuration_Depart__SecondesAssignment_5_1 ) )
            {
            // InternalMyUno.g:1275:1: ( ( rule__Configuration_Depart__SecondesAssignment_5_1 ) )
            // InternalMyUno.g:1276:2: ( rule__Configuration_Depart__SecondesAssignment_5_1 )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getSecondesAssignment_5_1()); 
            // InternalMyUno.g:1277:2: ( rule__Configuration_Depart__SecondesAssignment_5_1 )
            // InternalMyUno.g:1277:3: rule__Configuration_Depart__SecondesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Configuration_Depart__SecondesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getConfiguration_DepartAccess().getSecondesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Group_5__1__Impl"


    // $ANTLR start "rule__Main__Group__0"
    // InternalMyUno.g:1286:1: rule__Main__Group__0 : rule__Main__Group__0__Impl rule__Main__Group__1 ;
    public final void rule__Main__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1290:1: ( rule__Main__Group__0__Impl rule__Main__Group__1 )
            // InternalMyUno.g:1291:2: rule__Main__Group__0__Impl rule__Main__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0"


    // $ANTLR start "rule__Main__Group__0__Impl"
    // InternalMyUno.g:1298:1: rule__Main__Group__0__Impl : ( 'etat_main' ) ;
    public final void rule__Main__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1302:1: ( ( 'etat_main' ) )
            // InternalMyUno.g:1303:1: ( 'etat_main' )
            {
            // InternalMyUno.g:1303:1: ( 'etat_main' )
            // InternalMyUno.g:1304:2: 'etat_main'
            {
             before(grammarAccess.getMainAccess().getEtat_mainKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getEtat_mainKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__0__Impl"


    // $ANTLR start "rule__Main__Group__1"
    // InternalMyUno.g:1313:1: rule__Main__Group__1 : rule__Main__Group__1__Impl rule__Main__Group__2 ;
    public final void rule__Main__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1317:1: ( rule__Main__Group__1__Impl rule__Main__Group__2 )
            // InternalMyUno.g:1318:2: rule__Main__Group__1__Impl rule__Main__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Main__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1"


    // $ANTLR start "rule__Main__Group__1__Impl"
    // InternalMyUno.g:1325:1: rule__Main__Group__1__Impl : ( ':' ) ;
    public final void rule__Main__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1329:1: ( ( ':' ) )
            // InternalMyUno.g:1330:1: ( ':' )
            {
            // InternalMyUno.g:1330:1: ( ':' )
            // InternalMyUno.g:1331:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__1__Impl"


    // $ANTLR start "rule__Main__Group__2"
    // InternalMyUno.g:1340:1: rule__Main__Group__2 : rule__Main__Group__2__Impl rule__Main__Group__3 ;
    public final void rule__Main__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1344:1: ( rule__Main__Group__2__Impl rule__Main__Group__3 )
            // InternalMyUno.g:1345:2: rule__Main__Group__2__Impl rule__Main__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Main__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2"


    // $ANTLR start "rule__Main__Group__2__Impl"
    // InternalMyUno.g:1352:1: rule__Main__Group__2__Impl : ( ( rule__Main__Etat_mainAssignment_2 ) ) ;
    public final void rule__Main__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1356:1: ( ( ( rule__Main__Etat_mainAssignment_2 ) ) )
            // InternalMyUno.g:1357:1: ( ( rule__Main__Etat_mainAssignment_2 ) )
            {
            // InternalMyUno.g:1357:1: ( ( rule__Main__Etat_mainAssignment_2 ) )
            // InternalMyUno.g:1358:2: ( rule__Main__Etat_mainAssignment_2 )
            {
             before(grammarAccess.getMainAccess().getEtat_mainAssignment_2()); 
            // InternalMyUno.g:1359:2: ( rule__Main__Etat_mainAssignment_2 )
            // InternalMyUno.g:1359:3: rule__Main__Etat_mainAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Main__Etat_mainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getEtat_mainAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__2__Impl"


    // $ANTLR start "rule__Main__Group__3"
    // InternalMyUno.g:1367:1: rule__Main__Group__3 : rule__Main__Group__3__Impl rule__Main__Group__4 ;
    public final void rule__Main__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1371:1: ( rule__Main__Group__3__Impl rule__Main__Group__4 )
            // InternalMyUno.g:1372:2: rule__Main__Group__3__Impl rule__Main__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3"


    // $ANTLR start "rule__Main__Group__3__Impl"
    // InternalMyUno.g:1379:1: rule__Main__Group__3__Impl : ( 'nb_mains' ) ;
    public final void rule__Main__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1383:1: ( ( 'nb_mains' ) )
            // InternalMyUno.g:1384:1: ( 'nb_mains' )
            {
            // InternalMyUno.g:1384:1: ( 'nb_mains' )
            // InternalMyUno.g:1385:2: 'nb_mains'
            {
             before(grammarAccess.getMainAccess().getNb_mainsKeyword_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getNb_mainsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__3__Impl"


    // $ANTLR start "rule__Main__Group__4"
    // InternalMyUno.g:1394:1: rule__Main__Group__4 : rule__Main__Group__4__Impl rule__Main__Group__5 ;
    public final void rule__Main__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1398:1: ( rule__Main__Group__4__Impl rule__Main__Group__5 )
            // InternalMyUno.g:1399:2: rule__Main__Group__4__Impl rule__Main__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Main__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4"


    // $ANTLR start "rule__Main__Group__4__Impl"
    // InternalMyUno.g:1406:1: rule__Main__Group__4__Impl : ( ':' ) ;
    public final void rule__Main__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1410:1: ( ( ':' ) )
            // InternalMyUno.g:1411:1: ( ':' )
            {
            // InternalMyUno.g:1411:1: ( ':' )
            // InternalMyUno.g:1412:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__4__Impl"


    // $ANTLR start "rule__Main__Group__5"
    // InternalMyUno.g:1421:1: rule__Main__Group__5 : rule__Main__Group__5__Impl rule__Main__Group__6 ;
    public final void rule__Main__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1425:1: ( rule__Main__Group__5__Impl rule__Main__Group__6 )
            // InternalMyUno.g:1426:2: rule__Main__Group__5__Impl rule__Main__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Main__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5"


    // $ANTLR start "rule__Main__Group__5__Impl"
    // InternalMyUno.g:1433:1: rule__Main__Group__5__Impl : ( ( rule__Main__Nb_mainsAssignment_5 ) ) ;
    public final void rule__Main__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1437:1: ( ( ( rule__Main__Nb_mainsAssignment_5 ) ) )
            // InternalMyUno.g:1438:1: ( ( rule__Main__Nb_mainsAssignment_5 ) )
            {
            // InternalMyUno.g:1438:1: ( ( rule__Main__Nb_mainsAssignment_5 ) )
            // InternalMyUno.g:1439:2: ( rule__Main__Nb_mainsAssignment_5 )
            {
             before(grammarAccess.getMainAccess().getNb_mainsAssignment_5()); 
            // InternalMyUno.g:1440:2: ( rule__Main__Nb_mainsAssignment_5 )
            // InternalMyUno.g:1440:3: rule__Main__Nb_mainsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Main__Nb_mainsAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getNb_mainsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__5__Impl"


    // $ANTLR start "rule__Main__Group__6"
    // InternalMyUno.g:1448:1: rule__Main__Group__6 : rule__Main__Group__6__Impl rule__Main__Group__7 ;
    public final void rule__Main__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1452:1: ( rule__Main__Group__6__Impl rule__Main__Group__7 )
            // InternalMyUno.g:1453:2: rule__Main__Group__6__Impl rule__Main__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Main__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6"


    // $ANTLR start "rule__Main__Group__6__Impl"
    // InternalMyUno.g:1460:1: rule__Main__Group__6__Impl : ( 'nb_cartes_main' ) ;
    public final void rule__Main__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1464:1: ( ( 'nb_cartes_main' ) )
            // InternalMyUno.g:1465:1: ( 'nb_cartes_main' )
            {
            // InternalMyUno.g:1465:1: ( 'nb_cartes_main' )
            // InternalMyUno.g:1466:2: 'nb_cartes_main'
            {
             before(grammarAccess.getMainAccess().getNb_cartes_mainKeyword_6()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getNb_cartes_mainKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__6__Impl"


    // $ANTLR start "rule__Main__Group__7"
    // InternalMyUno.g:1475:1: rule__Main__Group__7 : rule__Main__Group__7__Impl rule__Main__Group__8 ;
    public final void rule__Main__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1479:1: ( rule__Main__Group__7__Impl rule__Main__Group__8 )
            // InternalMyUno.g:1480:2: rule__Main__Group__7__Impl rule__Main__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Main__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Main__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__7"


    // $ANTLR start "rule__Main__Group__7__Impl"
    // InternalMyUno.g:1487:1: rule__Main__Group__7__Impl : ( ':' ) ;
    public final void rule__Main__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1491:1: ( ( ':' ) )
            // InternalMyUno.g:1492:1: ( ':' )
            {
            // InternalMyUno.g:1492:1: ( ':' )
            // InternalMyUno.g:1493:2: ':'
            {
             before(grammarAccess.getMainAccess().getColonKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMainAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__7__Impl"


    // $ANTLR start "rule__Main__Group__8"
    // InternalMyUno.g:1502:1: rule__Main__Group__8 : rule__Main__Group__8__Impl ;
    public final void rule__Main__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1506:1: ( rule__Main__Group__8__Impl )
            // InternalMyUno.g:1507:2: rule__Main__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Main__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__8"


    // $ANTLR start "rule__Main__Group__8__Impl"
    // InternalMyUno.g:1513:1: rule__Main__Group__8__Impl : ( ( rule__Main__Nb_cartes_mainsAssignment_8 ) ) ;
    public final void rule__Main__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1517:1: ( ( ( rule__Main__Nb_cartes_mainsAssignment_8 ) ) )
            // InternalMyUno.g:1518:1: ( ( rule__Main__Nb_cartes_mainsAssignment_8 ) )
            {
            // InternalMyUno.g:1518:1: ( ( rule__Main__Nb_cartes_mainsAssignment_8 ) )
            // InternalMyUno.g:1519:2: ( rule__Main__Nb_cartes_mainsAssignment_8 )
            {
             before(grammarAccess.getMainAccess().getNb_cartes_mainsAssignment_8()); 
            // InternalMyUno.g:1520:2: ( rule__Main__Nb_cartes_mainsAssignment_8 )
            // InternalMyUno.g:1520:3: rule__Main__Nb_cartes_mainsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Main__Nb_cartes_mainsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMainAccess().getNb_cartes_mainsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Group__8__Impl"


    // $ANTLR start "rule__Talon__Group__0"
    // InternalMyUno.g:1529:1: rule__Talon__Group__0 : rule__Talon__Group__0__Impl rule__Talon__Group__1 ;
    public final void rule__Talon__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1533:1: ( rule__Talon__Group__0__Impl rule__Talon__Group__1 )
            // InternalMyUno.g:1534:2: rule__Talon__Group__0__Impl rule__Talon__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Talon__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talon__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__0"


    // $ANTLR start "rule__Talon__Group__0__Impl"
    // InternalMyUno.g:1541:1: rule__Talon__Group__0__Impl : ( 'nb_talons' ) ;
    public final void rule__Talon__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1545:1: ( ( 'nb_talons' ) )
            // InternalMyUno.g:1546:1: ( 'nb_talons' )
            {
            // InternalMyUno.g:1546:1: ( 'nb_talons' )
            // InternalMyUno.g:1547:2: 'nb_talons'
            {
             before(grammarAccess.getTalonAccess().getNb_talonsKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTalonAccess().getNb_talonsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__0__Impl"


    // $ANTLR start "rule__Talon__Group__1"
    // InternalMyUno.g:1556:1: rule__Talon__Group__1 : rule__Talon__Group__1__Impl rule__Talon__Group__2 ;
    public final void rule__Talon__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1560:1: ( rule__Talon__Group__1__Impl rule__Talon__Group__2 )
            // InternalMyUno.g:1561:2: rule__Talon__Group__1__Impl rule__Talon__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Talon__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Talon__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__1"


    // $ANTLR start "rule__Talon__Group__1__Impl"
    // InternalMyUno.g:1568:1: rule__Talon__Group__1__Impl : ( ':' ) ;
    public final void rule__Talon__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1572:1: ( ( ':' ) )
            // InternalMyUno.g:1573:1: ( ':' )
            {
            // InternalMyUno.g:1573:1: ( ':' )
            // InternalMyUno.g:1574:2: ':'
            {
             before(grammarAccess.getTalonAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTalonAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__1__Impl"


    // $ANTLR start "rule__Talon__Group__2"
    // InternalMyUno.g:1583:1: rule__Talon__Group__2 : rule__Talon__Group__2__Impl ;
    public final void rule__Talon__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1587:1: ( rule__Talon__Group__2__Impl )
            // InternalMyUno.g:1588:2: rule__Talon__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Talon__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__2"


    // $ANTLR start "rule__Talon__Group__2__Impl"
    // InternalMyUno.g:1594:1: rule__Talon__Group__2__Impl : ( ( rule__Talon__Nb_talonsAssignment_2 ) ) ;
    public final void rule__Talon__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1598:1: ( ( ( rule__Talon__Nb_talonsAssignment_2 ) ) )
            // InternalMyUno.g:1599:1: ( ( rule__Talon__Nb_talonsAssignment_2 ) )
            {
            // InternalMyUno.g:1599:1: ( ( rule__Talon__Nb_talonsAssignment_2 ) )
            // InternalMyUno.g:1600:2: ( rule__Talon__Nb_talonsAssignment_2 )
            {
             before(grammarAccess.getTalonAccess().getNb_talonsAssignment_2()); 
            // InternalMyUno.g:1601:2: ( rule__Talon__Nb_talonsAssignment_2 )
            // InternalMyUno.g:1601:3: rule__Talon__Nb_talonsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Talon__Nb_talonsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTalonAccess().getNb_talonsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Group__2__Impl"


    // $ANTLR start "rule__Manche__Group__0"
    // InternalMyUno.g:1610:1: rule__Manche__Group__0 : rule__Manche__Group__0__Impl rule__Manche__Group__1 ;
    public final void rule__Manche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1614:1: ( rule__Manche__Group__0__Impl rule__Manche__Group__1 )
            // InternalMyUno.g:1615:2: rule__Manche__Group__0__Impl rule__Manche__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Manche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__0"


    // $ANTLR start "rule__Manche__Group__0__Impl"
    // InternalMyUno.g:1622:1: rule__Manche__Group__0__Impl : ( 'Manche' ) ;
    public final void rule__Manche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1626:1: ( ( 'Manche' ) )
            // InternalMyUno.g:1627:1: ( 'Manche' )
            {
            // InternalMyUno.g:1627:1: ( 'Manche' )
            // InternalMyUno.g:1628:2: 'Manche'
            {
             before(grammarAccess.getMancheAccess().getMancheKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getMancheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__0__Impl"


    // $ANTLR start "rule__Manche__Group__1"
    // InternalMyUno.g:1637:1: rule__Manche__Group__1 : rule__Manche__Group__1__Impl rule__Manche__Group__2 ;
    public final void rule__Manche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1641:1: ( rule__Manche__Group__1__Impl rule__Manche__Group__2 )
            // InternalMyUno.g:1642:2: rule__Manche__Group__1__Impl rule__Manche__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__1"


    // $ANTLR start "rule__Manche__Group__1__Impl"
    // InternalMyUno.g:1649:1: rule__Manche__Group__1__Impl : ( ':' ) ;
    public final void rule__Manche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1653:1: ( ( ':' ) )
            // InternalMyUno.g:1654:1: ( ':' )
            {
            // InternalMyUno.g:1654:1: ( ':' )
            // InternalMyUno.g:1655:2: ':'
            {
             before(grammarAccess.getMancheAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__1__Impl"


    // $ANTLR start "rule__Manche__Group__2"
    // InternalMyUno.g:1664:1: rule__Manche__Group__2 : rule__Manche__Group__2__Impl rule__Manche__Group__3 ;
    public final void rule__Manche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1668:1: ( rule__Manche__Group__2__Impl rule__Manche__Group__3 )
            // InternalMyUno.g:1669:2: rule__Manche__Group__2__Impl rule__Manche__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__2"


    // $ANTLR start "rule__Manche__Group__2__Impl"
    // InternalMyUno.g:1676:1: rule__Manche__Group__2__Impl : ( ( rule__Manche__Group_2__0 )? ) ;
    public final void rule__Manche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1680:1: ( ( ( rule__Manche__Group_2__0 )? ) )
            // InternalMyUno.g:1681:1: ( ( rule__Manche__Group_2__0 )? )
            {
            // InternalMyUno.g:1681:1: ( ( rule__Manche__Group_2__0 )? )
            // InternalMyUno.g:1682:2: ( rule__Manche__Group_2__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_2()); 
            // InternalMyUno.g:1683:2: ( rule__Manche__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyUno.g:1683:3: rule__Manche__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__2__Impl"


    // $ANTLR start "rule__Manche__Group__3"
    // InternalMyUno.g:1691:1: rule__Manche__Group__3 : rule__Manche__Group__3__Impl rule__Manche__Group__4 ;
    public final void rule__Manche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1695:1: ( rule__Manche__Group__3__Impl rule__Manche__Group__4 )
            // InternalMyUno.g:1696:2: rule__Manche__Group__3__Impl rule__Manche__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Manche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__3"


    // $ANTLR start "rule__Manche__Group__3__Impl"
    // InternalMyUno.g:1703:1: rule__Manche__Group__3__Impl : ( ( rule__Manche__Group_3__0 )? ) ;
    public final void rule__Manche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1707:1: ( ( ( rule__Manche__Group_3__0 )? ) )
            // InternalMyUno.g:1708:1: ( ( rule__Manche__Group_3__0 )? )
            {
            // InternalMyUno.g:1708:1: ( ( rule__Manche__Group_3__0 )? )
            // InternalMyUno.g:1709:2: ( rule__Manche__Group_3__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_3()); 
            // InternalMyUno.g:1710:2: ( rule__Manche__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==49) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyUno.g:1710:3: rule__Manche__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__3__Impl"


    // $ANTLR start "rule__Manche__Group__4"
    // InternalMyUno.g:1718:1: rule__Manche__Group__4 : rule__Manche__Group__4__Impl rule__Manche__Group__5 ;
    public final void rule__Manche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1722:1: ( rule__Manche__Group__4__Impl rule__Manche__Group__5 )
            // InternalMyUno.g:1723:2: rule__Manche__Group__4__Impl rule__Manche__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__4"


    // $ANTLR start "rule__Manche__Group__4__Impl"
    // InternalMyUno.g:1730:1: rule__Manche__Group__4__Impl : ( 'Nb_cartes_jouables' ) ;
    public final void rule__Manche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1734:1: ( ( 'Nb_cartes_jouables' ) )
            // InternalMyUno.g:1735:1: ( 'Nb_cartes_jouables' )
            {
            // InternalMyUno.g:1735:1: ( 'Nb_cartes_jouables' )
            // InternalMyUno.g:1736:2: 'Nb_cartes_jouables'
            {
             before(grammarAccess.getMancheAccess().getNb_cartes_jouablesKeyword_4()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getNb_cartes_jouablesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__4__Impl"


    // $ANTLR start "rule__Manche__Group__5"
    // InternalMyUno.g:1745:1: rule__Manche__Group__5 : rule__Manche__Group__5__Impl rule__Manche__Group__6 ;
    public final void rule__Manche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1749:1: ( rule__Manche__Group__5__Impl rule__Manche__Group__6 )
            // InternalMyUno.g:1750:2: rule__Manche__Group__5__Impl rule__Manche__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__Manche__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__5"


    // $ANTLR start "rule__Manche__Group__5__Impl"
    // InternalMyUno.g:1757:1: rule__Manche__Group__5__Impl : ( '(' ) ;
    public final void rule__Manche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1761:1: ( ( '(' ) )
            // InternalMyUno.g:1762:1: ( '(' )
            {
            // InternalMyUno.g:1762:1: ( '(' )
            // InternalMyUno.g:1763:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__5__Impl"


    // $ANTLR start "rule__Manche__Group__6"
    // InternalMyUno.g:1772:1: rule__Manche__Group__6 : rule__Manche__Group__6__Impl rule__Manche__Group__7 ;
    public final void rule__Manche__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1776:1: ( rule__Manche__Group__6__Impl rule__Manche__Group__7 )
            // InternalMyUno.g:1777:2: rule__Manche__Group__6__Impl rule__Manche__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__6"


    // $ANTLR start "rule__Manche__Group__6__Impl"
    // InternalMyUno.g:1784:1: rule__Manche__Group__6__Impl : ( ( rule__Manche__Nb_cartes_jouablesAssignment_6 ) ) ;
    public final void rule__Manche__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1788:1: ( ( ( rule__Manche__Nb_cartes_jouablesAssignment_6 ) ) )
            // InternalMyUno.g:1789:1: ( ( rule__Manche__Nb_cartes_jouablesAssignment_6 ) )
            {
            // InternalMyUno.g:1789:1: ( ( rule__Manche__Nb_cartes_jouablesAssignment_6 ) )
            // InternalMyUno.g:1790:2: ( rule__Manche__Nb_cartes_jouablesAssignment_6 )
            {
             before(grammarAccess.getMancheAccess().getNb_cartes_jouablesAssignment_6()); 
            // InternalMyUno.g:1791:2: ( rule__Manche__Nb_cartes_jouablesAssignment_6 )
            // InternalMyUno.g:1791:3: rule__Manche__Nb_cartes_jouablesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Nb_cartes_jouablesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getNb_cartes_jouablesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__6__Impl"


    // $ANTLR start "rule__Manche__Group__7"
    // InternalMyUno.g:1799:1: rule__Manche__Group__7 : rule__Manche__Group__7__Impl rule__Manche__Group__8 ;
    public final void rule__Manche__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1803:1: ( rule__Manche__Group__7__Impl rule__Manche__Group__8 )
            // InternalMyUno.g:1804:2: rule__Manche__Group__7__Impl rule__Manche__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Manche__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__7"


    // $ANTLR start "rule__Manche__Group__7__Impl"
    // InternalMyUno.g:1811:1: rule__Manche__Group__7__Impl : ( ')' ) ;
    public final void rule__Manche__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1815:1: ( ( ')' ) )
            // InternalMyUno.g:1816:1: ( ')' )
            {
            // InternalMyUno.g:1816:1: ( ')' )
            // InternalMyUno.g:1817:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__7__Impl"


    // $ANTLR start "rule__Manche__Group__8"
    // InternalMyUno.g:1826:1: rule__Manche__Group__8 : rule__Manche__Group__8__Impl rule__Manche__Group__9 ;
    public final void rule__Manche__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1830:1: ( rule__Manche__Group__8__Impl rule__Manche__Group__9 )
            // InternalMyUno.g:1831:2: rule__Manche__Group__8__Impl rule__Manche__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__Manche__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__8"


    // $ANTLR start "rule__Manche__Group__8__Impl"
    // InternalMyUno.g:1838:1: rule__Manche__Group__8__Impl : ( ( rule__Manche__Group_8__0 )? ) ;
    public final void rule__Manche__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1842:1: ( ( ( rule__Manche__Group_8__0 )? ) )
            // InternalMyUno.g:1843:1: ( ( rule__Manche__Group_8__0 )? )
            {
            // InternalMyUno.g:1843:1: ( ( rule__Manche__Group_8__0 )? )
            // InternalMyUno.g:1844:2: ( rule__Manche__Group_8__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_8()); 
            // InternalMyUno.g:1845:2: ( rule__Manche__Group_8__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==50) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyUno.g:1845:3: rule__Manche__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__8__Impl"


    // $ANTLR start "rule__Manche__Group__9"
    // InternalMyUno.g:1853:1: rule__Manche__Group__9 : rule__Manche__Group__9__Impl rule__Manche__Group__10 ;
    public final void rule__Manche__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1857:1: ( rule__Manche__Group__9__Impl rule__Manche__Group__10 )
            // InternalMyUno.g:1858:2: rule__Manche__Group__9__Impl rule__Manche__Group__10
            {
            pushFollow(FOLLOW_25);
            rule__Manche__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__9"


    // $ANTLR start "rule__Manche__Group__9__Impl"
    // InternalMyUno.g:1865:1: rule__Manche__Group__9__Impl : ( ( rule__Manche__PiocheAssignment_9 ) ) ;
    public final void rule__Manche__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1869:1: ( ( ( rule__Manche__PiocheAssignment_9 ) ) )
            // InternalMyUno.g:1870:1: ( ( rule__Manche__PiocheAssignment_9 ) )
            {
            // InternalMyUno.g:1870:1: ( ( rule__Manche__PiocheAssignment_9 ) )
            // InternalMyUno.g:1871:2: ( rule__Manche__PiocheAssignment_9 )
            {
             before(grammarAccess.getMancheAccess().getPiocheAssignment_9()); 
            // InternalMyUno.g:1872:2: ( rule__Manche__PiocheAssignment_9 )
            // InternalMyUno.g:1872:3: rule__Manche__PiocheAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Manche__PiocheAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getPiocheAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__9__Impl"


    // $ANTLR start "rule__Manche__Group__10"
    // InternalMyUno.g:1880:1: rule__Manche__Group__10 : rule__Manche__Group__10__Impl rule__Manche__Group__11 ;
    public final void rule__Manche__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1884:1: ( rule__Manche__Group__10__Impl rule__Manche__Group__11 )
            // InternalMyUno.g:1885:2: rule__Manche__Group__10__Impl rule__Manche__Group__11
            {
            pushFollow(FOLLOW_25);
            rule__Manche__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__10"


    // $ANTLR start "rule__Manche__Group__10__Impl"
    // InternalMyUno.g:1892:1: rule__Manche__Group__10__Impl : ( ( rule__Manche__Group_10__0 )? ) ;
    public final void rule__Manche__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1896:1: ( ( ( rule__Manche__Group_10__0 )? ) )
            // InternalMyUno.g:1897:1: ( ( rule__Manche__Group_10__0 )? )
            {
            // InternalMyUno.g:1897:1: ( ( rule__Manche__Group_10__0 )? )
            // InternalMyUno.g:1898:2: ( rule__Manche__Group_10__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_10()); 
            // InternalMyUno.g:1899:2: ( rule__Manche__Group_10__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==51) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyUno.g:1899:3: rule__Manche__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__10__Impl"


    // $ANTLR start "rule__Manche__Group__11"
    // InternalMyUno.g:1907:1: rule__Manche__Group__11 : rule__Manche__Group__11__Impl rule__Manche__Group__12 ;
    public final void rule__Manche__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1911:1: ( rule__Manche__Group__11__Impl rule__Manche__Group__12 )
            // InternalMyUno.g:1912:2: rule__Manche__Group__11__Impl rule__Manche__Group__12
            {
            pushFollow(FOLLOW_25);
            rule__Manche__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__11"


    // $ANTLR start "rule__Manche__Group__11__Impl"
    // InternalMyUno.g:1919:1: rule__Manche__Group__11__Impl : ( ( rule__Manche__Group_11__0 )? ) ;
    public final void rule__Manche__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1923:1: ( ( ( rule__Manche__Group_11__0 )? ) )
            // InternalMyUno.g:1924:1: ( ( rule__Manche__Group_11__0 )? )
            {
            // InternalMyUno.g:1924:1: ( ( rule__Manche__Group_11__0 )? )
            // InternalMyUno.g:1925:2: ( rule__Manche__Group_11__0 )?
            {
             before(grammarAccess.getMancheAccess().getGroup_11()); 
            // InternalMyUno.g:1926:2: ( rule__Manche__Group_11__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==52) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyUno.g:1926:3: rule__Manche__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Manche__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMancheAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__11__Impl"


    // $ANTLR start "rule__Manche__Group__12"
    // InternalMyUno.g:1934:1: rule__Manche__Group__12 : rule__Manche__Group__12__Impl ;
    public final void rule__Manche__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1938:1: ( rule__Manche__Group__12__Impl )
            // InternalMyUno.g:1939:2: rule__Manche__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__12"


    // $ANTLR start "rule__Manche__Group__12__Impl"
    // InternalMyUno.g:1945:1: rule__Manche__Group__12__Impl : ( ';' ) ;
    public final void rule__Manche__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1949:1: ( ( ';' ) )
            // InternalMyUno.g:1950:1: ( ';' )
            {
            // InternalMyUno.g:1950:1: ( ';' )
            // InternalMyUno.g:1951:2: ';'
            {
             before(grammarAccess.getMancheAccess().getSemicolonKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getSemicolonKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group__12__Impl"


    // $ANTLR start "rule__Manche__Group_2__0"
    // InternalMyUno.g:1961:1: rule__Manche__Group_2__0 : rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1 ;
    public final void rule__Manche__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1965:1: ( rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1 )
            // InternalMyUno.g:1966:2: rule__Manche__Group_2__0__Impl rule__Manche__Group_2__1
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__0"


    // $ANTLR start "rule__Manche__Group_2__0__Impl"
    // InternalMyUno.g:1973:1: rule__Manche__Group_2__0__Impl : ( 'Inversion' ) ;
    public final void rule__Manche__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1977:1: ( ( 'Inversion' ) )
            // InternalMyUno.g:1978:1: ( 'Inversion' )
            {
            // InternalMyUno.g:1978:1: ( 'Inversion' )
            // InternalMyUno.g:1979:2: 'Inversion'
            {
             before(grammarAccess.getMancheAccess().getInversionKeyword_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getInversionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__0__Impl"


    // $ANTLR start "rule__Manche__Group_2__1"
    // InternalMyUno.g:1988:1: rule__Manche__Group_2__1 : rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2 ;
    public final void rule__Manche__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:1992:1: ( rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2 )
            // InternalMyUno.g:1993:2: rule__Manche__Group_2__1__Impl rule__Manche__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__Manche__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__1"


    // $ANTLR start "rule__Manche__Group_2__1__Impl"
    // InternalMyUno.g:2000:1: rule__Manche__Group_2__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2004:1: ( ( '(' ) )
            // InternalMyUno.g:2005:1: ( '(' )
            {
            // InternalMyUno.g:2005:1: ( '(' )
            // InternalMyUno.g:2006:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__1__Impl"


    // $ANTLR start "rule__Manche__Group_2__2"
    // InternalMyUno.g:2015:1: rule__Manche__Group_2__2 : rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3 ;
    public final void rule__Manche__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2019:1: ( rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3 )
            // InternalMyUno.g:2020:2: rule__Manche__Group_2__2__Impl rule__Manche__Group_2__3
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__2"


    // $ANTLR start "rule__Manche__Group_2__2__Impl"
    // InternalMyUno.g:2027:1: rule__Manche__Group_2__2__Impl : ( ( rule__Manche__InversionAssignment_2_2 ) ) ;
    public final void rule__Manche__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2031:1: ( ( ( rule__Manche__InversionAssignment_2_2 ) ) )
            // InternalMyUno.g:2032:1: ( ( rule__Manche__InversionAssignment_2_2 ) )
            {
            // InternalMyUno.g:2032:1: ( ( rule__Manche__InversionAssignment_2_2 ) )
            // InternalMyUno.g:2033:2: ( rule__Manche__InversionAssignment_2_2 )
            {
             before(grammarAccess.getMancheAccess().getInversionAssignment_2_2()); 
            // InternalMyUno.g:2034:2: ( rule__Manche__InversionAssignment_2_2 )
            // InternalMyUno.g:2034:3: rule__Manche__InversionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__InversionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getInversionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__2__Impl"


    // $ANTLR start "rule__Manche__Group_2__3"
    // InternalMyUno.g:2042:1: rule__Manche__Group_2__3 : rule__Manche__Group_2__3__Impl ;
    public final void rule__Manche__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2046:1: ( rule__Manche__Group_2__3__Impl )
            // InternalMyUno.g:2047:2: rule__Manche__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__3"


    // $ANTLR start "rule__Manche__Group_2__3__Impl"
    // InternalMyUno.g:2053:1: rule__Manche__Group_2__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2057:1: ( ( ')' ) )
            // InternalMyUno.g:2058:1: ( ')' )
            {
            // InternalMyUno.g:2058:1: ( ')' )
            // InternalMyUno.g:2059:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_2__3__Impl"


    // $ANTLR start "rule__Manche__Group_3__0"
    // InternalMyUno.g:2069:1: rule__Manche__Group_3__0 : rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1 ;
    public final void rule__Manche__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2073:1: ( rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1 )
            // InternalMyUno.g:2074:2: rule__Manche__Group_3__0__Impl rule__Manche__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__0"


    // $ANTLR start "rule__Manche__Group_3__0__Impl"
    // InternalMyUno.g:2081:1: rule__Manche__Group_3__0__Impl : ( 'Tourner_mains' ) ;
    public final void rule__Manche__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2085:1: ( ( 'Tourner_mains' ) )
            // InternalMyUno.g:2086:1: ( 'Tourner_mains' )
            {
            // InternalMyUno.g:2086:1: ( 'Tourner_mains' )
            // InternalMyUno.g:2087:2: 'Tourner_mains'
            {
             before(grammarAccess.getMancheAccess().getTourner_mainsKeyword_3_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getTourner_mainsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__0__Impl"


    // $ANTLR start "rule__Manche__Group_3__1"
    // InternalMyUno.g:2096:1: rule__Manche__Group_3__1 : rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2 ;
    public final void rule__Manche__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2100:1: ( rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2 )
            // InternalMyUno.g:2101:2: rule__Manche__Group_3__1__Impl rule__Manche__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__Manche__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__1"


    // $ANTLR start "rule__Manche__Group_3__1__Impl"
    // InternalMyUno.g:2108:1: rule__Manche__Group_3__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2112:1: ( ( '(' ) )
            // InternalMyUno.g:2113:1: ( '(' )
            {
            // InternalMyUno.g:2113:1: ( '(' )
            // InternalMyUno.g:2114:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__1__Impl"


    // $ANTLR start "rule__Manche__Group_3__2"
    // InternalMyUno.g:2123:1: rule__Manche__Group_3__2 : rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3 ;
    public final void rule__Manche__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2127:1: ( rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3 )
            // InternalMyUno.g:2128:2: rule__Manche__Group_3__2__Impl rule__Manche__Group_3__3
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__2"


    // $ANTLR start "rule__Manche__Group_3__2__Impl"
    // InternalMyUno.g:2135:1: rule__Manche__Group_3__2__Impl : ( ( rule__Manche__Tourner_les_mainsAssignment_3_2 ) ) ;
    public final void rule__Manche__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2139:1: ( ( ( rule__Manche__Tourner_les_mainsAssignment_3_2 ) ) )
            // InternalMyUno.g:2140:1: ( ( rule__Manche__Tourner_les_mainsAssignment_3_2 ) )
            {
            // InternalMyUno.g:2140:1: ( ( rule__Manche__Tourner_les_mainsAssignment_3_2 ) )
            // InternalMyUno.g:2141:2: ( rule__Manche__Tourner_les_mainsAssignment_3_2 )
            {
             before(grammarAccess.getMancheAccess().getTourner_les_mainsAssignment_3_2()); 
            // InternalMyUno.g:2142:2: ( rule__Manche__Tourner_les_mainsAssignment_3_2 )
            // InternalMyUno.g:2142:3: rule__Manche__Tourner_les_mainsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Tourner_les_mainsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getTourner_les_mainsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__2__Impl"


    // $ANTLR start "rule__Manche__Group_3__3"
    // InternalMyUno.g:2150:1: rule__Manche__Group_3__3 : rule__Manche__Group_3__3__Impl ;
    public final void rule__Manche__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2154:1: ( rule__Manche__Group_3__3__Impl )
            // InternalMyUno.g:2155:2: rule__Manche__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__3"


    // $ANTLR start "rule__Manche__Group_3__3__Impl"
    // InternalMyUno.g:2161:1: rule__Manche__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2165:1: ( ( ')' ) )
            // InternalMyUno.g:2166:1: ( ')' )
            {
            // InternalMyUno.g:2166:1: ( ')' )
            // InternalMyUno.g:2167:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_3__3__Impl"


    // $ANTLR start "rule__Manche__Group_8__0"
    // InternalMyUno.g:2177:1: rule__Manche__Group_8__0 : rule__Manche__Group_8__0__Impl rule__Manche__Group_8__1 ;
    public final void rule__Manche__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2181:1: ( rule__Manche__Group_8__0__Impl rule__Manche__Group_8__1 )
            // InternalMyUno.g:2182:2: rule__Manche__Group_8__0__Impl rule__Manche__Group_8__1
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__0"


    // $ANTLR start "rule__Manche__Group_8__0__Impl"
    // InternalMyUno.g:2189:1: rule__Manche__Group_8__0__Impl : ( 'Cartes_1_a_9' ) ;
    public final void rule__Manche__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2193:1: ( ( 'Cartes_1_a_9' ) )
            // InternalMyUno.g:2194:1: ( 'Cartes_1_a_9' )
            {
            // InternalMyUno.g:2194:1: ( 'Cartes_1_a_9' )
            // InternalMyUno.g:2195:2: 'Cartes_1_a_9'
            {
             before(grammarAccess.getMancheAccess().getCartes_1_a_9Keyword_8_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getCartes_1_a_9Keyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__0__Impl"


    // $ANTLR start "rule__Manche__Group_8__1"
    // InternalMyUno.g:2204:1: rule__Manche__Group_8__1 : rule__Manche__Group_8__1__Impl rule__Manche__Group_8__2 ;
    public final void rule__Manche__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2208:1: ( rule__Manche__Group_8__1__Impl rule__Manche__Group_8__2 )
            // InternalMyUno.g:2209:2: rule__Manche__Group_8__1__Impl rule__Manche__Group_8__2
            {
            pushFollow(FOLLOW_28);
            rule__Manche__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__1"


    // $ANTLR start "rule__Manche__Group_8__1__Impl"
    // InternalMyUno.g:2216:1: rule__Manche__Group_8__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2220:1: ( ( '(' ) )
            // InternalMyUno.g:2221:1: ( '(' )
            {
            // InternalMyUno.g:2221:1: ( '(' )
            // InternalMyUno.g:2222:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_8_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__1__Impl"


    // $ANTLR start "rule__Manche__Group_8__2"
    // InternalMyUno.g:2231:1: rule__Manche__Group_8__2 : rule__Manche__Group_8__2__Impl rule__Manche__Group_8__3 ;
    public final void rule__Manche__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2235:1: ( rule__Manche__Group_8__2__Impl rule__Manche__Group_8__3 )
            // InternalMyUno.g:2236:2: rule__Manche__Group_8__2__Impl rule__Manche__Group_8__3
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__2"


    // $ANTLR start "rule__Manche__Group_8__2__Impl"
    // InternalMyUno.g:2243:1: rule__Manche__Group_8__2__Impl : ( ( rule__Manche__Cartes_1_9Assignment_8_2 ) ) ;
    public final void rule__Manche__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2247:1: ( ( ( rule__Manche__Cartes_1_9Assignment_8_2 ) ) )
            // InternalMyUno.g:2248:1: ( ( rule__Manche__Cartes_1_9Assignment_8_2 ) )
            {
            // InternalMyUno.g:2248:1: ( ( rule__Manche__Cartes_1_9Assignment_8_2 ) )
            // InternalMyUno.g:2249:2: ( rule__Manche__Cartes_1_9Assignment_8_2 )
            {
             before(grammarAccess.getMancheAccess().getCartes_1_9Assignment_8_2()); 
            // InternalMyUno.g:2250:2: ( rule__Manche__Cartes_1_9Assignment_8_2 )
            // InternalMyUno.g:2250:3: rule__Manche__Cartes_1_9Assignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Cartes_1_9Assignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getCartes_1_9Assignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__2__Impl"


    // $ANTLR start "rule__Manche__Group_8__3"
    // InternalMyUno.g:2258:1: rule__Manche__Group_8__3 : rule__Manche__Group_8__3__Impl ;
    public final void rule__Manche__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2262:1: ( rule__Manche__Group_8__3__Impl )
            // InternalMyUno.g:2263:2: rule__Manche__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_8__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__3"


    // $ANTLR start "rule__Manche__Group_8__3__Impl"
    // InternalMyUno.g:2269:1: rule__Manche__Group_8__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2273:1: ( ( ')' ) )
            // InternalMyUno.g:2274:1: ( ')' )
            {
            // InternalMyUno.g:2274:1: ( ')' )
            // InternalMyUno.g:2275:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_8_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_8__3__Impl"


    // $ANTLR start "rule__Manche__Group_10__0"
    // InternalMyUno.g:2285:1: rule__Manche__Group_10__0 : rule__Manche__Group_10__0__Impl rule__Manche__Group_10__1 ;
    public final void rule__Manche__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2289:1: ( rule__Manche__Group_10__0__Impl rule__Manche__Group_10__1 )
            // InternalMyUno.g:2290:2: rule__Manche__Group_10__0__Impl rule__Manche__Group_10__1
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__0"


    // $ANTLR start "rule__Manche__Group_10__0__Impl"
    // InternalMyUno.g:2297:1: rule__Manche__Group_10__0__Impl : ( 'Cumul' ) ;
    public final void rule__Manche__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2301:1: ( ( 'Cumul' ) )
            // InternalMyUno.g:2302:1: ( 'Cumul' )
            {
            // InternalMyUno.g:2302:1: ( 'Cumul' )
            // InternalMyUno.g:2303:2: 'Cumul'
            {
             before(grammarAccess.getMancheAccess().getCumulKeyword_10_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getCumulKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__0__Impl"


    // $ANTLR start "rule__Manche__Group_10__1"
    // InternalMyUno.g:2312:1: rule__Manche__Group_10__1 : rule__Manche__Group_10__1__Impl rule__Manche__Group_10__2 ;
    public final void rule__Manche__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2316:1: ( rule__Manche__Group_10__1__Impl rule__Manche__Group_10__2 )
            // InternalMyUno.g:2317:2: rule__Manche__Group_10__1__Impl rule__Manche__Group_10__2
            {
            pushFollow(FOLLOW_29);
            rule__Manche__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__1"


    // $ANTLR start "rule__Manche__Group_10__1__Impl"
    // InternalMyUno.g:2324:1: rule__Manche__Group_10__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2328:1: ( ( '(' ) )
            // InternalMyUno.g:2329:1: ( '(' )
            {
            // InternalMyUno.g:2329:1: ( '(' )
            // InternalMyUno.g:2330:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_10_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__1__Impl"


    // $ANTLR start "rule__Manche__Group_10__2"
    // InternalMyUno.g:2339:1: rule__Manche__Group_10__2 : rule__Manche__Group_10__2__Impl rule__Manche__Group_10__3 ;
    public final void rule__Manche__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2343:1: ( rule__Manche__Group_10__2__Impl rule__Manche__Group_10__3 )
            // InternalMyUno.g:2344:2: rule__Manche__Group_10__2__Impl rule__Manche__Group_10__3
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__2"


    // $ANTLR start "rule__Manche__Group_10__2__Impl"
    // InternalMyUno.g:2351:1: rule__Manche__Group_10__2__Impl : ( ( rule__Manche__CumulAssignment_10_2 ) ) ;
    public final void rule__Manche__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2355:1: ( ( ( rule__Manche__CumulAssignment_10_2 ) ) )
            // InternalMyUno.g:2356:1: ( ( rule__Manche__CumulAssignment_10_2 ) )
            {
            // InternalMyUno.g:2356:1: ( ( rule__Manche__CumulAssignment_10_2 ) )
            // InternalMyUno.g:2357:2: ( rule__Manche__CumulAssignment_10_2 )
            {
             before(grammarAccess.getMancheAccess().getCumulAssignment_10_2()); 
            // InternalMyUno.g:2358:2: ( rule__Manche__CumulAssignment_10_2 )
            // InternalMyUno.g:2358:3: rule__Manche__CumulAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__CumulAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getCumulAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__2__Impl"


    // $ANTLR start "rule__Manche__Group_10__3"
    // InternalMyUno.g:2366:1: rule__Manche__Group_10__3 : rule__Manche__Group_10__3__Impl ;
    public final void rule__Manche__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2370:1: ( rule__Manche__Group_10__3__Impl )
            // InternalMyUno.g:2371:2: rule__Manche__Group_10__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_10__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__3"


    // $ANTLR start "rule__Manche__Group_10__3__Impl"
    // InternalMyUno.g:2377:1: rule__Manche__Group_10__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2381:1: ( ( ')' ) )
            // InternalMyUno.g:2382:1: ( ')' )
            {
            // InternalMyUno.g:2382:1: ( ')' )
            // InternalMyUno.g:2383:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_10_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_10__3__Impl"


    // $ANTLR start "rule__Manche__Group_11__0"
    // InternalMyUno.g:2393:1: rule__Manche__Group_11__0 : rule__Manche__Group_11__0__Impl rule__Manche__Group_11__1 ;
    public final void rule__Manche__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2397:1: ( rule__Manche__Group_11__0__Impl rule__Manche__Group_11__1 )
            // InternalMyUno.g:2398:2: rule__Manche__Group_11__0__Impl rule__Manche__Group_11__1
            {
            pushFollow(FOLLOW_21);
            rule__Manche__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__0"


    // $ANTLR start "rule__Manche__Group_11__0__Impl"
    // InternalMyUno.g:2405:1: rule__Manche__Group_11__0__Impl : ( 'Contestations' ) ;
    public final void rule__Manche__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2409:1: ( ( 'Contestations' ) )
            // InternalMyUno.g:2410:1: ( 'Contestations' )
            {
            // InternalMyUno.g:2410:1: ( 'Contestations' )
            // InternalMyUno.g:2411:2: 'Contestations'
            {
             before(grammarAccess.getMancheAccess().getContestationsKeyword_11_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getContestationsKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__0__Impl"


    // $ANTLR start "rule__Manche__Group_11__1"
    // InternalMyUno.g:2420:1: rule__Manche__Group_11__1 : rule__Manche__Group_11__1__Impl rule__Manche__Group_11__2 ;
    public final void rule__Manche__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2424:1: ( rule__Manche__Group_11__1__Impl rule__Manche__Group_11__2 )
            // InternalMyUno.g:2425:2: rule__Manche__Group_11__1__Impl rule__Manche__Group_11__2
            {
            pushFollow(FOLLOW_30);
            rule__Manche__Group_11__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_11__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__1"


    // $ANTLR start "rule__Manche__Group_11__1__Impl"
    // InternalMyUno.g:2432:1: rule__Manche__Group_11__1__Impl : ( '(' ) ;
    public final void rule__Manche__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2436:1: ( ( '(' ) )
            // InternalMyUno.g:2437:1: ( '(' )
            {
            // InternalMyUno.g:2437:1: ( '(' )
            // InternalMyUno.g:2438:2: '('
            {
             before(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_11_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getLeftParenthesisKeyword_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__1__Impl"


    // $ANTLR start "rule__Manche__Group_11__2"
    // InternalMyUno.g:2447:1: rule__Manche__Group_11__2 : rule__Manche__Group_11__2__Impl rule__Manche__Group_11__3 ;
    public final void rule__Manche__Group_11__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2451:1: ( rule__Manche__Group_11__2__Impl rule__Manche__Group_11__3 )
            // InternalMyUno.g:2452:2: rule__Manche__Group_11__2__Impl rule__Manche__Group_11__3
            {
            pushFollow(FOLLOW_23);
            rule__Manche__Group_11__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Manche__Group_11__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__2"


    // $ANTLR start "rule__Manche__Group_11__2__Impl"
    // InternalMyUno.g:2459:1: rule__Manche__Group_11__2__Impl : ( ( rule__Manche__ContestationsAssignment_11_2 ) ) ;
    public final void rule__Manche__Group_11__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2463:1: ( ( ( rule__Manche__ContestationsAssignment_11_2 ) ) )
            // InternalMyUno.g:2464:1: ( ( rule__Manche__ContestationsAssignment_11_2 ) )
            {
            // InternalMyUno.g:2464:1: ( ( rule__Manche__ContestationsAssignment_11_2 ) )
            // InternalMyUno.g:2465:2: ( rule__Manche__ContestationsAssignment_11_2 )
            {
             before(grammarAccess.getMancheAccess().getContestationsAssignment_11_2()); 
            // InternalMyUno.g:2466:2: ( rule__Manche__ContestationsAssignment_11_2 )
            // InternalMyUno.g:2466:3: rule__Manche__ContestationsAssignment_11_2
            {
            pushFollow(FOLLOW_2);
            rule__Manche__ContestationsAssignment_11_2();

            state._fsp--;


            }

             after(grammarAccess.getMancheAccess().getContestationsAssignment_11_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__2__Impl"


    // $ANTLR start "rule__Manche__Group_11__3"
    // InternalMyUno.g:2474:1: rule__Manche__Group_11__3 : rule__Manche__Group_11__3__Impl ;
    public final void rule__Manche__Group_11__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2478:1: ( rule__Manche__Group_11__3__Impl )
            // InternalMyUno.g:2479:2: rule__Manche__Group_11__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Manche__Group_11__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__3"


    // $ANTLR start "rule__Manche__Group_11__3__Impl"
    // InternalMyUno.g:2485:1: rule__Manche__Group_11__3__Impl : ( ')' ) ;
    public final void rule__Manche__Group_11__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2489:1: ( ( ')' ) )
            // InternalMyUno.g:2490:1: ( ')' )
            {
            // InternalMyUno.g:2490:1: ( ')' )
            // InternalMyUno.g:2491:2: ')'
            {
             before(grammarAccess.getMancheAccess().getRightParenthesisKeyword_11_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMancheAccess().getRightParenthesisKeyword_11_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Group_11__3__Impl"


    // $ANTLR start "rule__Cartes_1_9__Group_2__0"
    // InternalMyUno.g:2501:1: rule__Cartes_1_9__Group_2__0 : rule__Cartes_1_9__Group_2__0__Impl rule__Cartes_1_9__Group_2__1 ;
    public final void rule__Cartes_1_9__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2505:1: ( rule__Cartes_1_9__Group_2__0__Impl rule__Cartes_1_9__Group_2__1 )
            // InternalMyUno.g:2506:2: rule__Cartes_1_9__Group_2__0__Impl rule__Cartes_1_9__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Cartes_1_9__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__0"


    // $ANTLR start "rule__Cartes_1_9__Group_2__0__Impl"
    // InternalMyUno.g:2513:1: rule__Cartes_1_9__Group_2__0__Impl : ( 'interception' ) ;
    public final void rule__Cartes_1_9__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2517:1: ( ( 'interception' ) )
            // InternalMyUno.g:2518:1: ( 'interception' )
            {
            // InternalMyUno.g:2518:1: ( 'interception' )
            // InternalMyUno.g:2519:2: 'interception'
            {
             before(grammarAccess.getCartes_1_9Access().getInterceptionKeyword_2_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getCartes_1_9Access().getInterceptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__0__Impl"


    // $ANTLR start "rule__Cartes_1_9__Group_2__1"
    // InternalMyUno.g:2528:1: rule__Cartes_1_9__Group_2__1 : rule__Cartes_1_9__Group_2__1__Impl rule__Cartes_1_9__Group_2__2 ;
    public final void rule__Cartes_1_9__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2532:1: ( rule__Cartes_1_9__Group_2__1__Impl rule__Cartes_1_9__Group_2__2 )
            // InternalMyUno.g:2533:2: rule__Cartes_1_9__Group_2__1__Impl rule__Cartes_1_9__Group_2__2
            {
            pushFollow(FOLLOW_31);
            rule__Cartes_1_9__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__1"


    // $ANTLR start "rule__Cartes_1_9__Group_2__1__Impl"
    // InternalMyUno.g:2540:1: rule__Cartes_1_9__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Cartes_1_9__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2544:1: ( ( '{' ) )
            // InternalMyUno.g:2545:1: ( '{' )
            {
            // InternalMyUno.g:2545:1: ( '{' )
            // InternalMyUno.g:2546:2: '{'
            {
             before(grammarAccess.getCartes_1_9Access().getLeftCurlyBracketKeyword_2_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCartes_1_9Access().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__1__Impl"


    // $ANTLR start "rule__Cartes_1_9__Group_2__2"
    // InternalMyUno.g:2555:1: rule__Cartes_1_9__Group_2__2 : rule__Cartes_1_9__Group_2__2__Impl rule__Cartes_1_9__Group_2__3 ;
    public final void rule__Cartes_1_9__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2559:1: ( rule__Cartes_1_9__Group_2__2__Impl rule__Cartes_1_9__Group_2__3 )
            // InternalMyUno.g:2560:2: rule__Cartes_1_9__Group_2__2__Impl rule__Cartes_1_9__Group_2__3
            {
            pushFollow(FOLLOW_9);
            rule__Cartes_1_9__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__2"


    // $ANTLR start "rule__Cartes_1_9__Group_2__2__Impl"
    // InternalMyUno.g:2567:1: rule__Cartes_1_9__Group_2__2__Impl : ( ( rule__Cartes_1_9__InterceptionAssignment_2_2 ) ) ;
    public final void rule__Cartes_1_9__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2571:1: ( ( ( rule__Cartes_1_9__InterceptionAssignment_2_2 ) ) )
            // InternalMyUno.g:2572:1: ( ( rule__Cartes_1_9__InterceptionAssignment_2_2 ) )
            {
            // InternalMyUno.g:2572:1: ( ( rule__Cartes_1_9__InterceptionAssignment_2_2 ) )
            // InternalMyUno.g:2573:2: ( rule__Cartes_1_9__InterceptionAssignment_2_2 )
            {
             before(grammarAccess.getCartes_1_9Access().getInterceptionAssignment_2_2()); 
            // InternalMyUno.g:2574:2: ( rule__Cartes_1_9__InterceptionAssignment_2_2 )
            // InternalMyUno.g:2574:3: rule__Cartes_1_9__InterceptionAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__InterceptionAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getCartes_1_9Access().getInterceptionAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__2__Impl"


    // $ANTLR start "rule__Cartes_1_9__Group_2__3"
    // InternalMyUno.g:2582:1: rule__Cartes_1_9__Group_2__3 : rule__Cartes_1_9__Group_2__3__Impl ;
    public final void rule__Cartes_1_9__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2586:1: ( rule__Cartes_1_9__Group_2__3__Impl )
            // InternalMyUno.g:2587:2: rule__Cartes_1_9__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__3"


    // $ANTLR start "rule__Cartes_1_9__Group_2__3__Impl"
    // InternalMyUno.g:2593:1: rule__Cartes_1_9__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Cartes_1_9__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2597:1: ( ( '}' ) )
            // InternalMyUno.g:2598:1: ( '}' )
            {
            // InternalMyUno.g:2598:1: ( '}' )
            // InternalMyUno.g:2599:2: '}'
            {
             before(grammarAccess.getCartes_1_9Access().getRightCurlyBracketKeyword_2_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCartes_1_9Access().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Group_2__3__Impl"


    // $ANTLR start "rule__Pioche__Group__0"
    // InternalMyUno.g:2609:1: rule__Pioche__Group__0 : rule__Pioche__Group__0__Impl rule__Pioche__Group__1 ;
    public final void rule__Pioche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2613:1: ( rule__Pioche__Group__0__Impl rule__Pioche__Group__1 )
            // InternalMyUno.g:2614:2: rule__Pioche__Group__0__Impl rule__Pioche__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Pioche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__0"


    // $ANTLR start "rule__Pioche__Group__0__Impl"
    // InternalMyUno.g:2621:1: rule__Pioche__Group__0__Impl : ( 'Pioche' ) ;
    public final void rule__Pioche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2625:1: ( ( 'Pioche' ) )
            // InternalMyUno.g:2626:1: ( 'Pioche' )
            {
            // InternalMyUno.g:2626:1: ( 'Pioche' )
            // InternalMyUno.g:2627:2: 'Pioche'
            {
             before(grammarAccess.getPiocheAccess().getPiocheKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getPiocheAccess().getPiocheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__0__Impl"


    // $ANTLR start "rule__Pioche__Group__1"
    // InternalMyUno.g:2636:1: rule__Pioche__Group__1 : rule__Pioche__Group__1__Impl rule__Pioche__Group__2 ;
    public final void rule__Pioche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2640:1: ( rule__Pioche__Group__1__Impl rule__Pioche__Group__2 )
            // InternalMyUno.g:2641:2: rule__Pioche__Group__1__Impl rule__Pioche__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__Pioche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__1"


    // $ANTLR start "rule__Pioche__Group__1__Impl"
    // InternalMyUno.g:2648:1: rule__Pioche__Group__1__Impl : ( '(' ) ;
    public final void rule__Pioche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2652:1: ( ( '(' ) )
            // InternalMyUno.g:2653:1: ( '(' )
            {
            // InternalMyUno.g:2653:1: ( '(' )
            // InternalMyUno.g:2654:2: '('
            {
             before(grammarAccess.getPiocheAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPiocheAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__1__Impl"


    // $ANTLR start "rule__Pioche__Group__2"
    // InternalMyUno.g:2663:1: rule__Pioche__Group__2 : rule__Pioche__Group__2__Impl rule__Pioche__Group__3 ;
    public final void rule__Pioche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2667:1: ( rule__Pioche__Group__2__Impl rule__Pioche__Group__3 )
            // InternalMyUno.g:2668:2: rule__Pioche__Group__2__Impl rule__Pioche__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__Pioche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__2"


    // $ANTLR start "rule__Pioche__Group__2__Impl"
    // InternalMyUno.g:2675:1: rule__Pioche__Group__2__Impl : ( 'nb_cartes_a_piocher:' ) ;
    public final void rule__Pioche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2679:1: ( ( 'nb_cartes_a_piocher:' ) )
            // InternalMyUno.g:2680:1: ( 'nb_cartes_a_piocher:' )
            {
            // InternalMyUno.g:2680:1: ( 'nb_cartes_a_piocher:' )
            // InternalMyUno.g:2681:2: 'nb_cartes_a_piocher:'
            {
             before(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__2__Impl"


    // $ANTLR start "rule__Pioche__Group__3"
    // InternalMyUno.g:2690:1: rule__Pioche__Group__3 : rule__Pioche__Group__3__Impl rule__Pioche__Group__4 ;
    public final void rule__Pioche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2694:1: ( rule__Pioche__Group__3__Impl rule__Pioche__Group__4 )
            // InternalMyUno.g:2695:2: rule__Pioche__Group__3__Impl rule__Pioche__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Pioche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__3"


    // $ANTLR start "rule__Pioche__Group__3__Impl"
    // InternalMyUno.g:2702:1: rule__Pioche__Group__3__Impl : ( ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 ) ) ;
    public final void rule__Pioche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2706:1: ( ( ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 ) ) )
            // InternalMyUno.g:2707:1: ( ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 ) )
            {
            // InternalMyUno.g:2707:1: ( ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 ) )
            // InternalMyUno.g:2708:2: ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 )
            {
             before(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherAssignment_3()); 
            // InternalMyUno.g:2709:2: ( rule__Pioche__Nb_cartes_a_piocherAssignment_3 )
            // InternalMyUno.g:2709:3: rule__Pioche__Nb_cartes_a_piocherAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Pioche__Nb_cartes_a_piocherAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__3__Impl"


    // $ANTLR start "rule__Pioche__Group__4"
    // InternalMyUno.g:2717:1: rule__Pioche__Group__4 : rule__Pioche__Group__4__Impl rule__Pioche__Group__5 ;
    public final void rule__Pioche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2721:1: ( rule__Pioche__Group__4__Impl rule__Pioche__Group__5 )
            // InternalMyUno.g:2722:2: rule__Pioche__Group__4__Impl rule__Pioche__Group__5
            {
            pushFollow(FOLLOW_35);
            rule__Pioche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__4"


    // $ANTLR start "rule__Pioche__Group__4__Impl"
    // InternalMyUno.g:2729:1: rule__Pioche__Group__4__Impl : ( 'jouer_apres_pioche:' ) ;
    public final void rule__Pioche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2733:1: ( ( 'jouer_apres_pioche:' ) )
            // InternalMyUno.g:2734:1: ( 'jouer_apres_pioche:' )
            {
            // InternalMyUno.g:2734:1: ( 'jouer_apres_pioche:' )
            // InternalMyUno.g:2735:2: 'jouer_apres_pioche:'
            {
             before(grammarAccess.getPiocheAccess().getJouer_apres_piocheKeyword_4()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getPiocheAccess().getJouer_apres_piocheKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__4__Impl"


    // $ANTLR start "rule__Pioche__Group__5"
    // InternalMyUno.g:2744:1: rule__Pioche__Group__5 : rule__Pioche__Group__5__Impl rule__Pioche__Group__6 ;
    public final void rule__Pioche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2748:1: ( rule__Pioche__Group__5__Impl rule__Pioche__Group__6 )
            // InternalMyUno.g:2749:2: rule__Pioche__Group__5__Impl rule__Pioche__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Pioche__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pioche__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__5"


    // $ANTLR start "rule__Pioche__Group__5__Impl"
    // InternalMyUno.g:2756:1: rule__Pioche__Group__5__Impl : ( ( rule__Pioche__Jouer_apres_piocheAssignment_5 ) ) ;
    public final void rule__Pioche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2760:1: ( ( ( rule__Pioche__Jouer_apres_piocheAssignment_5 ) ) )
            // InternalMyUno.g:2761:1: ( ( rule__Pioche__Jouer_apres_piocheAssignment_5 ) )
            {
            // InternalMyUno.g:2761:1: ( ( rule__Pioche__Jouer_apres_piocheAssignment_5 ) )
            // InternalMyUno.g:2762:2: ( rule__Pioche__Jouer_apres_piocheAssignment_5 )
            {
             before(grammarAccess.getPiocheAccess().getJouer_apres_piocheAssignment_5()); 
            // InternalMyUno.g:2763:2: ( rule__Pioche__Jouer_apres_piocheAssignment_5 )
            // InternalMyUno.g:2763:3: rule__Pioche__Jouer_apres_piocheAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Pioche__Jouer_apres_piocheAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPiocheAccess().getJouer_apres_piocheAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__5__Impl"


    // $ANTLR start "rule__Pioche__Group__6"
    // InternalMyUno.g:2771:1: rule__Pioche__Group__6 : rule__Pioche__Group__6__Impl ;
    public final void rule__Pioche__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2775:1: ( rule__Pioche__Group__6__Impl )
            // InternalMyUno.g:2776:2: rule__Pioche__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pioche__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__6"


    // $ANTLR start "rule__Pioche__Group__6__Impl"
    // InternalMyUno.g:2782:1: rule__Pioche__Group__6__Impl : ( ')' ) ;
    public final void rule__Pioche__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2786:1: ( ( ')' ) )
            // InternalMyUno.g:2787:1: ( ')' )
            {
            // InternalMyUno.g:2787:1: ( ')' )
            // InternalMyUno.g:2788:2: ')'
            {
             before(grammarAccess.getPiocheAccess().getRightParenthesisKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPiocheAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Group__6__Impl"


    // $ANTLR start "rule__Fin_Manche__Group__0"
    // InternalMyUno.g:2798:1: rule__Fin_Manche__Group__0 : rule__Fin_Manche__Group__0__Impl rule__Fin_Manche__Group__1 ;
    public final void rule__Fin_Manche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2802:1: ( rule__Fin_Manche__Group__0__Impl rule__Fin_Manche__Group__1 )
            // InternalMyUno.g:2803:2: rule__Fin_Manche__Group__0__Impl rule__Fin_Manche__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Fin_Manche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__0"


    // $ANTLR start "rule__Fin_Manche__Group__0__Impl"
    // InternalMyUno.g:2810:1: rule__Fin_Manche__Group__0__Impl : ( 'Fin_manche' ) ;
    public final void rule__Fin_Manche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2814:1: ( ( 'Fin_manche' ) )
            // InternalMyUno.g:2815:1: ( 'Fin_manche' )
            {
            // InternalMyUno.g:2815:1: ( 'Fin_manche' )
            // InternalMyUno.g:2816:2: 'Fin_manche'
            {
             before(grammarAccess.getFin_MancheAccess().getFin_mancheKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getFin_MancheAccess().getFin_mancheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__0__Impl"


    // $ANTLR start "rule__Fin_Manche__Group__1"
    // InternalMyUno.g:2825:1: rule__Fin_Manche__Group__1 : rule__Fin_Manche__Group__1__Impl rule__Fin_Manche__Group__2 ;
    public final void rule__Fin_Manche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2829:1: ( rule__Fin_Manche__Group__1__Impl rule__Fin_Manche__Group__2 )
            // InternalMyUno.g:2830:2: rule__Fin_Manche__Group__1__Impl rule__Fin_Manche__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__Fin_Manche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__1"


    // $ANTLR start "rule__Fin_Manche__Group__1__Impl"
    // InternalMyUno.g:2837:1: rule__Fin_Manche__Group__1__Impl : ( ':' ) ;
    public final void rule__Fin_Manche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2841:1: ( ( ':' ) )
            // InternalMyUno.g:2842:1: ( ':' )
            {
            // InternalMyUno.g:2842:1: ( ':' )
            // InternalMyUno.g:2843:2: ':'
            {
             before(grammarAccess.getFin_MancheAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFin_MancheAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__1__Impl"


    // $ANTLR start "rule__Fin_Manche__Group__2"
    // InternalMyUno.g:2852:1: rule__Fin_Manche__Group__2 : rule__Fin_Manche__Group__2__Impl rule__Fin_Manche__Group__3 ;
    public final void rule__Fin_Manche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2856:1: ( rule__Fin_Manche__Group__2__Impl rule__Fin_Manche__Group__3 )
            // InternalMyUno.g:2857:2: rule__Fin_Manche__Group__2__Impl rule__Fin_Manche__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Fin_Manche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__2"


    // $ANTLR start "rule__Fin_Manche__Group__2__Impl"
    // InternalMyUno.g:2864:1: rule__Fin_Manche__Group__2__Impl : ( ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )? ) ;
    public final void rule__Fin_Manche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2868:1: ( ( ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )? ) )
            // InternalMyUno.g:2869:1: ( ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )? )
            {
            // InternalMyUno.g:2869:1: ( ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )? )
            // InternalMyUno.g:2870:2: ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )?
            {
             before(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireAssignment_2()); 
            // InternalMyUno.g:2871:2: ( rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==78) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyUno.g:2871:3: rule__Fin_Manche__Dire_uno_obligatoireAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Fin_Manche__Dire_uno_obligatoireAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__2__Impl"


    // $ANTLR start "rule__Fin_Manche__Group__3"
    // InternalMyUno.g:2879:1: rule__Fin_Manche__Group__3 : rule__Fin_Manche__Group__3__Impl rule__Fin_Manche__Group__4 ;
    public final void rule__Fin_Manche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2883:1: ( rule__Fin_Manche__Group__3__Impl rule__Fin_Manche__Group__4 )
            // InternalMyUno.g:2884:2: rule__Fin_Manche__Group__3__Impl rule__Fin_Manche__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__Fin_Manche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__3"


    // $ANTLR start "rule__Fin_Manche__Group__3__Impl"
    // InternalMyUno.g:2891:1: rule__Fin_Manche__Group__3__Impl : ( ( rule__Fin_Manche__Points_mancheAssignment_3 ) ) ;
    public final void rule__Fin_Manche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2895:1: ( ( ( rule__Fin_Manche__Points_mancheAssignment_3 ) ) )
            // InternalMyUno.g:2896:1: ( ( rule__Fin_Manche__Points_mancheAssignment_3 ) )
            {
            // InternalMyUno.g:2896:1: ( ( rule__Fin_Manche__Points_mancheAssignment_3 ) )
            // InternalMyUno.g:2897:2: ( rule__Fin_Manche__Points_mancheAssignment_3 )
            {
             before(grammarAccess.getFin_MancheAccess().getPoints_mancheAssignment_3()); 
            // InternalMyUno.g:2898:2: ( rule__Fin_Manche__Points_mancheAssignment_3 )
            // InternalMyUno.g:2898:3: rule__Fin_Manche__Points_mancheAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Points_mancheAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFin_MancheAccess().getPoints_mancheAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__3__Impl"


    // $ANTLR start "rule__Fin_Manche__Group__4"
    // InternalMyUno.g:2906:1: rule__Fin_Manche__Group__4 : rule__Fin_Manche__Group__4__Impl ;
    public final void rule__Fin_Manche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2910:1: ( rule__Fin_Manche__Group__4__Impl )
            // InternalMyUno.g:2911:2: rule__Fin_Manche__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Manche__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__4"


    // $ANTLR start "rule__Fin_Manche__Group__4__Impl"
    // InternalMyUno.g:2917:1: rule__Fin_Manche__Group__4__Impl : ( ';' ) ;
    public final void rule__Fin_Manche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2921:1: ( ( ';' ) )
            // InternalMyUno.g:2922:1: ( ';' )
            {
            // InternalMyUno.g:2922:1: ( ';' )
            // InternalMyUno.g:2923:2: ';'
            {
             before(grammarAccess.getFin_MancheAccess().getSemicolonKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFin_MancheAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Group__4__Impl"


    // $ANTLR start "rule__Points_manche__Group__0"
    // InternalMyUno.g:2933:1: rule__Points_manche__Group__0 : rule__Points_manche__Group__0__Impl rule__Points_manche__Group__1 ;
    public final void rule__Points_manche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2937:1: ( rule__Points_manche__Group__0__Impl rule__Points_manche__Group__1 )
            // InternalMyUno.g:2938:2: rule__Points_manche__Group__0__Impl rule__Points_manche__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Points_manche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__0"


    // $ANTLR start "rule__Points_manche__Group__0__Impl"
    // InternalMyUno.g:2945:1: rule__Points_manche__Group__0__Impl : ( 'Points_manche' ) ;
    public final void rule__Points_manche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2949:1: ( ( 'Points_manche' ) )
            // InternalMyUno.g:2950:1: ( 'Points_manche' )
            {
            // InternalMyUno.g:2950:1: ( 'Points_manche' )
            // InternalMyUno.g:2951:2: 'Points_manche'
            {
             before(grammarAccess.getPoints_mancheAccess().getPoints_mancheKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPoints_mancheAccess().getPoints_mancheKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__0__Impl"


    // $ANTLR start "rule__Points_manche__Group__1"
    // InternalMyUno.g:2960:1: rule__Points_manche__Group__1 : rule__Points_manche__Group__1__Impl rule__Points_manche__Group__2 ;
    public final void rule__Points_manche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2964:1: ( rule__Points_manche__Group__1__Impl rule__Points_manche__Group__2 )
            // InternalMyUno.g:2965:2: rule__Points_manche__Group__1__Impl rule__Points_manche__Group__2
            {
            pushFollow(FOLLOW_38);
            rule__Points_manche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__1"


    // $ANTLR start "rule__Points_manche__Group__1__Impl"
    // InternalMyUno.g:2972:1: rule__Points_manche__Group__1__Impl : ( '(' ) ;
    public final void rule__Points_manche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2976:1: ( ( '(' ) )
            // InternalMyUno.g:2977:1: ( '(' )
            {
            // InternalMyUno.g:2977:1: ( '(' )
            // InternalMyUno.g:2978:2: '('
            {
             before(grammarAccess.getPoints_mancheAccess().getLeftParenthesisKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getPoints_mancheAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__1__Impl"


    // $ANTLR start "rule__Points_manche__Group__2"
    // InternalMyUno.g:2987:1: rule__Points_manche__Group__2 : rule__Points_manche__Group__2__Impl rule__Points_manche__Group__3 ;
    public final void rule__Points_manche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:2991:1: ( rule__Points_manche__Group__2__Impl rule__Points_manche__Group__3 )
            // InternalMyUno.g:2992:2: rule__Points_manche__Group__2__Impl rule__Points_manche__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Points_manche__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__2"


    // $ANTLR start "rule__Points_manche__Group__2__Impl"
    // InternalMyUno.g:2999:1: rule__Points_manche__Group__2__Impl : ( 'vainqueur_manche:' ) ;
    public final void rule__Points_manche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3003:1: ( ( 'vainqueur_manche:' ) )
            // InternalMyUno.g:3004:1: ( 'vainqueur_manche:' )
            {
            // InternalMyUno.g:3004:1: ( 'vainqueur_manche:' )
            // InternalMyUno.g:3005:2: 'vainqueur_manche:'
            {
             before(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheKeyword_2()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__2__Impl"


    // $ANTLR start "rule__Points_manche__Group__3"
    // InternalMyUno.g:3014:1: rule__Points_manche__Group__3 : rule__Points_manche__Group__3__Impl rule__Points_manche__Group__4 ;
    public final void rule__Points_manche__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3018:1: ( rule__Points_manche__Group__3__Impl rule__Points_manche__Group__4 )
            // InternalMyUno.g:3019:2: rule__Points_manche__Group__3__Impl rule__Points_manche__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Points_manche__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__3"


    // $ANTLR start "rule__Points_manche__Group__3__Impl"
    // InternalMyUno.g:3026:1: rule__Points_manche__Group__3__Impl : ( ( rule__Points_manche__Vainqueur_mancheAssignment_3 ) ) ;
    public final void rule__Points_manche__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3030:1: ( ( ( rule__Points_manche__Vainqueur_mancheAssignment_3 ) ) )
            // InternalMyUno.g:3031:1: ( ( rule__Points_manche__Vainqueur_mancheAssignment_3 ) )
            {
            // InternalMyUno.g:3031:1: ( ( rule__Points_manche__Vainqueur_mancheAssignment_3 ) )
            // InternalMyUno.g:3032:2: ( rule__Points_manche__Vainqueur_mancheAssignment_3 )
            {
             before(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheAssignment_3()); 
            // InternalMyUno.g:3033:2: ( rule__Points_manche__Vainqueur_mancheAssignment_3 )
            // InternalMyUno.g:3033:3: rule__Points_manche__Vainqueur_mancheAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Points_manche__Vainqueur_mancheAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__3__Impl"


    // $ANTLR start "rule__Points_manche__Group__4"
    // InternalMyUno.g:3041:1: rule__Points_manche__Group__4 : rule__Points_manche__Group__4__Impl rule__Points_manche__Group__5 ;
    public final void rule__Points_manche__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3045:1: ( rule__Points_manche__Group__4__Impl rule__Points_manche__Group__5 )
            // InternalMyUno.g:3046:2: rule__Points_manche__Group__4__Impl rule__Points_manche__Group__5
            {
            pushFollow(FOLLOW_41);
            rule__Points_manche__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__4"


    // $ANTLR start "rule__Points_manche__Group__4__Impl"
    // InternalMyUno.g:3053:1: rule__Points_manche__Group__4__Impl : ( 'perdants_manche:' ) ;
    public final void rule__Points_manche__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3057:1: ( ( 'perdants_manche:' ) )
            // InternalMyUno.g:3058:1: ( 'perdants_manche:' )
            {
            // InternalMyUno.g:3058:1: ( 'perdants_manche:' )
            // InternalMyUno.g:3059:2: 'perdants_manche:'
            {
             before(grammarAccess.getPoints_mancheAccess().getPerdants_mancheKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPoints_mancheAccess().getPerdants_mancheKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__4__Impl"


    // $ANTLR start "rule__Points_manche__Group__5"
    // InternalMyUno.g:3068:1: rule__Points_manche__Group__5 : rule__Points_manche__Group__5__Impl rule__Points_manche__Group__6 ;
    public final void rule__Points_manche__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3072:1: ( rule__Points_manche__Group__5__Impl rule__Points_manche__Group__6 )
            // InternalMyUno.g:3073:2: rule__Points_manche__Group__5__Impl rule__Points_manche__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__Points_manche__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__5"


    // $ANTLR start "rule__Points_manche__Group__5__Impl"
    // InternalMyUno.g:3080:1: rule__Points_manche__Group__5__Impl : ( ( rule__Points_manche__Perdants_mancheAssignment_5 ) ) ;
    public final void rule__Points_manche__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3084:1: ( ( ( rule__Points_manche__Perdants_mancheAssignment_5 ) ) )
            // InternalMyUno.g:3085:1: ( ( rule__Points_manche__Perdants_mancheAssignment_5 ) )
            {
            // InternalMyUno.g:3085:1: ( ( rule__Points_manche__Perdants_mancheAssignment_5 ) )
            // InternalMyUno.g:3086:2: ( rule__Points_manche__Perdants_mancheAssignment_5 )
            {
             before(grammarAccess.getPoints_mancheAccess().getPerdants_mancheAssignment_5()); 
            // InternalMyUno.g:3087:2: ( rule__Points_manche__Perdants_mancheAssignment_5 )
            // InternalMyUno.g:3087:3: rule__Points_manche__Perdants_mancheAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Points_manche__Perdants_mancheAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPoints_mancheAccess().getPerdants_mancheAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__5__Impl"


    // $ANTLR start "rule__Points_manche__Group__6"
    // InternalMyUno.g:3095:1: rule__Points_manche__Group__6 : rule__Points_manche__Group__6__Impl ;
    public final void rule__Points_manche__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3099:1: ( rule__Points_manche__Group__6__Impl )
            // InternalMyUno.g:3100:2: rule__Points_manche__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Points_manche__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__6"


    // $ANTLR start "rule__Points_manche__Group__6__Impl"
    // InternalMyUno.g:3106:1: rule__Points_manche__Group__6__Impl : ( ')' ) ;
    public final void rule__Points_manche__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3110:1: ( ( ')' ) )
            // InternalMyUno.g:3111:1: ( ')' )
            {
            // InternalMyUno.g:3111:1: ( ')' )
            // InternalMyUno.g:3112:2: ')'
            {
             before(grammarAccess.getPoints_mancheAccess().getRightParenthesisKeyword_6()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getPoints_mancheAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Group__6__Impl"


    // $ANTLR start "rule__Perdants_manche__Group__0"
    // InternalMyUno.g:3122:1: rule__Perdants_manche__Group__0 : rule__Perdants_manche__Group__0__Impl rule__Perdants_manche__Group__1 ;
    public final void rule__Perdants_manche__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3126:1: ( rule__Perdants_manche__Group__0__Impl rule__Perdants_manche__Group__1 )
            // InternalMyUno.g:3127:2: rule__Perdants_manche__Group__0__Impl rule__Perdants_manche__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Perdants_manche__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__0"


    // $ANTLR start "rule__Perdants_manche__Group__0__Impl"
    // InternalMyUno.g:3134:1: rule__Perdants_manche__Group__0__Impl : ( () ) ;
    public final void rule__Perdants_manche__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3138:1: ( ( () ) )
            // InternalMyUno.g:3139:1: ( () )
            {
            // InternalMyUno.g:3139:1: ( () )
            // InternalMyUno.g:3140:2: ()
            {
             before(grammarAccess.getPerdants_mancheAccess().getPerdants_mancheAction_0()); 
            // InternalMyUno.g:3141:2: ()
            // InternalMyUno.g:3141:3: 
            {
            }

             after(grammarAccess.getPerdants_mancheAccess().getPerdants_mancheAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__0__Impl"


    // $ANTLR start "rule__Perdants_manche__Group__1"
    // InternalMyUno.g:3149:1: rule__Perdants_manche__Group__1 : rule__Perdants_manche__Group__1__Impl rule__Perdants_manche__Group__2 ;
    public final void rule__Perdants_manche__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3153:1: ( rule__Perdants_manche__Group__1__Impl rule__Perdants_manche__Group__2 )
            // InternalMyUno.g:3154:2: rule__Perdants_manche__Group__1__Impl rule__Perdants_manche__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__Perdants_manche__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__1"


    // $ANTLR start "rule__Perdants_manche__Group__1__Impl"
    // InternalMyUno.g:3161:1: rule__Perdants_manche__Group__1__Impl : ( ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )? ) ;
    public final void rule__Perdants_manche__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3165:1: ( ( ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )? ) )
            // InternalMyUno.g:3166:1: ( ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )? )
            {
            // InternalMyUno.g:3166:1: ( ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )? )
            // InternalMyUno.g:3167:2: ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )?
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsAssignment_1()); 
            // InternalMyUno.g:3168:2: ( rule__Perdants_manche__Pm_zero_ptsAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==79) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyUno.g:3168:3: rule__Perdants_manche__Pm_zero_ptsAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perdants_manche__Pm_zero_ptsAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__1__Impl"


    // $ANTLR start "rule__Perdants_manche__Group__2"
    // InternalMyUno.g:3176:1: rule__Perdants_manche__Group__2 : rule__Perdants_manche__Group__2__Impl ;
    public final void rule__Perdants_manche__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3180:1: ( rule__Perdants_manche__Group__2__Impl )
            // InternalMyUno.g:3181:2: rule__Perdants_manche__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__2"


    // $ANTLR start "rule__Perdants_manche__Group__2__Impl"
    // InternalMyUno.g:3187:1: rule__Perdants_manche__Group__2__Impl : ( ( rule__Perdants_manche__Group_2__0 )? ) ;
    public final void rule__Perdants_manche__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3191:1: ( ( ( rule__Perdants_manche__Group_2__0 )? ) )
            // InternalMyUno.g:3192:1: ( ( rule__Perdants_manche__Group_2__0 )? )
            {
            // InternalMyUno.g:3192:1: ( ( rule__Perdants_manche__Group_2__0 )? )
            // InternalMyUno.g:3193:2: ( rule__Perdants_manche__Group_2__0 )?
            {
             before(grammarAccess.getPerdants_mancheAccess().getGroup_2()); 
            // InternalMyUno.g:3194:2: ( rule__Perdants_manche__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==80) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyUno.g:3194:3: rule__Perdants_manche__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perdants_manche__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerdants_mancheAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group__2__Impl"


    // $ANTLR start "rule__Perdants_manche__Group_2__0"
    // InternalMyUno.g:3203:1: rule__Perdants_manche__Group_2__0 : rule__Perdants_manche__Group_2__0__Impl rule__Perdants_manche__Group_2__1 ;
    public final void rule__Perdants_manche__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3207:1: ( rule__Perdants_manche__Group_2__0__Impl rule__Perdants_manche__Group_2__1 )
            // InternalMyUno.g:3208:2: rule__Perdants_manche__Group_2__0__Impl rule__Perdants_manche__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Perdants_manche__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2__0"


    // $ANTLR start "rule__Perdants_manche__Group_2__0__Impl"
    // InternalMyUno.g:3215:1: rule__Perdants_manche__Group_2__0__Impl : ( ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 ) ) ;
    public final void rule__Perdants_manche__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3219:1: ( ( ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 ) ) )
            // InternalMyUno.g:3220:1: ( ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 ) )
            {
            // InternalMyUno.g:3220:1: ( ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 ) )
            // InternalMyUno.g:3221:2: ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 )
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesAssignment_2_0()); 
            // InternalMyUno.g:3222:2: ( rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 )
            // InternalMyUno.g:3222:3: rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2__0__Impl"


    // $ANTLR start "rule__Perdants_manche__Group_2__1"
    // InternalMyUno.g:3230:1: rule__Perdants_manche__Group_2__1 : rule__Perdants_manche__Group_2__1__Impl ;
    public final void rule__Perdants_manche__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3234:1: ( rule__Perdants_manche__Group_2__1__Impl )
            // InternalMyUno.g:3235:2: rule__Perdants_manche__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2__1"


    // $ANTLR start "rule__Perdants_manche__Group_2__1__Impl"
    // InternalMyUno.g:3241:1: rule__Perdants_manche__Group_2__1__Impl : ( ( rule__Perdants_manche__Group_2_1__0 )? ) ;
    public final void rule__Perdants_manche__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3245:1: ( ( ( rule__Perdants_manche__Group_2_1__0 )? ) )
            // InternalMyUno.g:3246:1: ( ( rule__Perdants_manche__Group_2_1__0 )? )
            {
            // InternalMyUno.g:3246:1: ( ( rule__Perdants_manche__Group_2_1__0 )? )
            // InternalMyUno.g:3247:2: ( rule__Perdants_manche__Group_2_1__0 )?
            {
             before(grammarAccess.getPerdants_mancheAccess().getGroup_2_1()); 
            // InternalMyUno.g:3248:2: ( rule__Perdants_manche__Group_2_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyUno.g:3248:3: rule__Perdants_manche__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Perdants_manche__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPerdants_mancheAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2__1__Impl"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__0"
    // InternalMyUno.g:3257:1: rule__Perdants_manche__Group_2_1__0 : rule__Perdants_manche__Group_2_1__0__Impl rule__Perdants_manche__Group_2_1__1 ;
    public final void rule__Perdants_manche__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3261:1: ( rule__Perdants_manche__Group_2_1__0__Impl rule__Perdants_manche__Group_2_1__1 )
            // InternalMyUno.g:3262:2: rule__Perdants_manche__Group_2_1__0__Impl rule__Perdants_manche__Group_2_1__1
            {
            pushFollow(FOLLOW_42);
            rule__Perdants_manche__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__0"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__0__Impl"
    // InternalMyUno.g:3269:1: rule__Perdants_manche__Group_2_1__0__Impl : ( '{' ) ;
    public final void rule__Perdants_manche__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3273:1: ( ( '{' ) )
            // InternalMyUno.g:3274:1: ( '{' )
            {
            // InternalMyUno.g:3274:1: ( '{' )
            // InternalMyUno.g:3275:2: '{'
            {
             before(grammarAccess.getPerdants_mancheAccess().getLeftCurlyBracketKeyword_2_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPerdants_mancheAccess().getLeftCurlyBracketKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__0__Impl"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__1"
    // InternalMyUno.g:3284:1: rule__Perdants_manche__Group_2_1__1 : rule__Perdants_manche__Group_2_1__1__Impl rule__Perdants_manche__Group_2_1__2 ;
    public final void rule__Perdants_manche__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3288:1: ( rule__Perdants_manche__Group_2_1__1__Impl rule__Perdants_manche__Group_2_1__2 )
            // InternalMyUno.g:3289:2: rule__Perdants_manche__Group_2_1__1__Impl rule__Perdants_manche__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Perdants_manche__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__1"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__1__Impl"
    // InternalMyUno.g:3296:1: rule__Perdants_manche__Group_2_1__1__Impl : ( 'elimination_si_500_pts' ) ;
    public final void rule__Perdants_manche__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3300:1: ( ( 'elimination_si_500_pts' ) )
            // InternalMyUno.g:3301:1: ( 'elimination_si_500_pts' )
            {
            // InternalMyUno.g:3301:1: ( 'elimination_si_500_pts' )
            // InternalMyUno.g:3302:2: 'elimination_si_500_pts'
            {
             before(grammarAccess.getPerdants_mancheAccess().getElimination_si_500_ptsKeyword_2_1_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPerdants_mancheAccess().getElimination_si_500_ptsKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__1__Impl"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__2"
    // InternalMyUno.g:3311:1: rule__Perdants_manche__Group_2_1__2 : rule__Perdants_manche__Group_2_1__2__Impl ;
    public final void rule__Perdants_manche__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3315:1: ( rule__Perdants_manche__Group_2_1__2__Impl )
            // InternalMyUno.g:3316:2: rule__Perdants_manche__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Perdants_manche__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__2"


    // $ANTLR start "rule__Perdants_manche__Group_2_1__2__Impl"
    // InternalMyUno.g:3322:1: rule__Perdants_manche__Group_2_1__2__Impl : ( '}' ) ;
    public final void rule__Perdants_manche__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3326:1: ( ( '}' ) )
            // InternalMyUno.g:3327:1: ( '}' )
            {
            // InternalMyUno.g:3327:1: ( '}' )
            // InternalMyUno.g:3328:2: '}'
            {
             before(grammarAccess.getPerdants_mancheAccess().getRightCurlyBracketKeyword_2_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPerdants_mancheAccess().getRightCurlyBracketKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Group_2_1__2__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__0"
    // InternalMyUno.g:3338:1: rule__Fin_Partie__Group__0 : rule__Fin_Partie__Group__0__Impl rule__Fin_Partie__Group__1 ;
    public final void rule__Fin_Partie__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3342:1: ( rule__Fin_Partie__Group__0__Impl rule__Fin_Partie__Group__1 )
            // InternalMyUno.g:3343:2: rule__Fin_Partie__Group__0__Impl rule__Fin_Partie__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Fin_Partie__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__0"


    // $ANTLR start "rule__Fin_Partie__Group__0__Impl"
    // InternalMyUno.g:3350:1: rule__Fin_Partie__Group__0__Impl : ( 'Fin_Partie' ) ;
    public final void rule__Fin_Partie__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3354:1: ( ( 'Fin_Partie' ) )
            // InternalMyUno.g:3355:1: ( 'Fin_Partie' )
            {
            // InternalMyUno.g:3355:1: ( 'Fin_Partie' )
            // InternalMyUno.g:3356:2: 'Fin_Partie'
            {
             before(grammarAccess.getFin_PartieAccess().getFin_PartieKeyword_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getFin_PartieKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__0__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__1"
    // InternalMyUno.g:3365:1: rule__Fin_Partie__Group__1 : rule__Fin_Partie__Group__1__Impl rule__Fin_Partie__Group__2 ;
    public final void rule__Fin_Partie__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3369:1: ( rule__Fin_Partie__Group__1__Impl rule__Fin_Partie__Group__2 )
            // InternalMyUno.g:3370:2: rule__Fin_Partie__Group__1__Impl rule__Fin_Partie__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Fin_Partie__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__1"


    // $ANTLR start "rule__Fin_Partie__Group__1__Impl"
    // InternalMyUno.g:3377:1: rule__Fin_Partie__Group__1__Impl : ( ':' ) ;
    public final void rule__Fin_Partie__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3381:1: ( ( ':' ) )
            // InternalMyUno.g:3382:1: ( ':' )
            {
            // InternalMyUno.g:3382:1: ( ':' )
            // InternalMyUno.g:3383:2: ':'
            {
             before(grammarAccess.getFin_PartieAccess().getColonKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__1__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__2"
    // InternalMyUno.g:3392:1: rule__Fin_Partie__Group__2 : rule__Fin_Partie__Group__2__Impl rule__Fin_Partie__Group__3 ;
    public final void rule__Fin_Partie__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3396:1: ( rule__Fin_Partie__Group__2__Impl rule__Fin_Partie__Group__3 )
            // InternalMyUno.g:3397:2: rule__Fin_Partie__Group__2__Impl rule__Fin_Partie__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Fin_Partie__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__2"


    // $ANTLR start "rule__Fin_Partie__Group__2__Impl"
    // InternalMyUno.g:3404:1: rule__Fin_Partie__Group__2__Impl : ( 'vainqueur_total' ) ;
    public final void rule__Fin_Partie__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3408:1: ( ( 'vainqueur_total' ) )
            // InternalMyUno.g:3409:1: ( 'vainqueur_total' )
            {
            // InternalMyUno.g:3409:1: ( 'vainqueur_total' )
            // InternalMyUno.g:3410:2: 'vainqueur_total'
            {
             before(grammarAccess.getFin_PartieAccess().getVainqueur_totalKeyword_2()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getVainqueur_totalKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__2__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__3"
    // InternalMyUno.g:3419:1: rule__Fin_Partie__Group__3 : rule__Fin_Partie__Group__3__Impl rule__Fin_Partie__Group__4 ;
    public final void rule__Fin_Partie__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3423:1: ( rule__Fin_Partie__Group__3__Impl rule__Fin_Partie__Group__4 )
            // InternalMyUno.g:3424:2: rule__Fin_Partie__Group__3__Impl rule__Fin_Partie__Group__4
            {
            pushFollow(FOLLOW_44);
            rule__Fin_Partie__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__3"


    // $ANTLR start "rule__Fin_Partie__Group__3__Impl"
    // InternalMyUno.g:3431:1: rule__Fin_Partie__Group__3__Impl : ( '(' ) ;
    public final void rule__Fin_Partie__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3435:1: ( ( '(' ) )
            // InternalMyUno.g:3436:1: ( '(' )
            {
            // InternalMyUno.g:3436:1: ( '(' )
            // InternalMyUno.g:3437:2: '('
            {
             before(grammarAccess.getFin_PartieAccess().getLeftParenthesisKeyword_3()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__3__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__4"
    // InternalMyUno.g:3446:1: rule__Fin_Partie__Group__4 : rule__Fin_Partie__Group__4__Impl rule__Fin_Partie__Group__5 ;
    public final void rule__Fin_Partie__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3450:1: ( rule__Fin_Partie__Group__4__Impl rule__Fin_Partie__Group__5 )
            // InternalMyUno.g:3451:2: rule__Fin_Partie__Group__4__Impl rule__Fin_Partie__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Fin_Partie__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__4"


    // $ANTLR start "rule__Fin_Partie__Group__4__Impl"
    // InternalMyUno.g:3458:1: rule__Fin_Partie__Group__4__Impl : ( ( rule__Fin_Partie__Vainqueur_totalAssignment_4 ) ) ;
    public final void rule__Fin_Partie__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3462:1: ( ( ( rule__Fin_Partie__Vainqueur_totalAssignment_4 ) ) )
            // InternalMyUno.g:3463:1: ( ( rule__Fin_Partie__Vainqueur_totalAssignment_4 ) )
            {
            // InternalMyUno.g:3463:1: ( ( rule__Fin_Partie__Vainqueur_totalAssignment_4 ) )
            // InternalMyUno.g:3464:2: ( rule__Fin_Partie__Vainqueur_totalAssignment_4 )
            {
             before(grammarAccess.getFin_PartieAccess().getVainqueur_totalAssignment_4()); 
            // InternalMyUno.g:3465:2: ( rule__Fin_Partie__Vainqueur_totalAssignment_4 )
            // InternalMyUno.g:3465:3: rule__Fin_Partie__Vainqueur_totalAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Vainqueur_totalAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFin_PartieAccess().getVainqueur_totalAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__4__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__5"
    // InternalMyUno.g:3473:1: rule__Fin_Partie__Group__5 : rule__Fin_Partie__Group__5__Impl rule__Fin_Partie__Group__6 ;
    public final void rule__Fin_Partie__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3477:1: ( rule__Fin_Partie__Group__5__Impl rule__Fin_Partie__Group__6 )
            // InternalMyUno.g:3478:2: rule__Fin_Partie__Group__5__Impl rule__Fin_Partie__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Fin_Partie__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__5"


    // $ANTLR start "rule__Fin_Partie__Group__5__Impl"
    // InternalMyUno.g:3485:1: rule__Fin_Partie__Group__5__Impl : ( ')' ) ;
    public final void rule__Fin_Partie__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3489:1: ( ( ')' ) )
            // InternalMyUno.g:3490:1: ( ')' )
            {
            // InternalMyUno.g:3490:1: ( ')' )
            // InternalMyUno.g:3491:2: ')'
            {
             before(grammarAccess.getFin_PartieAccess().getRightParenthesisKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__5__Impl"


    // $ANTLR start "rule__Fin_Partie__Group__6"
    // InternalMyUno.g:3500:1: rule__Fin_Partie__Group__6 : rule__Fin_Partie__Group__6__Impl ;
    public final void rule__Fin_Partie__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3504:1: ( rule__Fin_Partie__Group__6__Impl )
            // InternalMyUno.g:3505:2: rule__Fin_Partie__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Fin_Partie__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__6"


    // $ANTLR start "rule__Fin_Partie__Group__6__Impl"
    // InternalMyUno.g:3511:1: rule__Fin_Partie__Group__6__Impl : ( ';' ) ;
    public final void rule__Fin_Partie__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3515:1: ( ( ';' ) )
            // InternalMyUno.g:3516:1: ( ';' )
            {
            // InternalMyUno.g:3516:1: ( ';' )
            // InternalMyUno.g:3517:2: ';'
            {
             before(grammarAccess.getFin_PartieAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFin_PartieAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Group__6__Impl"


    // $ANTLR start "rule__Inversion__UnorderedGroup"
    // InternalMyUno.g:3527:1: rule__Inversion__UnorderedGroup : ( rule__Inversion__UnorderedGroup__0 )? ;
    public final void rule__Inversion__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInversionAccess().getUnorderedGroup());
        	
        try {
            // InternalMyUno.g:3532:1: ( ( rule__Inversion__UnorderedGroup__0 )? )
            // InternalMyUno.g:3533:2: ( rule__Inversion__UnorderedGroup__0 )?
            {
            // InternalMyUno.g:3533:2: ( rule__Inversion__UnorderedGroup__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyUno.g:3533:2: rule__Inversion__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inversion__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getInversionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__UnorderedGroup"


    // $ANTLR start "rule__Inversion__UnorderedGroup__Impl"
    // InternalMyUno.g:3541:1: rule__Inversion__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) ) ) ;
    public final void rule__Inversion__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUno.g:3546:1: ( ( ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) ) ) )
            // InternalMyUno.g:3547:3: ( ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) ) )
            {
            // InternalMyUno.g:3547:3: ( ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyUno.g:3548:3: ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) )
                    {
                    // InternalMyUno.g:3548:3: ({...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) ) )
                    // InternalMyUno.g:3549:4: {...}? => ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Inversion__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyUno.g:3549:103: ( ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) ) )
                    // InternalMyUno.g:3550:5: ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInversionAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3556:5: ( ( rule__Inversion__Avec_carte_inversionAssignment_0 ) )
                    // InternalMyUno.g:3557:6: ( rule__Inversion__Avec_carte_inversionAssignment_0 )
                    {
                     before(grammarAccess.getInversionAccess().getAvec_carte_inversionAssignment_0()); 
                    // InternalMyUno.g:3558:6: ( rule__Inversion__Avec_carte_inversionAssignment_0 )
                    // InternalMyUno.g:3558:7: rule__Inversion__Avec_carte_inversionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inversion__Avec_carte_inversionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInversionAccess().getAvec_carte_inversionAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:3563:3: ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) )
                    {
                    // InternalMyUno.g:3563:3: ({...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) ) )
                    // InternalMyUno.g:3564:4: {...}? => ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Inversion__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyUno.g:3564:103: ( ( ( rule__Inversion__Avec_carte_septAssignment_1 ) ) )
                    // InternalMyUno.g:3565:5: ( ( rule__Inversion__Avec_carte_septAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInversionAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3571:5: ( ( rule__Inversion__Avec_carte_septAssignment_1 ) )
                    // InternalMyUno.g:3572:6: ( rule__Inversion__Avec_carte_septAssignment_1 )
                    {
                     before(grammarAccess.getInversionAccess().getAvec_carte_septAssignment_1()); 
                    // InternalMyUno.g:3573:6: ( rule__Inversion__Avec_carte_septAssignment_1 )
                    // InternalMyUno.g:3573:7: rule__Inversion__Avec_carte_septAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inversion__Avec_carte_septAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInversionAccess().getAvec_carte_septAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInversionAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__UnorderedGroup__Impl"


    // $ANTLR start "rule__Inversion__UnorderedGroup__0"
    // InternalMyUno.g:3586:1: rule__Inversion__UnorderedGroup__0 : rule__Inversion__UnorderedGroup__Impl ( rule__Inversion__UnorderedGroup__1 )? ;
    public final void rule__Inversion__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3590:1: ( rule__Inversion__UnorderedGroup__Impl ( rule__Inversion__UnorderedGroup__1 )? )
            // InternalMyUno.g:3591:2: rule__Inversion__UnorderedGroup__Impl ( rule__Inversion__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__Inversion__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3592:2: ( rule__Inversion__UnorderedGroup__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getInversionAccess().getUnorderedGroup(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyUno.g:3592:2: rule__Inversion__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Inversion__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__UnorderedGroup__0"


    // $ANTLR start "rule__Inversion__UnorderedGroup__1"
    // InternalMyUno.g:3598:1: rule__Inversion__UnorderedGroup__1 : rule__Inversion__UnorderedGroup__Impl ;
    public final void rule__Inversion__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3602:1: ( rule__Inversion__UnorderedGroup__Impl )
            // InternalMyUno.g:3603:2: rule__Inversion__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Inversion__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__UnorderedGroup__1"


    // $ANTLR start "rule__Tourner_les_mains__UnorderedGroup"
    // InternalMyUno.g:3610:1: rule__Tourner_les_mains__UnorderedGroup : ( rule__Tourner_les_mains__UnorderedGroup__0 )? ;
    public final void rule__Tourner_les_mains__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
        	
        try {
            // InternalMyUno.g:3615:1: ( ( rule__Tourner_les_mains__UnorderedGroup__0 )? )
            // InternalMyUno.g:3616:2: ( rule__Tourner_les_mains__UnorderedGroup__0 )?
            {
            // InternalMyUno.g:3616:2: ( rule__Tourner_les_mains__UnorderedGroup__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyUno.g:3616:2: rule__Tourner_les_mains__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tourner_les_mains__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__UnorderedGroup"


    // $ANTLR start "rule__Tourner_les_mains__UnorderedGroup__Impl"
    // InternalMyUno.g:3624:1: rule__Tourner_les_mains__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) ) ) ;
    public final void rule__Tourner_les_mains__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUno.g:3629:1: ( ( ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) ) ) )
            // InternalMyUno.g:3630:3: ( ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) ) )
            {
            // InternalMyUno.g:3630:3: ( ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyUno.g:3631:3: ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) )
                    {
                    // InternalMyUno.g:3631:3: ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) ) )
                    // InternalMyUno.g:3632:4: {...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Tourner_les_mains__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyUno.g:3632:111: ( ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) ) )
                    // InternalMyUno.g:3633:5: ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3639:5: ( ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 ) )
                    // InternalMyUno.g:3640:6: ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 )
                    {
                     before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAssignment_0()); 
                    // InternalMyUno.g:3641:6: ( rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 )
                    // InternalMyUno.g:3641:7: rule__Tourner_les_mains__Avec_carte_zeroAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tourner_les_mains__Avec_carte_zeroAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:3646:3: ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) )
                    {
                    // InternalMyUno.g:3646:3: ({...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) ) )
                    // InternalMyUno.g:3647:4: {...}? => ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Tourner_les_mains__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyUno.g:3647:111: ( ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) ) )
                    // InternalMyUno.g:3648:5: ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3654:5: ( ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 ) )
                    // InternalMyUno.g:3655:6: ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 )
                    {
                     before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAssignment_1()); 
                    // InternalMyUno.g:3656:6: ( rule__Tourner_les_mains__Avec_carte_unoAssignment_1 )
                    // InternalMyUno.g:3656:7: rule__Tourner_les_mains__Avec_carte_unoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tourner_les_mains__Avec_carte_unoAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__UnorderedGroup__Impl"


    // $ANTLR start "rule__Tourner_les_mains__UnorderedGroup__0"
    // InternalMyUno.g:3669:1: rule__Tourner_les_mains__UnorderedGroup__0 : rule__Tourner_les_mains__UnorderedGroup__Impl ( rule__Tourner_les_mains__UnorderedGroup__1 )? ;
    public final void rule__Tourner_les_mains__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3673:1: ( rule__Tourner_les_mains__UnorderedGroup__Impl ( rule__Tourner_les_mains__UnorderedGroup__1 )? )
            // InternalMyUno.g:3674:2: rule__Tourner_les_mains__UnorderedGroup__Impl ( rule__Tourner_les_mains__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_46);
            rule__Tourner_les_mains__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3675:2: ( rule__Tourner_les_mains__UnorderedGroup__1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getTourner_les_mainsAccess().getUnorderedGroup(), 1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyUno.g:3675:2: rule__Tourner_les_mains__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Tourner_les_mains__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__UnorderedGroup__0"


    // $ANTLR start "rule__Tourner_les_mains__UnorderedGroup__1"
    // InternalMyUno.g:3681:1: rule__Tourner_les_mains__UnorderedGroup__1 : rule__Tourner_les_mains__UnorderedGroup__Impl ;
    public final void rule__Tourner_les_mains__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3685:1: ( rule__Tourner_les_mains__UnorderedGroup__Impl )
            // InternalMyUno.g:3686:2: rule__Tourner_les_mains__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tourner_les_mains__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__UnorderedGroup__1"


    // $ANTLR start "rule__Cartes_1_9__UnorderedGroup"
    // InternalMyUno.g:3693:1: rule__Cartes_1_9__UnorderedGroup : ( rule__Cartes_1_9__UnorderedGroup__0 )? ;
    public final void rule__Cartes_1_9__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
        	
        try {
            // InternalMyUno.g:3698:1: ( ( rule__Cartes_1_9__UnorderedGroup__0 )? )
            // InternalMyUno.g:3699:2: ( rule__Cartes_1_9__UnorderedGroup__0 )?
            {
            // InternalMyUno.g:3699:2: ( rule__Cartes_1_9__UnorderedGroup__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyUno.g:3699:2: rule__Cartes_1_9__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__UnorderedGroup"


    // $ANTLR start "rule__Cartes_1_9__UnorderedGroup__Impl"
    // InternalMyUno.g:3707:1: rule__Cartes_1_9__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) ) ) ;
    public final void rule__Cartes_1_9__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUno.g:3712:1: ( ( ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) ) ) )
            // InternalMyUno.g:3713:3: ( ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) ) )
            {
            // InternalMyUno.g:3713:3: ( ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyUno.g:3714:3: ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) )
                    {
                    // InternalMyUno.g:3714:3: ({...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) ) )
                    // InternalMyUno.g:3715:4: {...}? => ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Cartes_1_9__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0)");
                    }
                    // InternalMyUno.g:3715:104: ( ( ( rule__Cartes_1_9__SuitesAssignment_0 ) ) )
                    // InternalMyUno.g:3716:5: ( ( rule__Cartes_1_9__SuitesAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3722:5: ( ( rule__Cartes_1_9__SuitesAssignment_0 ) )
                    // InternalMyUno.g:3723:6: ( rule__Cartes_1_9__SuitesAssignment_0 )
                    {
                     before(grammarAccess.getCartes_1_9Access().getSuitesAssignment_0()); 
                    // InternalMyUno.g:3724:6: ( rule__Cartes_1_9__SuitesAssignment_0 )
                    // InternalMyUno.g:3724:7: rule__Cartes_1_9__SuitesAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__SuitesAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCartes_1_9Access().getSuitesAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:3729:3: ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) )
                    {
                    // InternalMyUno.g:3729:3: ({...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) ) )
                    // InternalMyUno.g:3730:4: {...}? => ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Cartes_1_9__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1)");
                    }
                    // InternalMyUno.g:3730:104: ( ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) ) )
                    // InternalMyUno.g:3731:5: ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3737:5: ( ( rule__Cartes_1_9__Suites_royalesAssignment_1 ) )
                    // InternalMyUno.g:3738:6: ( rule__Cartes_1_9__Suites_royalesAssignment_1 )
                    {
                     before(grammarAccess.getCartes_1_9Access().getSuites_royalesAssignment_1()); 
                    // InternalMyUno.g:3739:6: ( rule__Cartes_1_9__Suites_royalesAssignment_1 )
                    // InternalMyUno.g:3739:7: rule__Cartes_1_9__Suites_royalesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__Suites_royalesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCartes_1_9Access().getSuites_royalesAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:3744:3: ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) )
                    {
                    // InternalMyUno.g:3744:3: ({...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) ) )
                    // InternalMyUno.g:3745:4: {...}? => ( ( ( rule__Cartes_1_9__Group_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Cartes_1_9__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2)");
                    }
                    // InternalMyUno.g:3745:104: ( ( ( rule__Cartes_1_9__Group_2__0 ) ) )
                    // InternalMyUno.g:3746:5: ( ( rule__Cartes_1_9__Group_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3752:5: ( ( rule__Cartes_1_9__Group_2__0 ) )
                    // InternalMyUno.g:3753:6: ( rule__Cartes_1_9__Group_2__0 )
                    {
                     before(grammarAccess.getCartes_1_9Access().getGroup_2()); 
                    // InternalMyUno.g:3754:6: ( rule__Cartes_1_9__Group_2__0 )
                    // InternalMyUno.g:3754:7: rule__Cartes_1_9__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCartes_1_9Access().getGroup_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCartes_1_9Access().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__UnorderedGroup__Impl"


    // $ANTLR start "rule__Cartes_1_9__UnorderedGroup__0"
    // InternalMyUno.g:3767:1: rule__Cartes_1_9__UnorderedGroup__0 : rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__1 )? ;
    public final void rule__Cartes_1_9__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3771:1: ( rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__1 )? )
            // InternalMyUno.g:3772:2: rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_47);
            rule__Cartes_1_9__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3773:2: ( rule__Cartes_1_9__UnorderedGroup__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyUno.g:3773:2: rule__Cartes_1_9__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__UnorderedGroup__0"


    // $ANTLR start "rule__Cartes_1_9__UnorderedGroup__1"
    // InternalMyUno.g:3779:1: rule__Cartes_1_9__UnorderedGroup__1 : rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__2 )? ;
    public final void rule__Cartes_1_9__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3783:1: ( rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__2 )? )
            // InternalMyUno.g:3784:2: rule__Cartes_1_9__UnorderedGroup__Impl ( rule__Cartes_1_9__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_47);
            rule__Cartes_1_9__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3785:2: ( rule__Cartes_1_9__UnorderedGroup__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getCartes_1_9Access().getUnorderedGroup(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyUno.g:3785:2: rule__Cartes_1_9__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cartes_1_9__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__UnorderedGroup__1"


    // $ANTLR start "rule__Cartes_1_9__UnorderedGroup__2"
    // InternalMyUno.g:3791:1: rule__Cartes_1_9__UnorderedGroup__2 : rule__Cartes_1_9__UnorderedGroup__Impl ;
    public final void rule__Cartes_1_9__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3795:1: ( rule__Cartes_1_9__UnorderedGroup__Impl )
            // InternalMyUno.g:3796:2: rule__Cartes_1_9__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cartes_1_9__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__UnorderedGroup__2"


    // $ANTLR start "rule__Cumul__UnorderedGroup"
    // InternalMyUno.g:3803:1: rule__Cumul__UnorderedGroup : ( rule__Cumul__UnorderedGroup__0 )? ;
    public final void rule__Cumul__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCumulAccess().getUnorderedGroup());
        	
        try {
            // InternalMyUno.g:3808:1: ( ( rule__Cumul__UnorderedGroup__0 )? )
            // InternalMyUno.g:3809:2: ( rule__Cumul__UnorderedGroup__0 )?
            {
            // InternalMyUno.g:3809:2: ( rule__Cumul__UnorderedGroup__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyUno.g:3809:2: rule__Cumul__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCumulAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup"


    // $ANTLR start "rule__Cumul__UnorderedGroup__Impl"
    // InternalMyUno.g:3817:1: rule__Cumul__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) ) ) ;
    public final void rule__Cumul__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUno.g:3822:1: ( ( ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) ) ) )
            // InternalMyUno.g:3823:3: ( ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) ) )
            {
            // InternalMyUno.g:3823:3: ( ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) ) | ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) ) )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                alt33=2;
            }
            else if ( LA33_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                alt33=3;
            }
            else if ( LA33_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                alt33=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyUno.g:3824:3: ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) )
                    {
                    // InternalMyUno.g:3824:3: ({...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) ) )
                    // InternalMyUno.g:3825:4: {...}? => ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Cumul__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyUno.g:3825:99: ( ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) ) )
                    // InternalMyUno.g:3826:5: ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3832:5: ( ( rule__Cumul__Cumul_plus_2Assignment_0 ) )
                    // InternalMyUno.g:3833:6: ( rule__Cumul__Cumul_plus_2Assignment_0 )
                    {
                     before(grammarAccess.getCumulAccess().getCumul_plus_2Assignment_0()); 
                    // InternalMyUno.g:3834:6: ( rule__Cumul__Cumul_plus_2Assignment_0 )
                    // InternalMyUno.g:3834:7: rule__Cumul__Cumul_plus_2Assignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__Cumul_plus_2Assignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulAccess().getCumul_plus_2Assignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:3839:3: ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) )
                    {
                    // InternalMyUno.g:3839:3: ({...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) ) )
                    // InternalMyUno.g:3840:4: {...}? => ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Cumul__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyUno.g:3840:99: ( ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) ) )
                    // InternalMyUno.g:3841:5: ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3847:5: ( ( rule__Cumul__Cumul_plus_4Assignment_1 ) )
                    // InternalMyUno.g:3848:6: ( rule__Cumul__Cumul_plus_4Assignment_1 )
                    {
                     before(grammarAccess.getCumulAccess().getCumul_plus_4Assignment_1()); 
                    // InternalMyUno.g:3849:6: ( rule__Cumul__Cumul_plus_4Assignment_1 )
                    // InternalMyUno.g:3849:7: rule__Cumul__Cumul_plus_4Assignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__Cumul_plus_4Assignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulAccess().getCumul_plus_4Assignment_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyUno.g:3854:3: ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) )
                    {
                    // InternalMyUno.g:3854:3: ({...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) ) )
                    // InternalMyUno.g:3855:4: {...}? => ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Cumul__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2)");
                    }
                    // InternalMyUno.g:3855:99: ( ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) ) )
                    // InternalMyUno.g:3856:5: ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3862:5: ( ( rule__Cumul__Cumul_carte_couleurAssignment_2 ) )
                    // InternalMyUno.g:3863:6: ( rule__Cumul__Cumul_carte_couleurAssignment_2 )
                    {
                     before(grammarAccess.getCumulAccess().getCumul_carte_couleurAssignment_2()); 
                    // InternalMyUno.g:3864:6: ( rule__Cumul__Cumul_carte_couleurAssignment_2 )
                    // InternalMyUno.g:3864:7: rule__Cumul__Cumul_carte_couleurAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__Cumul_carte_couleurAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulAccess().getCumul_carte_couleurAssignment_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyUno.g:3869:3: ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) )
                    {
                    // InternalMyUno.g:3869:3: ({...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) ) )
                    // InternalMyUno.g:3870:4: {...}? => ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                        throw new FailedPredicateException(input, "rule__Cumul__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3)");
                    }
                    // InternalMyUno.g:3870:99: ( ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) ) )
                    // InternalMyUno.g:3871:5: ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCumulAccess().getUnorderedGroup(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3877:5: ( ( rule__Cumul__Cumul_carte_unoAssignment_3 ) )
                    // InternalMyUno.g:3878:6: ( rule__Cumul__Cumul_carte_unoAssignment_3 )
                    {
                     before(grammarAccess.getCumulAccess().getCumul_carte_unoAssignment_3()); 
                    // InternalMyUno.g:3879:6: ( rule__Cumul__Cumul_carte_unoAssignment_3 )
                    // InternalMyUno.g:3879:7: rule__Cumul__Cumul_carte_unoAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__Cumul_carte_unoAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCumulAccess().getCumul_carte_unoAssignment_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCumulAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup__Impl"


    // $ANTLR start "rule__Cumul__UnorderedGroup__0"
    // InternalMyUno.g:3892:1: rule__Cumul__UnorderedGroup__0 : rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__1 )? ;
    public final void rule__Cumul__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3896:1: ( rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__1 )? )
            // InternalMyUno.g:3897:2: rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_48);
            rule__Cumul__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3898:2: ( rule__Cumul__UnorderedGroup__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyUno.g:3898:2: rule__Cumul__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup__0"


    // $ANTLR start "rule__Cumul__UnorderedGroup__1"
    // InternalMyUno.g:3904:1: rule__Cumul__UnorderedGroup__1 : rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__2 )? ;
    public final void rule__Cumul__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3908:1: ( rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__2 )? )
            // InternalMyUno.g:3909:2: rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__2 )?
            {
            pushFollow(FOLLOW_48);
            rule__Cumul__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3910:2: ( rule__Cumul__UnorderedGroup__2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyUno.g:3910:2: rule__Cumul__UnorderedGroup__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__UnorderedGroup__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup__1"


    // $ANTLR start "rule__Cumul__UnorderedGroup__2"
    // InternalMyUno.g:3916:1: rule__Cumul__UnorderedGroup__2 : rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__3 )? ;
    public final void rule__Cumul__UnorderedGroup__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3920:1: ( rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__3 )? )
            // InternalMyUno.g:3921:2: rule__Cumul__UnorderedGroup__Impl ( rule__Cumul__UnorderedGroup__3 )?
            {
            pushFollow(FOLLOW_48);
            rule__Cumul__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:3922:2: ( rule__Cumul__UnorderedGroup__3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 73 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getCumulAccess().getUnorderedGroup(), 3) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyUno.g:3922:2: rule__Cumul__UnorderedGroup__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Cumul__UnorderedGroup__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup__2"


    // $ANTLR start "rule__Cumul__UnorderedGroup__3"
    // InternalMyUno.g:3928:1: rule__Cumul__UnorderedGroup__3 : rule__Cumul__UnorderedGroup__Impl ;
    public final void rule__Cumul__UnorderedGroup__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:3932:1: ( rule__Cumul__UnorderedGroup__Impl )
            // InternalMyUno.g:3933:2: rule__Cumul__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cumul__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__UnorderedGroup__3"


    // $ANTLR start "rule__Contestations__UnorderedGroup"
    // InternalMyUno.g:3940:1: rule__Contestations__UnorderedGroup : ( rule__Contestations__UnorderedGroup__0 )? ;
    public final void rule__Contestations__UnorderedGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getContestationsAccess().getUnorderedGroup());
        	
        try {
            // InternalMyUno.g:3945:1: ( ( rule__Contestations__UnorderedGroup__0 )? )
            // InternalMyUno.g:3946:2: ( rule__Contestations__UnorderedGroup__0 )?
            {
            // InternalMyUno.g:3946:2: ( rule__Contestations__UnorderedGroup__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyUno.g:3946:2: rule__Contestations__UnorderedGroup__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contestations__UnorderedGroup__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getContestationsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__UnorderedGroup"


    // $ANTLR start "rule__Contestations__UnorderedGroup__Impl"
    // InternalMyUno.g:3954:1: rule__Contestations__UnorderedGroup__Impl : ( ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) ) ) ;
    public final void rule__Contestations__UnorderedGroup__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMyUno.g:3959:1: ( ( ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) ) ) )
            // InternalMyUno.g:3960:3: ( ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) ) )
            {
            // InternalMyUno.g:3960:3: ( ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) ) | ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyUno.g:3961:3: ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) )
                    {
                    // InternalMyUno.g:3961:3: ({...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) ) )
                    // InternalMyUno.g:3962:4: {...}? => ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Contestations__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0)");
                    }
                    // InternalMyUno.g:3962:107: ( ( ( rule__Contestations__Inter_contestableAssignment_0 ) ) )
                    // InternalMyUno.g:3963:5: ( ( rule__Contestations__Inter_contestableAssignment_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3969:5: ( ( rule__Contestations__Inter_contestableAssignment_0 ) )
                    // InternalMyUno.g:3970:6: ( rule__Contestations__Inter_contestableAssignment_0 )
                    {
                     before(grammarAccess.getContestationsAccess().getInter_contestableAssignment_0()); 
                    // InternalMyUno.g:3971:6: ( rule__Contestations__Inter_contestableAssignment_0 )
                    // InternalMyUno.g:3971:7: rule__Contestations__Inter_contestableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contestations__Inter_contestableAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getContestationsAccess().getInter_contestableAssignment_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyUno.g:3976:3: ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) )
                    {
                    // InternalMyUno.g:3976:3: ({...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) ) )
                    // InternalMyUno.g:3977:4: {...}? => ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Contestations__UnorderedGroup__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1)");
                    }
                    // InternalMyUno.g:3977:107: ( ( ( rule__Contestations__Plus4_contestableAssignment_1 ) ) )
                    // InternalMyUno.g:3978:5: ( ( rule__Contestations__Plus4_contestableAssignment_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMyUno.g:3984:5: ( ( rule__Contestations__Plus4_contestableAssignment_1 ) )
                    // InternalMyUno.g:3985:6: ( rule__Contestations__Plus4_contestableAssignment_1 )
                    {
                     before(grammarAccess.getContestationsAccess().getPlus4_contestableAssignment_1()); 
                    // InternalMyUno.g:3986:6: ( rule__Contestations__Plus4_contestableAssignment_1 )
                    // InternalMyUno.g:3986:7: rule__Contestations__Plus4_contestableAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contestations__Plus4_contestableAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getContestationsAccess().getPlus4_contestableAssignment_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContestationsAccess().getUnorderedGroup());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__UnorderedGroup__Impl"


    // $ANTLR start "rule__Contestations__UnorderedGroup__0"
    // InternalMyUno.g:3999:1: rule__Contestations__UnorderedGroup__0 : rule__Contestations__UnorderedGroup__Impl ( rule__Contestations__UnorderedGroup__1 )? ;
    public final void rule__Contestations__UnorderedGroup__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4003:1: ( rule__Contestations__UnorderedGroup__Impl ( rule__Contestations__UnorderedGroup__1 )? )
            // InternalMyUno.g:4004:2: rule__Contestations__UnorderedGroup__Impl ( rule__Contestations__UnorderedGroup__1 )?
            {
            pushFollow(FOLLOW_49);
            rule__Contestations__UnorderedGroup__Impl();

            state._fsp--;

            // InternalMyUno.g:4005:2: ( rule__Contestations__UnorderedGroup__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getContestationsAccess().getUnorderedGroup(), 1) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyUno.g:4005:2: rule__Contestations__UnorderedGroup__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contestations__UnorderedGroup__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__UnorderedGroup__0"


    // $ANTLR start "rule__Contestations__UnorderedGroup__1"
    // InternalMyUno.g:4011:1: rule__Contestations__UnorderedGroup__1 : rule__Contestations__UnorderedGroup__Impl ;
    public final void rule__Contestations__UnorderedGroup__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4015:1: ( rule__Contestations__UnorderedGroup__Impl )
            // InternalMyUno.g:4016:2: rule__Contestations__UnorderedGroup__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contestations__UnorderedGroup__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__UnorderedGroup__1"


    // $ANTLR start "rule__Variante_UNO__NameAssignment_1"
    // InternalMyUno.g:4023:1: rule__Variante_UNO__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Variante_UNO__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4027:1: ( ( RULE_STRING ) )
            // InternalMyUno.g:4028:2: ( RULE_STRING )
            {
            // InternalMyUno.g:4028:2: ( RULE_STRING )
            // InternalMyUno.g:4029:3: RULE_STRING
            {
             before(grammarAccess.getVariante_UNOAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVariante_UNOAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__NameAssignment_1"


    // $ANTLR start "rule__Variante_UNO__Configuration_departAssignment_3"
    // InternalMyUno.g:4038:1: rule__Variante_UNO__Configuration_departAssignment_3 : ( ruleConfiguration_Depart ) ;
    public final void rule__Variante_UNO__Configuration_departAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4042:1: ( ( ruleConfiguration_Depart ) )
            // InternalMyUno.g:4043:2: ( ruleConfiguration_Depart )
            {
            // InternalMyUno.g:4043:2: ( ruleConfiguration_Depart )
            // InternalMyUno.g:4044:3: ruleConfiguration_Depart
            {
             before(grammarAccess.getVariante_UNOAccess().getConfiguration_departConfiguration_DepartParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConfiguration_Depart();

            state._fsp--;

             after(grammarAccess.getVariante_UNOAccess().getConfiguration_departConfiguration_DepartParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Configuration_departAssignment_3"


    // $ANTLR start "rule__Variante_UNO__MancheAssignment_4"
    // InternalMyUno.g:4053:1: rule__Variante_UNO__MancheAssignment_4 : ( ruleManche ) ;
    public final void rule__Variante_UNO__MancheAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4057:1: ( ( ruleManche ) )
            // InternalMyUno.g:4058:2: ( ruleManche )
            {
            // InternalMyUno.g:4058:2: ( ruleManche )
            // InternalMyUno.g:4059:3: ruleManche
            {
             before(grammarAccess.getVariante_UNOAccess().getMancheMancheParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleManche();

            state._fsp--;

             after(grammarAccess.getVariante_UNOAccess().getMancheMancheParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__MancheAssignment_4"


    // $ANTLR start "rule__Variante_UNO__Fin_mancheAssignment_5"
    // InternalMyUno.g:4068:1: rule__Variante_UNO__Fin_mancheAssignment_5 : ( ruleFin_Manche ) ;
    public final void rule__Variante_UNO__Fin_mancheAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4072:1: ( ( ruleFin_Manche ) )
            // InternalMyUno.g:4073:2: ( ruleFin_Manche )
            {
            // InternalMyUno.g:4073:2: ( ruleFin_Manche )
            // InternalMyUno.g:4074:3: ruleFin_Manche
            {
             before(grammarAccess.getVariante_UNOAccess().getFin_mancheFin_MancheParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleFin_Manche();

            state._fsp--;

             after(grammarAccess.getVariante_UNOAccess().getFin_mancheFin_MancheParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Fin_mancheAssignment_5"


    // $ANTLR start "rule__Variante_UNO__Fin_partieAssignment_6"
    // InternalMyUno.g:4083:1: rule__Variante_UNO__Fin_partieAssignment_6 : ( ruleFin_Partie ) ;
    public final void rule__Variante_UNO__Fin_partieAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4087:1: ( ( ruleFin_Partie ) )
            // InternalMyUno.g:4088:2: ( ruleFin_Partie )
            {
            // InternalMyUno.g:4088:2: ( ruleFin_Partie )
            // InternalMyUno.g:4089:3: ruleFin_Partie
            {
             before(grammarAccess.getVariante_UNOAccess().getFin_partieFin_PartieParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleFin_Partie();

            state._fsp--;

             after(grammarAccess.getVariante_UNOAccess().getFin_partieFin_PartieParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variante_UNO__Fin_partieAssignment_6"


    // $ANTLR start "rule__Configuration_Depart__MainAssignment_2"
    // InternalMyUno.g:4098:1: rule__Configuration_Depart__MainAssignment_2 : ( ruleMain ) ;
    public final void rule__Configuration_Depart__MainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4102:1: ( ( ruleMain ) )
            // InternalMyUno.g:4103:2: ( ruleMain )
            {
            // InternalMyUno.g:4103:2: ( ruleMain )
            // InternalMyUno.g:4104:3: ruleMain
            {
             before(grammarAccess.getConfiguration_DepartAccess().getMainMainParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMain();

            state._fsp--;

             after(grammarAccess.getConfiguration_DepartAccess().getMainMainParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__MainAssignment_2"


    // $ANTLR start "rule__Configuration_Depart__TalonAssignment_3"
    // InternalMyUno.g:4113:1: rule__Configuration_Depart__TalonAssignment_3 : ( ruleTalon ) ;
    public final void rule__Configuration_Depart__TalonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4117:1: ( ( ruleTalon ) )
            // InternalMyUno.g:4118:2: ( ruleTalon )
            {
            // InternalMyUno.g:4118:2: ( ruleTalon )
            // InternalMyUno.g:4119:3: ruleTalon
            {
             before(grammarAccess.getConfiguration_DepartAccess().getTalonTalonParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTalon();

            state._fsp--;

             after(grammarAccess.getConfiguration_DepartAccess().getTalonTalonParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__TalonAssignment_3"


    // $ANTLR start "rule__Configuration_Depart__RiviereAssignment_4"
    // InternalMyUno.g:4128:1: rule__Configuration_Depart__RiviereAssignment_4 : ( ( 'riviere' ) ) ;
    public final void rule__Configuration_Depart__RiviereAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4132:1: ( ( ( 'riviere' ) ) )
            // InternalMyUno.g:4133:2: ( ( 'riviere' ) )
            {
            // InternalMyUno.g:4133:2: ( ( 'riviere' ) )
            // InternalMyUno.g:4134:3: ( 'riviere' )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getRiviereRiviereKeyword_4_0()); 
            // InternalMyUno.g:4135:3: ( 'riviere' )
            // InternalMyUno.g:4136:4: 'riviere'
            {
             before(grammarAccess.getConfiguration_DepartAccess().getRiviereRiviereKeyword_4_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getRiviereRiviereKeyword_4_0()); 

            }

             after(grammarAccess.getConfiguration_DepartAccess().getRiviereRiviereKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__RiviereAssignment_4"


    // $ANTLR start "rule__Configuration_Depart__Temps_limiteAssignment_5_0"
    // InternalMyUno.g:4147:1: rule__Configuration_Depart__Temps_limiteAssignment_5_0 : ( ( 'temps_limite:' ) ) ;
    public final void rule__Configuration_Depart__Temps_limiteAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4151:1: ( ( ( 'temps_limite:' ) ) )
            // InternalMyUno.g:4152:2: ( ( 'temps_limite:' ) )
            {
            // InternalMyUno.g:4152:2: ( ( 'temps_limite:' ) )
            // InternalMyUno.g:4153:3: ( 'temps_limite:' )
            {
             before(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteTemps_limiteKeyword_5_0_0()); 
            // InternalMyUno.g:4154:3: ( 'temps_limite:' )
            // InternalMyUno.g:4155:4: 'temps_limite:'
            {
             before(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteTemps_limiteKeyword_5_0_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteTemps_limiteKeyword_5_0_0()); 

            }

             after(grammarAccess.getConfiguration_DepartAccess().getTemps_limiteTemps_limiteKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__Temps_limiteAssignment_5_0"


    // $ANTLR start "rule__Configuration_Depart__SecondesAssignment_5_1"
    // InternalMyUno.g:4166:1: rule__Configuration_Depart__SecondesAssignment_5_1 : ( RULE_INT ) ;
    public final void rule__Configuration_Depart__SecondesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4170:1: ( ( RULE_INT ) )
            // InternalMyUno.g:4171:2: ( RULE_INT )
            {
            // InternalMyUno.g:4171:2: ( RULE_INT )
            // InternalMyUno.g:4172:3: RULE_INT
            {
             before(grammarAccess.getConfiguration_DepartAccess().getSecondesINTTerminalRuleCall_5_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getConfiguration_DepartAccess().getSecondesINTTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Configuration_Depart__SecondesAssignment_5_1"


    // $ANTLR start "rule__Main__Etat_mainAssignment_2"
    // InternalMyUno.g:4181:1: rule__Main__Etat_mainAssignment_2 : ( ruleEtat_Main ) ;
    public final void rule__Main__Etat_mainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4185:1: ( ( ruleEtat_Main ) )
            // InternalMyUno.g:4186:2: ( ruleEtat_Main )
            {
            // InternalMyUno.g:4186:2: ( ruleEtat_Main )
            // InternalMyUno.g:4187:3: ruleEtat_Main
            {
             before(grammarAccess.getMainAccess().getEtat_mainEtat_MainEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEtat_Main();

            state._fsp--;

             after(grammarAccess.getMainAccess().getEtat_mainEtat_MainEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Etat_mainAssignment_2"


    // $ANTLR start "rule__Main__Nb_mainsAssignment_5"
    // InternalMyUno.g:4196:1: rule__Main__Nb_mainsAssignment_5 : ( ruleNb_Mains ) ;
    public final void rule__Main__Nb_mainsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4200:1: ( ( ruleNb_Mains ) )
            // InternalMyUno.g:4201:2: ( ruleNb_Mains )
            {
            // InternalMyUno.g:4201:2: ( ruleNb_Mains )
            // InternalMyUno.g:4202:3: ruleNb_Mains
            {
             before(grammarAccess.getMainAccess().getNb_mainsNb_MainsEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleNb_Mains();

            state._fsp--;

             after(grammarAccess.getMainAccess().getNb_mainsNb_MainsEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Nb_mainsAssignment_5"


    // $ANTLR start "rule__Main__Nb_cartes_mainsAssignment_8"
    // InternalMyUno.g:4211:1: rule__Main__Nb_cartes_mainsAssignment_8 : ( ruleNb_Cartes_Mains ) ;
    public final void rule__Main__Nb_cartes_mainsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4215:1: ( ( ruleNb_Cartes_Mains ) )
            // InternalMyUno.g:4216:2: ( ruleNb_Cartes_Mains )
            {
            // InternalMyUno.g:4216:2: ( ruleNb_Cartes_Mains )
            // InternalMyUno.g:4217:3: ruleNb_Cartes_Mains
            {
             before(grammarAccess.getMainAccess().getNb_cartes_mainsNb_Cartes_MainsEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleNb_Cartes_Mains();

            state._fsp--;

             after(grammarAccess.getMainAccess().getNb_cartes_mainsNb_Cartes_MainsEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Main__Nb_cartes_mainsAssignment_8"


    // $ANTLR start "rule__Talon__Nb_talonsAssignment_2"
    // InternalMyUno.g:4226:1: rule__Talon__Nb_talonsAssignment_2 : ( ruleNb_Talons ) ;
    public final void rule__Talon__Nb_talonsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4230:1: ( ( ruleNb_Talons ) )
            // InternalMyUno.g:4231:2: ( ruleNb_Talons )
            {
            // InternalMyUno.g:4231:2: ( ruleNb_Talons )
            // InternalMyUno.g:4232:3: ruleNb_Talons
            {
             before(grammarAccess.getTalonAccess().getNb_talonsNb_TalonsEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNb_Talons();

            state._fsp--;

             after(grammarAccess.getTalonAccess().getNb_talonsNb_TalonsEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Talon__Nb_talonsAssignment_2"


    // $ANTLR start "rule__Manche__InversionAssignment_2_2"
    // InternalMyUno.g:4241:1: rule__Manche__InversionAssignment_2_2 : ( ruleInversion ) ;
    public final void rule__Manche__InversionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4245:1: ( ( ruleInversion ) )
            // InternalMyUno.g:4246:2: ( ruleInversion )
            {
            // InternalMyUno.g:4246:2: ( ruleInversion )
            // InternalMyUno.g:4247:3: ruleInversion
            {
             before(grammarAccess.getMancheAccess().getInversionInversionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInversion();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getInversionInversionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__InversionAssignment_2_2"


    // $ANTLR start "rule__Manche__Tourner_les_mainsAssignment_3_2"
    // InternalMyUno.g:4256:1: rule__Manche__Tourner_les_mainsAssignment_3_2 : ( ruleTourner_les_mains ) ;
    public final void rule__Manche__Tourner_les_mainsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4260:1: ( ( ruleTourner_les_mains ) )
            // InternalMyUno.g:4261:2: ( ruleTourner_les_mains )
            {
            // InternalMyUno.g:4261:2: ( ruleTourner_les_mains )
            // InternalMyUno.g:4262:3: ruleTourner_les_mains
            {
             before(grammarAccess.getMancheAccess().getTourner_les_mainsTourner_les_mainsParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTourner_les_mains();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getTourner_les_mainsTourner_les_mainsParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Tourner_les_mainsAssignment_3_2"


    // $ANTLR start "rule__Manche__Nb_cartes_jouablesAssignment_6"
    // InternalMyUno.g:4271:1: rule__Manche__Nb_cartes_jouablesAssignment_6 : ( ruleNb_cartes_jouables ) ;
    public final void rule__Manche__Nb_cartes_jouablesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4275:1: ( ( ruleNb_cartes_jouables ) )
            // InternalMyUno.g:4276:2: ( ruleNb_cartes_jouables )
            {
            // InternalMyUno.g:4276:2: ( ruleNb_cartes_jouables )
            // InternalMyUno.g:4277:3: ruleNb_cartes_jouables
            {
             before(grammarAccess.getMancheAccess().getNb_cartes_jouablesNb_cartes_jouablesEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNb_cartes_jouables();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getNb_cartes_jouablesNb_cartes_jouablesEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Nb_cartes_jouablesAssignment_6"


    // $ANTLR start "rule__Manche__Cartes_1_9Assignment_8_2"
    // InternalMyUno.g:4286:1: rule__Manche__Cartes_1_9Assignment_8_2 : ( ruleCartes_1_9 ) ;
    public final void rule__Manche__Cartes_1_9Assignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4290:1: ( ( ruleCartes_1_9 ) )
            // InternalMyUno.g:4291:2: ( ruleCartes_1_9 )
            {
            // InternalMyUno.g:4291:2: ( ruleCartes_1_9 )
            // InternalMyUno.g:4292:3: ruleCartes_1_9
            {
             before(grammarAccess.getMancheAccess().getCartes_1_9Cartes_1_9ParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCartes_1_9();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getCartes_1_9Cartes_1_9ParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__Cartes_1_9Assignment_8_2"


    // $ANTLR start "rule__Manche__PiocheAssignment_9"
    // InternalMyUno.g:4301:1: rule__Manche__PiocheAssignment_9 : ( rulePioche ) ;
    public final void rule__Manche__PiocheAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4305:1: ( ( rulePioche ) )
            // InternalMyUno.g:4306:2: ( rulePioche )
            {
            // InternalMyUno.g:4306:2: ( rulePioche )
            // InternalMyUno.g:4307:3: rulePioche
            {
             before(grammarAccess.getMancheAccess().getPiochePiocheParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            rulePioche();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getPiochePiocheParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__PiocheAssignment_9"


    // $ANTLR start "rule__Manche__CumulAssignment_10_2"
    // InternalMyUno.g:4316:1: rule__Manche__CumulAssignment_10_2 : ( ruleCumul ) ;
    public final void rule__Manche__CumulAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4320:1: ( ( ruleCumul ) )
            // InternalMyUno.g:4321:2: ( ruleCumul )
            {
            // InternalMyUno.g:4321:2: ( ruleCumul )
            // InternalMyUno.g:4322:3: ruleCumul
            {
             before(grammarAccess.getMancheAccess().getCumulCumulParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCumul();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getCumulCumulParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__CumulAssignment_10_2"


    // $ANTLR start "rule__Manche__ContestationsAssignment_11_2"
    // InternalMyUno.g:4331:1: rule__Manche__ContestationsAssignment_11_2 : ( ruleContestations ) ;
    public final void rule__Manche__ContestationsAssignment_11_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4335:1: ( ( ruleContestations ) )
            // InternalMyUno.g:4336:2: ( ruleContestations )
            {
            // InternalMyUno.g:4336:2: ( ruleContestations )
            // InternalMyUno.g:4337:3: ruleContestations
            {
             before(grammarAccess.getMancheAccess().getContestationsContestationsParserRuleCall_11_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContestations();

            state._fsp--;

             after(grammarAccess.getMancheAccess().getContestationsContestationsParserRuleCall_11_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Manche__ContestationsAssignment_11_2"


    // $ANTLR start "rule__Inversion__Avec_carte_inversionAssignment_0"
    // InternalMyUno.g:4346:1: rule__Inversion__Avec_carte_inversionAssignment_0 : ( ( 'avec_carte_inversion' ) ) ;
    public final void rule__Inversion__Avec_carte_inversionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4350:1: ( ( ( 'avec_carte_inversion' ) ) )
            // InternalMyUno.g:4351:2: ( ( 'avec_carte_inversion' ) )
            {
            // InternalMyUno.g:4351:2: ( ( 'avec_carte_inversion' ) )
            // InternalMyUno.g:4352:3: ( 'avec_carte_inversion' )
            {
             before(grammarAccess.getInversionAccess().getAvec_carte_inversionAvec_carte_inversionKeyword_0_0()); 
            // InternalMyUno.g:4353:3: ( 'avec_carte_inversion' )
            // InternalMyUno.g:4354:4: 'avec_carte_inversion'
            {
             before(grammarAccess.getInversionAccess().getAvec_carte_inversionAvec_carte_inversionKeyword_0_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getInversionAccess().getAvec_carte_inversionAvec_carte_inversionKeyword_0_0()); 

            }

             after(grammarAccess.getInversionAccess().getAvec_carte_inversionAvec_carte_inversionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__Avec_carte_inversionAssignment_0"


    // $ANTLR start "rule__Inversion__Avec_carte_septAssignment_1"
    // InternalMyUno.g:4365:1: rule__Inversion__Avec_carte_septAssignment_1 : ( ( 'avec_carte_sept' ) ) ;
    public final void rule__Inversion__Avec_carte_septAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4369:1: ( ( ( 'avec_carte_sept' ) ) )
            // InternalMyUno.g:4370:2: ( ( 'avec_carte_sept' ) )
            {
            // InternalMyUno.g:4370:2: ( ( 'avec_carte_sept' ) )
            // InternalMyUno.g:4371:3: ( 'avec_carte_sept' )
            {
             before(grammarAccess.getInversionAccess().getAvec_carte_septAvec_carte_septKeyword_1_0()); 
            // InternalMyUno.g:4372:3: ( 'avec_carte_sept' )
            // InternalMyUno.g:4373:4: 'avec_carte_sept'
            {
             before(grammarAccess.getInversionAccess().getAvec_carte_septAvec_carte_septKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getInversionAccess().getAvec_carte_septAvec_carte_septKeyword_1_0()); 

            }

             after(grammarAccess.getInversionAccess().getAvec_carte_septAvec_carte_septKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Inversion__Avec_carte_septAssignment_1"


    // $ANTLR start "rule__Tourner_les_mains__Avec_carte_zeroAssignment_0"
    // InternalMyUno.g:4384:1: rule__Tourner_les_mains__Avec_carte_zeroAssignment_0 : ( ( 'avec_carte_zero' ) ) ;
    public final void rule__Tourner_les_mains__Avec_carte_zeroAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4388:1: ( ( ( 'avec_carte_zero' ) ) )
            // InternalMyUno.g:4389:2: ( ( 'avec_carte_zero' ) )
            {
            // InternalMyUno.g:4389:2: ( ( 'avec_carte_zero' ) )
            // InternalMyUno.g:4390:3: ( 'avec_carte_zero' )
            {
             before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAvec_carte_zeroKeyword_0_0()); 
            // InternalMyUno.g:4391:3: ( 'avec_carte_zero' )
            // InternalMyUno.g:4392:4: 'avec_carte_zero'
            {
             before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAvec_carte_zeroKeyword_0_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAvec_carte_zeroKeyword_0_0()); 

            }

             after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_zeroAvec_carte_zeroKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__Avec_carte_zeroAssignment_0"


    // $ANTLR start "rule__Tourner_les_mains__Avec_carte_unoAssignment_1"
    // InternalMyUno.g:4403:1: rule__Tourner_les_mains__Avec_carte_unoAssignment_1 : ( ( 'avec_carte_uno' ) ) ;
    public final void rule__Tourner_les_mains__Avec_carte_unoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4407:1: ( ( ( 'avec_carte_uno' ) ) )
            // InternalMyUno.g:4408:2: ( ( 'avec_carte_uno' ) )
            {
            // InternalMyUno.g:4408:2: ( ( 'avec_carte_uno' ) )
            // InternalMyUno.g:4409:3: ( 'avec_carte_uno' )
            {
             before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAvec_carte_unoKeyword_1_0()); 
            // InternalMyUno.g:4410:3: ( 'avec_carte_uno' )
            // InternalMyUno.g:4411:4: 'avec_carte_uno'
            {
             before(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAvec_carte_unoKeyword_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAvec_carte_unoKeyword_1_0()); 

            }

             after(grammarAccess.getTourner_les_mainsAccess().getAvec_carte_unoAvec_carte_unoKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tourner_les_mains__Avec_carte_unoAssignment_1"


    // $ANTLR start "rule__Cartes_1_9__SuitesAssignment_0"
    // InternalMyUno.g:4422:1: rule__Cartes_1_9__SuitesAssignment_0 : ( ( 'suites' ) ) ;
    public final void rule__Cartes_1_9__SuitesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4426:1: ( ( ( 'suites' ) ) )
            // InternalMyUno.g:4427:2: ( ( 'suites' ) )
            {
            // InternalMyUno.g:4427:2: ( ( 'suites' ) )
            // InternalMyUno.g:4428:3: ( 'suites' )
            {
             before(grammarAccess.getCartes_1_9Access().getSuitesSuitesKeyword_0_0()); 
            // InternalMyUno.g:4429:3: ( 'suites' )
            // InternalMyUno.g:4430:4: 'suites'
            {
             before(grammarAccess.getCartes_1_9Access().getSuitesSuitesKeyword_0_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getCartes_1_9Access().getSuitesSuitesKeyword_0_0()); 

            }

             after(grammarAccess.getCartes_1_9Access().getSuitesSuitesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__SuitesAssignment_0"


    // $ANTLR start "rule__Cartes_1_9__Suites_royalesAssignment_1"
    // InternalMyUno.g:4441:1: rule__Cartes_1_9__Suites_royalesAssignment_1 : ( ( 'suites_royales' ) ) ;
    public final void rule__Cartes_1_9__Suites_royalesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4445:1: ( ( ( 'suites_royales' ) ) )
            // InternalMyUno.g:4446:2: ( ( 'suites_royales' ) )
            {
            // InternalMyUno.g:4446:2: ( ( 'suites_royales' ) )
            // InternalMyUno.g:4447:3: ( 'suites_royales' )
            {
             before(grammarAccess.getCartes_1_9Access().getSuites_royalesSuites_royalesKeyword_1_0()); 
            // InternalMyUno.g:4448:3: ( 'suites_royales' )
            // InternalMyUno.g:4449:4: 'suites_royales'
            {
             before(grammarAccess.getCartes_1_9Access().getSuites_royalesSuites_royalesKeyword_1_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getCartes_1_9Access().getSuites_royalesSuites_royalesKeyword_1_0()); 

            }

             after(grammarAccess.getCartes_1_9Access().getSuites_royalesSuites_royalesKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__Suites_royalesAssignment_1"


    // $ANTLR start "rule__Cartes_1_9__InterceptionAssignment_2_2"
    // InternalMyUno.g:4460:1: rule__Cartes_1_9__InterceptionAssignment_2_2 : ( ruleInterception ) ;
    public final void rule__Cartes_1_9__InterceptionAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4464:1: ( ( ruleInterception ) )
            // InternalMyUno.g:4465:2: ( ruleInterception )
            {
            // InternalMyUno.g:4465:2: ( ruleInterception )
            // InternalMyUno.g:4466:3: ruleInterception
            {
             before(grammarAccess.getCartes_1_9Access().getInterceptionInterceptionEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleInterception();

            state._fsp--;

             after(grammarAccess.getCartes_1_9Access().getInterceptionInterceptionEnumRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cartes_1_9__InterceptionAssignment_2_2"


    // $ANTLR start "rule__Pioche__Nb_cartes_a_piocherAssignment_3"
    // InternalMyUno.g:4475:1: rule__Pioche__Nb_cartes_a_piocherAssignment_3 : ( ruleNb_cartes_a_piocher ) ;
    public final void rule__Pioche__Nb_cartes_a_piocherAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4479:1: ( ( ruleNb_cartes_a_piocher ) )
            // InternalMyUno.g:4480:2: ( ruleNb_cartes_a_piocher )
            {
            // InternalMyUno.g:4480:2: ( ruleNb_cartes_a_piocher )
            // InternalMyUno.g:4481:3: ruleNb_cartes_a_piocher
            {
             before(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherNb_cartes_a_piocherEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNb_cartes_a_piocher();

            state._fsp--;

             after(grammarAccess.getPiocheAccess().getNb_cartes_a_piocherNb_cartes_a_piocherEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Nb_cartes_a_piocherAssignment_3"


    // $ANTLR start "rule__Pioche__Jouer_apres_piocheAssignment_5"
    // InternalMyUno.g:4490:1: rule__Pioche__Jouer_apres_piocheAssignment_5 : ( ruleJouer_apres_pioche ) ;
    public final void rule__Pioche__Jouer_apres_piocheAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4494:1: ( ( ruleJouer_apres_pioche ) )
            // InternalMyUno.g:4495:2: ( ruleJouer_apres_pioche )
            {
            // InternalMyUno.g:4495:2: ( ruleJouer_apres_pioche )
            // InternalMyUno.g:4496:3: ruleJouer_apres_pioche
            {
             before(grammarAccess.getPiocheAccess().getJouer_apres_piocheJouer_apres_piocheEnumRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleJouer_apres_pioche();

            state._fsp--;

             after(grammarAccess.getPiocheAccess().getJouer_apres_piocheJouer_apres_piocheEnumRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pioche__Jouer_apres_piocheAssignment_5"


    // $ANTLR start "rule__Cumul__Cumul_plus_2Assignment_0"
    // InternalMyUno.g:4505:1: rule__Cumul__Cumul_plus_2Assignment_0 : ( ( 'cumul_plus_2' ) ) ;
    public final void rule__Cumul__Cumul_plus_2Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4509:1: ( ( ( 'cumul_plus_2' ) ) )
            // InternalMyUno.g:4510:2: ( ( 'cumul_plus_2' ) )
            {
            // InternalMyUno.g:4510:2: ( ( 'cumul_plus_2' ) )
            // InternalMyUno.g:4511:3: ( 'cumul_plus_2' )
            {
             before(grammarAccess.getCumulAccess().getCumul_plus_2Cumul_plus_2Keyword_0_0()); 
            // InternalMyUno.g:4512:3: ( 'cumul_plus_2' )
            // InternalMyUno.g:4513:4: 'cumul_plus_2'
            {
             before(grammarAccess.getCumulAccess().getCumul_plus_2Cumul_plus_2Keyword_0_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getCumulAccess().getCumul_plus_2Cumul_plus_2Keyword_0_0()); 

            }

             after(grammarAccess.getCumulAccess().getCumul_plus_2Cumul_plus_2Keyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__Cumul_plus_2Assignment_0"


    // $ANTLR start "rule__Cumul__Cumul_plus_4Assignment_1"
    // InternalMyUno.g:4524:1: rule__Cumul__Cumul_plus_4Assignment_1 : ( ( 'cumul_plus_4' ) ) ;
    public final void rule__Cumul__Cumul_plus_4Assignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4528:1: ( ( ( 'cumul_plus_4' ) ) )
            // InternalMyUno.g:4529:2: ( ( 'cumul_plus_4' ) )
            {
            // InternalMyUno.g:4529:2: ( ( 'cumul_plus_4' ) )
            // InternalMyUno.g:4530:3: ( 'cumul_plus_4' )
            {
             before(grammarAccess.getCumulAccess().getCumul_plus_4Cumul_plus_4Keyword_1_0()); 
            // InternalMyUno.g:4531:3: ( 'cumul_plus_4' )
            // InternalMyUno.g:4532:4: 'cumul_plus_4'
            {
             before(grammarAccess.getCumulAccess().getCumul_plus_4Cumul_plus_4Keyword_1_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCumulAccess().getCumul_plus_4Cumul_plus_4Keyword_1_0()); 

            }

             after(grammarAccess.getCumulAccess().getCumul_plus_4Cumul_plus_4Keyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__Cumul_plus_4Assignment_1"


    // $ANTLR start "rule__Cumul__Cumul_carte_couleurAssignment_2"
    // InternalMyUno.g:4543:1: rule__Cumul__Cumul_carte_couleurAssignment_2 : ( ( 'cumul_carte_couleur' ) ) ;
    public final void rule__Cumul__Cumul_carte_couleurAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4547:1: ( ( ( 'cumul_carte_couleur' ) ) )
            // InternalMyUno.g:4548:2: ( ( 'cumul_carte_couleur' ) )
            {
            // InternalMyUno.g:4548:2: ( ( 'cumul_carte_couleur' ) )
            // InternalMyUno.g:4549:3: ( 'cumul_carte_couleur' )
            {
             before(grammarAccess.getCumulAccess().getCumul_carte_couleurCumul_carte_couleurKeyword_2_0()); 
            // InternalMyUno.g:4550:3: ( 'cumul_carte_couleur' )
            // InternalMyUno.g:4551:4: 'cumul_carte_couleur'
            {
             before(grammarAccess.getCumulAccess().getCumul_carte_couleurCumul_carte_couleurKeyword_2_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getCumulAccess().getCumul_carte_couleurCumul_carte_couleurKeyword_2_0()); 

            }

             after(grammarAccess.getCumulAccess().getCumul_carte_couleurCumul_carte_couleurKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__Cumul_carte_couleurAssignment_2"


    // $ANTLR start "rule__Cumul__Cumul_carte_unoAssignment_3"
    // InternalMyUno.g:4562:1: rule__Cumul__Cumul_carte_unoAssignment_3 : ( ( 'cumul_carte_uno' ) ) ;
    public final void rule__Cumul__Cumul_carte_unoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4566:1: ( ( ( 'cumul_carte_uno' ) ) )
            // InternalMyUno.g:4567:2: ( ( 'cumul_carte_uno' ) )
            {
            // InternalMyUno.g:4567:2: ( ( 'cumul_carte_uno' ) )
            // InternalMyUno.g:4568:3: ( 'cumul_carte_uno' )
            {
             before(grammarAccess.getCumulAccess().getCumul_carte_unoCumul_carte_unoKeyword_3_0()); 
            // InternalMyUno.g:4569:3: ( 'cumul_carte_uno' )
            // InternalMyUno.g:4570:4: 'cumul_carte_uno'
            {
             before(grammarAccess.getCumulAccess().getCumul_carte_unoCumul_carte_unoKeyword_3_0()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getCumulAccess().getCumul_carte_unoCumul_carte_unoKeyword_3_0()); 

            }

             after(grammarAccess.getCumulAccess().getCumul_carte_unoCumul_carte_unoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cumul__Cumul_carte_unoAssignment_3"


    // $ANTLR start "rule__Contestations__Inter_contestableAssignment_0"
    // InternalMyUno.g:4581:1: rule__Contestations__Inter_contestableAssignment_0 : ( ( 'inter_contestable' ) ) ;
    public final void rule__Contestations__Inter_contestableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4585:1: ( ( ( 'inter_contestable' ) ) )
            // InternalMyUno.g:4586:2: ( ( 'inter_contestable' ) )
            {
            // InternalMyUno.g:4586:2: ( ( 'inter_contestable' ) )
            // InternalMyUno.g:4587:3: ( 'inter_contestable' )
            {
             before(grammarAccess.getContestationsAccess().getInter_contestableInter_contestableKeyword_0_0()); 
            // InternalMyUno.g:4588:3: ( 'inter_contestable' )
            // InternalMyUno.g:4589:4: 'inter_contestable'
            {
             before(grammarAccess.getContestationsAccess().getInter_contestableInter_contestableKeyword_0_0()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getContestationsAccess().getInter_contestableInter_contestableKeyword_0_0()); 

            }

             after(grammarAccess.getContestationsAccess().getInter_contestableInter_contestableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__Inter_contestableAssignment_0"


    // $ANTLR start "rule__Contestations__Plus4_contestableAssignment_1"
    // InternalMyUno.g:4600:1: rule__Contestations__Plus4_contestableAssignment_1 : ( ( 'plus4_contestable' ) ) ;
    public final void rule__Contestations__Plus4_contestableAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4604:1: ( ( ( 'plus4_contestable' ) ) )
            // InternalMyUno.g:4605:2: ( ( 'plus4_contestable' ) )
            {
            // InternalMyUno.g:4605:2: ( ( 'plus4_contestable' ) )
            // InternalMyUno.g:4606:3: ( 'plus4_contestable' )
            {
             before(grammarAccess.getContestationsAccess().getPlus4_contestablePlus4_contestableKeyword_1_0()); 
            // InternalMyUno.g:4607:3: ( 'plus4_contestable' )
            // InternalMyUno.g:4608:4: 'plus4_contestable'
            {
             before(grammarAccess.getContestationsAccess().getPlus4_contestablePlus4_contestableKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getContestationsAccess().getPlus4_contestablePlus4_contestableKeyword_1_0()); 

            }

             after(grammarAccess.getContestationsAccess().getPlus4_contestablePlus4_contestableKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contestations__Plus4_contestableAssignment_1"


    // $ANTLR start "rule__Fin_Manche__Dire_uno_obligatoireAssignment_2"
    // InternalMyUno.g:4619:1: rule__Fin_Manche__Dire_uno_obligatoireAssignment_2 : ( ( 'dire_uno_obligatoire' ) ) ;
    public final void rule__Fin_Manche__Dire_uno_obligatoireAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4623:1: ( ( ( 'dire_uno_obligatoire' ) ) )
            // InternalMyUno.g:4624:2: ( ( 'dire_uno_obligatoire' ) )
            {
            // InternalMyUno.g:4624:2: ( ( 'dire_uno_obligatoire' ) )
            // InternalMyUno.g:4625:3: ( 'dire_uno_obligatoire' )
            {
             before(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireDire_uno_obligatoireKeyword_2_0()); 
            // InternalMyUno.g:4626:3: ( 'dire_uno_obligatoire' )
            // InternalMyUno.g:4627:4: 'dire_uno_obligatoire'
            {
             before(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireDire_uno_obligatoireKeyword_2_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireDire_uno_obligatoireKeyword_2_0()); 

            }

             after(grammarAccess.getFin_MancheAccess().getDire_uno_obligatoireDire_uno_obligatoireKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Dire_uno_obligatoireAssignment_2"


    // $ANTLR start "rule__Fin_Manche__Points_mancheAssignment_3"
    // InternalMyUno.g:4638:1: rule__Fin_Manche__Points_mancheAssignment_3 : ( rulePoints_manche ) ;
    public final void rule__Fin_Manche__Points_mancheAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4642:1: ( ( rulePoints_manche ) )
            // InternalMyUno.g:4643:2: ( rulePoints_manche )
            {
            // InternalMyUno.g:4643:2: ( rulePoints_manche )
            // InternalMyUno.g:4644:3: rulePoints_manche
            {
             before(grammarAccess.getFin_MancheAccess().getPoints_manchePoints_mancheParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePoints_manche();

            state._fsp--;

             after(grammarAccess.getFin_MancheAccess().getPoints_manchePoints_mancheParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Manche__Points_mancheAssignment_3"


    // $ANTLR start "rule__Points_manche__Vainqueur_mancheAssignment_3"
    // InternalMyUno.g:4653:1: rule__Points_manche__Vainqueur_mancheAssignment_3 : ( ruleVainqueur_manche ) ;
    public final void rule__Points_manche__Vainqueur_mancheAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4657:1: ( ( ruleVainqueur_manche ) )
            // InternalMyUno.g:4658:2: ( ruleVainqueur_manche )
            {
            // InternalMyUno.g:4658:2: ( ruleVainqueur_manche )
            // InternalMyUno.g:4659:3: ruleVainqueur_manche
            {
             before(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheVainqueur_mancheEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVainqueur_manche();

            state._fsp--;

             after(grammarAccess.getPoints_mancheAccess().getVainqueur_mancheVainqueur_mancheEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Vainqueur_mancheAssignment_3"


    // $ANTLR start "rule__Points_manche__Perdants_mancheAssignment_5"
    // InternalMyUno.g:4668:1: rule__Points_manche__Perdants_mancheAssignment_5 : ( rulePerdants_manche ) ;
    public final void rule__Points_manche__Perdants_mancheAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4672:1: ( ( rulePerdants_manche ) )
            // InternalMyUno.g:4673:2: ( rulePerdants_manche )
            {
            // InternalMyUno.g:4673:2: ( rulePerdants_manche )
            // InternalMyUno.g:4674:3: rulePerdants_manche
            {
             before(grammarAccess.getPoints_mancheAccess().getPerdants_manchePerdants_mancheParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePerdants_manche();

            state._fsp--;

             after(grammarAccess.getPoints_mancheAccess().getPerdants_manchePerdants_mancheParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Points_manche__Perdants_mancheAssignment_5"


    // $ANTLR start "rule__Perdants_manche__Pm_zero_ptsAssignment_1"
    // InternalMyUno.g:4683:1: rule__Perdants_manche__Pm_zero_ptsAssignment_1 : ( ( 'pm_zero_pts' ) ) ;
    public final void rule__Perdants_manche__Pm_zero_ptsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4687:1: ( ( ( 'pm_zero_pts' ) ) )
            // InternalMyUno.g:4688:2: ( ( 'pm_zero_pts' ) )
            {
            // InternalMyUno.g:4688:2: ( ( 'pm_zero_pts' ) )
            // InternalMyUno.g:4689:3: ( 'pm_zero_pts' )
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsPm_zero_ptsKeyword_1_0()); 
            // InternalMyUno.g:4690:3: ( 'pm_zero_pts' )
            // InternalMyUno.g:4691:4: 'pm_zero_pts'
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsPm_zero_ptsKeyword_1_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsPm_zero_ptsKeyword_1_0()); 

            }

             after(grammarAccess.getPerdants_mancheAccess().getPm_zero_ptsPm_zero_ptsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Pm_zero_ptsAssignment_1"


    // $ANTLR start "rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0"
    // InternalMyUno.g:4702:1: rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0 : ( ( 'pm_pts_selon_cartes_restantes' ) ) ;
    public final void rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4706:1: ( ( ( 'pm_pts_selon_cartes_restantes' ) ) )
            // InternalMyUno.g:4707:2: ( ( 'pm_pts_selon_cartes_restantes' ) )
            {
            // InternalMyUno.g:4707:2: ( ( 'pm_pts_selon_cartes_restantes' ) )
            // InternalMyUno.g:4708:3: ( 'pm_pts_selon_cartes_restantes' )
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesPm_pts_selon_cartes_restantesKeyword_2_0_0()); 
            // InternalMyUno.g:4709:3: ( 'pm_pts_selon_cartes_restantes' )
            // InternalMyUno.g:4710:4: 'pm_pts_selon_cartes_restantes'
            {
             before(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesPm_pts_selon_cartes_restantesKeyword_2_0_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesPm_pts_selon_cartes_restantesKeyword_2_0_0()); 

            }

             after(grammarAccess.getPerdants_mancheAccess().getPm_pts_selon_cartes_restantesPm_pts_selon_cartes_restantesKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Perdants_manche__Pm_pts_selon_cartes_restantesAssignment_2_0"


    // $ANTLR start "rule__Fin_Partie__Vainqueur_totalAssignment_4"
    // InternalMyUno.g:4721:1: rule__Fin_Partie__Vainqueur_totalAssignment_4 : ( ruleVainqueur_total ) ;
    public final void rule__Fin_Partie__Vainqueur_totalAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyUno.g:4725:1: ( ( ruleVainqueur_total ) )
            // InternalMyUno.g:4726:2: ( ruleVainqueur_total )
            {
            // InternalMyUno.g:4726:2: ( ruleVainqueur_total )
            // InternalMyUno.g:4727:3: ruleVainqueur_total
            {
             before(grammarAccess.getFin_PartieAccess().getVainqueur_totalVainqueur_totalEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleVainqueur_total();

            state._fsp--;

             after(grammarAccess.getFin_PartieAccess().getVainqueur_totalVainqueur_totalEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Fin_Partie__Vainqueur_totalAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0003200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0018008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0020000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0400000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000003C0000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000002L,0x00000000000000C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000F00L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000003000L});

}
