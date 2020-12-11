package org.xtexthheinle.uno.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.io.FileWriter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtexthheinle.uno.myUno.Cartes_1_9;
import org.xtexthheinle.uno.myUno.Contestations;
import org.xtexthheinle.uno.myUno.Cumul;
import org.xtexthheinle.uno.myUno.Etat_Main;
import org.xtexthheinle.uno.myUno.Interception;
import org.xtexthheinle.uno.myUno.Inversion;
import org.xtexthheinle.uno.myUno.Jouer_apres_pioche;
import org.xtexthheinle.uno.myUno.Nb_Cartes_Mains;
import org.xtexthheinle.uno.myUno.Nb_Mains;
import org.xtexthheinle.uno.myUno.Nb_cartes_a_piocher;
import org.xtexthheinle.uno.myUno.Nb_cartes_jouables;
import org.xtexthheinle.uno.myUno.Perdants_manche;
import org.xtexthheinle.uno.myUno.Tourner_les_mains;
import org.xtexthheinle.uno.myUno.Vainqueur_manche;
import org.xtexthheinle.uno.myUno.Vainqueur_total;
import org.xtexthheinle.uno.myUno.Variante_UNO;
import org.xtexthheinle.uno.tests.MyUnoInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyUnoInjectorProvider.class)
@SuppressWarnings("all")
public class XtendHtmlCompiler {
  @Inject
  private ParseHelper<Variante_UNO> parseHelper;
  
  @Test
  public void testCompileReglesOfficielles() {
    try {
      final String nom = "regles officielles";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("nom_variante \'regles officielles\'{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Depart: ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("etat_main: cachee");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("nb_mains: 1");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("nb_cartes_main: 7");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("nb_talons: 1");
      _builder.newLine();
      _builder.append("\t");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Manche: ");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("Inversion(avec_carte_inversion)");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("Nb_cartes_jouables(une_par_une)");
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("Fin_manche:");
      _builder.newLine();
      _builder.append("\t   \t");
      _builder.append("dire_uno_obligatoire");
      _builder.newLine();
      _builder.append("\t   \t");
      _builder.append("Points_manche(vainqueur_manche: vm_pts_selon_carte_adversaires perdants_manche: pm_zero_pts)");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("Fin_Partie: ");
      _builder.newLine();
      _builder.append("\t   \t");
      _builder.append("vainqueur_total(score_le_plus_grd)");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t     ");
      _builder.newLine();
      _builder.append("}");
      Variante_UNO config = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(config);
      final EList<Resource.Diagnostic> errors = config.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final CharSequence html = this.configToHtml(config);
      Assertions.assertNotNull(html);
      final FileWriter fw = new FileWriter((nom + ".html"));
      fw.write(html.toString());
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileReglesInventees1() {
    try {
      final String nom = "regles inventees 1";
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("nom_variante \'regles inventées 1\'{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Depart: ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("etat_main: cachee");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("nb_mains: 3");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("nb_cartes_main: 4");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("nb_talons: 3");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("riviere");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("temps_limite: 9");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("Manche: ");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Inversion(avec_carte_sept avec_carte_inversion)");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Tourner_mains(avec_carte_uno avec_carte_zero)");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Nb_cartes_jouables(plusieurs_a_la_fois_autorise)");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Cartes_1_a_9(suites suites_royales interception {mm_nb_couleur})");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Pioche(nb_cartes_a_piocher: au_plus_trois jouer_apres_pioche: droit_de_jouer)");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Cumul(cumul_carte_couleur cumul_carte_uno cumul_plus_2 cumul_plus_4)");
      _builder.newLine();
      _builder.append("\t\t\t\t    ");
      _builder.append("Contestations(plus4_contestable inter_contestable)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("Fin_manche:");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t");
      _builder.append("dire_uno_obligatoire");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t");
      _builder.append("Points_manche(vainqueur_manche: manche_gagnee perdants_manche: pm_zero_pts)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append("Fin_Partie: ");
      _builder.newLine();
      _builder.append("\t\t\t\t   \t");
      _builder.append("vainqueur_total(nb_manches_gagnees)");
      _builder.newLine();
      _builder.append("\t\t\t\t   ");
      _builder.append(";");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      Variante_UNO config = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(config);
      final EList<Resource.Diagnostic> errors = config.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
      final CharSequence html = this.configToHtml(config);
      Assertions.assertNotNull(html);
      final FileWriter fw = new FileWriter((nom + ".html"));
      fw.write(html.toString());
      fw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public CharSequence configToHtml(final Variante_UNO config) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("<title>");
    String _name = config.getName();
    _builder.append(_name);
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h1>");
    String _name_1 = config.getName();
    _builder.append(_name_1, "\t\t");
    _builder.append("</h1>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>Configuration de départ : </h2>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Pour cette variante, chaque joueur se voit distribuer ");
    _builder.newLine();
    _builder.append("\t\t\t");
    Nb_Mains _nb_mains = config.getConfiguration_depart().getMain().getNb_mains();
    _builder.append(_nb_mains, "\t\t\t");
    _builder.append(" main(s) de");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    Nb_Cartes_Mains _nb_cartes_mains = config.getConfiguration_depart().getMain().getNb_cartes_mains();
    _builder.append(_nb_cartes_mains, "\t\t\t");
    _builder.append(" cartes. Une main de joueur doit être ");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    Etat_Main _etat_main = config.getConfiguration_depart().getMain().getEtat_main();
    _builder.append(_etat_main, "\t\t\t");
    _builder.append(".");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    {
      String _riviere = config.getConfiguration_depart().getRiviere();
      boolean _tripleNotEquals = (_riviere != null);
      if (_tripleNotEquals) {
        _builder.append("\t\t\t");
        _builder.append("<p>Il doit y avoir une rivière. ");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("C\'est-à-dire qu\'il doit y avoir 4 cartes à côté du talon.");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    {
      String _temps_limite = config.getConfiguration_depart().getTemps_limite();
      boolean _tripleNotEquals_1 = (_temps_limite != null);
      if (_tripleNotEquals_1) {
        _builder.append("\t\t\t");
        _builder.append("<p>Les joueurs disposent de ");
        int _secondes = config.getConfiguration_depart().getSecondes();
        _builder.append(_secondes, "\t\t\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t");
        _builder.append("secondes durant leur tour pour jouer leur(s) carte(s).");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>Déroulement d\'une manche : </h2>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Un joueur peut poser ");
    _builder.newLine();
    {
      Nb_cartes_jouables _nb_cartes_jouables = config.getManche().getNb_cartes_jouables();
      boolean _equals = Objects.equal(_nb_cartes_jouables, "une_par_une");
      if (_equals) {
        _builder.append("\t\t\t\t");
        _builder.append("une seule carte par tour.");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t\t");
        _builder.append("plusieurs cartes par tour.");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    {
      Inversion _inversion = config.getManche().getInversion();
      boolean _tripleNotEquals_2 = (_inversion != null);
      if (_tripleNotEquals_2) {
        _builder.append("\t\t\t");
        _builder.append("<h3>Inversion du sens de jeu : </h3>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<p>Le sens du jeu peut changer à l\'aide de : <ul>");
        _builder.newLine();
        {
          String _avec_carte_inversion = config.getManche().getInversion().getAvec_carte_inversion();
          boolean _tripleNotEquals_3 = (_avec_carte_inversion != null);
          if (_tripleNotEquals_3) {
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<li>la carte inversion classique</li>");
            _builder.newLine();
          }
        }
        {
          String _avec_carte_sept = config.getManche().getInversion().getAvec_carte_sept();
          boolean _tripleNotEquals_4 = (_avec_carte_sept != null);
          if (_tripleNotEquals_4) {
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<li>les cartes avec le chiffre sept</li>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
      }
    }
    {
      Tourner_les_mains _tourner_les_mains = config.getManche().getTourner_les_mains();
      boolean _tripleNotEquals_5 = (_tourner_les_mains != null);
      if (_tripleNotEquals_5) {
        _builder.append("\t\t\t");
        _builder.append("<h3>Tourner les mains : </h3>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<p>Tous les joueurs échangent leurs mains dans le sens du sens actuel à l\'aide de : <ul>");
        _builder.newLine();
        {
          String _avec_carte_uno = config.getManche().getTourner_les_mains().getAvec_carte_uno();
          boolean _tripleNotEquals_6 = (_avec_carte_uno != null);
          if (_tripleNotEquals_6) {
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<li>la carte UNO</li>");
            _builder.newLine();
          }
        }
        {
          String _avec_carte_zero = config.getManche().getTourner_les_mains().getAvec_carte_zero();
          boolean _tripleNotEquals_7 = (_avec_carte_zero != null);
          if (_tripleNotEquals_7) {
            _builder.append("\t\t\t");
            _builder.append("\t");
            _builder.append("<li>les cartes avec le chiffre zero</li>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("<h3>Pioche : </h3><p>Quand un joueur doit piocher, il peut piocher ");
    _builder.newLine();
    {
      Nb_cartes_a_piocher _nb_cartes_a_piocher = config.getManche().getPioche().getNb_cartes_a_piocher();
      boolean _equals_1 = Objects.equal(_nb_cartes_a_piocher, "une_seule");
      if (_equals_1) {
        _builder.append("\t\t\t");
        _builder.append("une seule carte.");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.append("jusqu\'à trois cartes.");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Après avoir piocher, le joueur ");
    _builder.newLine();
    {
      Jouer_apres_pioche _jouer_apres_pioche = config.getManche().getPioche().getJouer_apres_pioche();
      boolean _equals_2 = Objects.equal(_jouer_apres_pioche, "droit_de_jouer");
      if (_equals_2) {
        _builder.append("\t\t\t");
        _builder.append("a le droit de jouer.");
        _builder.newLine();
      } else {
        _builder.append("\t\t\t");
        _builder.append("n\'a pas le droit de jouer.");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    {
      Contestations _contestations = config.getManche().getContestations();
      boolean _tripleNotEquals_8 = (_contestations != null);
      if (_tripleNotEquals_8) {
        _builder.append("\t\t\t");
        _builder.append("<h3>Contestations : </h3>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<p>Les adversaires peuvent contester l\'action du joueur : <ul>");
        _builder.newLine();
        {
          String _inter_contestable = config.getManche().getContestations().getInter_contestable();
          boolean _tripleNotEquals_9 = (_inter_contestable != null);
          if (_tripleNotEquals_9) {
            _builder.append("\t\t\t");
            _builder.append("<li>s\'il fait une interception</li>");
            _builder.newLine();
          }
        }
        {
          String _plus4_contestable = config.getManche().getContestations().getPlus4_contestable();
          boolean _tripleNotEquals_10 = (_plus4_contestable != null);
          if (_tripleNotEquals_10) {
            _builder.append("\t\t\t");
            _builder.append("<li>s\'il pose une carte +4</li>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    {
      Cumul _cumul = config.getManche().getCumul();
      boolean _tripleNotEquals_11 = (_cumul != null);
      if (_tripleNotEquals_11) {
        _builder.append("\t\t\t");
        _builder.append("<h3>Cumul de cartes : </h3>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("<p>Il est possible de cumuler les cartes : <ul>");
        _builder.newLine();
        {
          String _cumul_plus_2 = config.getManche().getCumul().getCumul_plus_2();
          boolean _tripleNotEquals_12 = (_cumul_plus_2 != null);
          if (_tripleNotEquals_12) {
            _builder.append("\t\t\t");
            _builder.append("<li>les cartes +2</li>");
            _builder.newLine();
          }
        }
        {
          String _cumul_plus_4 = config.getManche().getCumul().getCumul_plus_4();
          boolean _tripleNotEquals_13 = (_cumul_plus_4 != null);
          if (_tripleNotEquals_13) {
            _builder.append("\t\t\t");
            _builder.append("<li>les cartes +4</li>");
            _builder.newLine();
          }
        }
        {
          String _cumul_carte_couleur = config.getManche().getCumul().getCumul_carte_couleur();
          boolean _tripleNotEquals_14 = (_cumul_carte_couleur != null);
          if (_tripleNotEquals_14) {
            _builder.append("\t\t\t");
            _builder.append("<li>les cartes couleur</li>");
            _builder.newLine();
          }
        }
        {
          String _cumul_carte_uno = config.getManche().getCumul().getCumul_carte_uno();
          boolean _tripleNotEquals_15 = (_cumul_carte_uno != null);
          if (_tripleNotEquals_15) {
            _builder.append("\t\t\t");
            _builder.append("<li>les cartes Uno</li>");
            _builder.newLine();
          }
        }
        _builder.append("\t\t\t");
        _builder.append("</ul>");
        _builder.newLine();
        _builder.append("\t\t\t");
        _builder.append("</p>");
        _builder.newLine();
      }
    }
    {
      Cartes_1_9 _cartes_1_9 = config.getManche().getCartes_1_9();
      boolean _tripleNotEquals_16 = (_cartes_1_9 != null);
      if (_tripleNotEquals_16) {
        _builder.append("\t\t\t");
        _builder.append("<h3>Effets sur les cartes 1 à 9 : </h3><ul>");
        _builder.newLine();
        {
          String _suites = config.getManche().getCartes_1_9().getSuites();
          boolean _tripleNotEquals_17 = (_suites != null);
          if (_tripleNotEquals_17) {
            _builder.append("\t\t\t");
            _builder.append("<li>les suites sont autorisées</li>");
            _builder.newLine();
          }
        }
        {
          String _suites_royales = config.getManche().getCartes_1_9().getSuites_royales();
          boolean _tripleNotEquals_18 = (_suites_royales != null);
          if (_tripleNotEquals_18) {
            _builder.append("\t\t\t");
            _builder.append("<li>les suites royales sont autorisées</li>");
            _builder.newLine();
          }
        }
        {
          Interception _interception = config.getManche().getCartes_1_9().getInterception();
          boolean _tripleNotEquals_19 = (_interception != null);
          if (_tripleNotEquals_19) {
            _builder.append("\t\t\t");
            _builder.append("<li>il est possible d\'interrompre ces suites en posant une carte de ");
            _builder.newLine();
            {
              Interception _interception_1 = config.getManche().getCartes_1_9().getInterception();
              boolean _equals_3 = Objects.equal(_interception_1, "mm_nb");
              if (_equals_3) {
                _builder.append("\t\t\t");
                _builder.append("même nombre.");
                _builder.newLine();
              } else {
                Interception _interception_2 = config.getManche().getCartes_1_9().getInterception();
                boolean _equals_4 = Objects.equal(_interception_2, "mm_couleur");
                if (_equals_4) {
                  _builder.append("\t\t\t");
                  _builder.append("même couleur.");
                  _builder.newLine();
                } else {
                  _builder.append("\t\t\t");
                  _builder.append("même nombre et de même couleur.");
                  _builder.newLine();
                }
              }
            }
            _builder.append("\t\t\t");
            _builder.append("</li>");
            _builder.newLine();
            _builder.append("\t\t\t");
            _builder.append("</ul>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<h2>Fin de manche : </h2>");
    _builder.newLine();
    {
      String _dire_uno_obligatoire = config.getFin_manche().getDire_uno_obligatoire();
      boolean _tripleNotEquals_20 = (_dire_uno_obligatoire != null);
      if (_tripleNotEquals_20) {
        _builder.append("\t\t\t");
        _builder.append("<p>Les joueurs doivent annoncer \"UNO\" en jouant leurs avant-dernières cartes.</p>");
        _builder.newLine();
      }
    }
    _builder.append("\t\t\t");
    _builder.append("<p>Le premier joueur à s\'être débarassé de toutes ses cartes remporte la manche. ");
    _builder.newLine();
    {
      Vainqueur_manche _vainqueur_manche = config.getFin_manche().getPoints_manche().getVainqueur_manche();
      boolean _equals_5 = Objects.equal(_vainqueur_manche, "manche_gagnee");
      if (_equals_5) {
        _builder.append("\t\t\t");
        _builder.append("Ce joueur ne marque pas de points mais comptabilise une manche gagnée.");
        _builder.newLine();
      } else {
        Vainqueur_manche _vainqueur_manche_1 = config.getFin_manche().getPoints_manche().getVainqueur_manche();
        boolean _equals_6 = Objects.equal(_vainqueur_manche_1, "vm_pts_selon_carte_adversaires");
        if (_equals_6) {
          _builder.append("\t\t\t");
          _builder.append("Ce joueur marque des points en fonction des cartes que tous ");
          _builder.newLine();
          _builder.append("\t\t\t");
          _builder.append("ses adversaires ont encore en main à cet instant.");
          _builder.newLine();
        } else {
          _builder.append("\t\t\t");
          _builder.append("Ce joueur ne marque pas de points.");
          _builder.newLine();
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    {
      Perdants_manche _perdants_manche = config.getFin_manche().getPoints_manche().getPerdants_manche();
      boolean _equals_7 = Objects.equal(_perdants_manche, "pm_zero_pts");
      if (_equals_7) {
        _builder.append("\t\t\t");
        _builder.append("<p>Les perdants ne marquent pas de points.");
        _builder.newLine();
      } else {
        Perdants_manche _perdants_manche_1 = config.getFin_manche().getPoints_manche().getPerdants_manche();
        boolean _equals_8 = Objects.equal(_perdants_manche_1, "pm_pts_selon_cartes_restantes");
        if (_equals_8) {
          _builder.append("\t\t\t");
          _builder.append("<p>Les perdants marquent autant de points que les cartes qu\'ils ont encore en main à cet instant.\t\t\t\t\t\t\t\t\t\t");
          _builder.newLine();
        }
      }
    }
    _builder.append("\t\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<h2>Fin de la partie : </h2>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p>Le vainqueur de la partie est le joueur qui ");
    _builder.newLine();
    {
      Vainqueur_total _vainqueur_total = config.getFin_partie().getVainqueur_total();
      boolean _equals_9 = Objects.equal(_vainqueur_total, "score_le_plus_grd");
      if (_equals_9) {
        _builder.append("\t\t\t");
        _builder.append("a le plus grand score.");
        _builder.newLine();
      } else {
        Vainqueur_total _vainqueur_total_1 = config.getFin_partie().getVainqueur_total();
        boolean _equals_10 = Objects.equal(_vainqueur_total_1, "nb_manches_gagnees");
        if (_equals_10) {
          _builder.append("\t\t\t");
          _builder.append("comptabilise le plus de manche gagnées.");
          _builder.newLine();
        } else {
          Vainqueur_total _vainqueur_total_2 = config.getFin_partie().getVainqueur_total();
          boolean _equals_11 = Objects.equal(_vainqueur_total_2, "moins_de_500_pts");
          if (_equals_11) {
            _builder.append("\t\t\t");
            _builder.append("a moins de 500 points.");
            _builder.newLine();
          } else {
            _builder.append("\t\t\t");
            _builder.append("a le plus petit score.");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("</p>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
}
