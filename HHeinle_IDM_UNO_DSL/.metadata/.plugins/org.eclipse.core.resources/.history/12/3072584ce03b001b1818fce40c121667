package org.xtexthheinle.uno.tests;

import org.xtexthheinle.uno.myUno.Cartes_1_9;
import org.xtexthheinle.uno.myUno.Configuration_Depart;
import org.xtexthheinle.uno.myUno.Contestations;
import org.xtexthheinle.uno.myUno.Cumul;
import org.xtexthheinle.uno.myUno.Etat_Main;
import org.xtexthheinle.uno.myUno.Fin_Manche;
import org.xtexthheinle.uno.myUno.Fin_Partie;
import org.xtexthheinle.uno.myUno.Inversion;
import org.xtexthheinle.uno.myUno.Main;
import org.xtexthheinle.uno.myUno.Manche;
import org.xtexthheinle.uno.myUno.Tourner_les_mains;
import org.xtexthheinle.uno.myUno.Variante_UNO;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import com.google.common.io.Files;

public class HtmlCompiler {
	private Variante_UNO variante;
	private String htmlCode;

	HtmlCompiler(Variante_UNO variante) {
		this.variante = variante;
	}

	public void compileAndRun() throws IOException {

		// #######Recup des variables#######
		String nomVariante = this.variante.getName();

		// =======Configuration_Depart=======
		Configuration_Depart coDepart = this.variante.getConfiguration_depart();
		Main main = coDepart.getMain();
		String etatMain = main.getEtat_main().getLiteral();
		String nbMains = main.getNb_mains().getLiteral();
		String nbCartesMain = main.getNb_cartes_mains().getLiteral();
		String nbTalons = coDepart.getTalon().getNb_talons().getLiteral();
		String riviere = coDepart.getRiviere();
		String temps_limite = coDepart.getTemps_limite();

		// =======Manche=======
		Manche manche = this.variante.getManche();
		Inversion inversion = manche.getInversion();
		String inversion1 = null;
		String inversion2 = null;
		if (inversion != null) {
			inversion1 = inversion.getAvec_carte_inversion();
			inversion2 = inversion.getAvec_carte_sept();
		}
		Tourner_les_mains tourner_les_mains = manche.getTourner_les_mains();
		String tourner_mains1 = null;
		String tourner_mains2 = null;
		if (tourner_les_mains != null) {
			tourner_mains1 = tourner_les_mains.getAvec_carte_uno();
			tourner_mains2 = tourner_les_mains.getAvec_carte_zero();
		}
		String nb_cartes_jouables = manche.getNb_cartes_jouables().getName();
		Cartes_1_9 cartes_1_9 = manche.getCartes_1_9();
		String suites = null;
		String suites_royales = null;
		String interception = null;
		if (cartes_1_9 != null) {
			suites = cartes_1_9.getSuites();
			suites_royales = cartes_1_9.getSuites_royales();
			interception = cartes_1_9.getInterception().getName();
		}
		String nb_cartes_a_piocher = manche.getPioche().getNb_cartes_a_piocher().getName();
		String jouer_apres_pioche = manche.getPioche().getJouer_apres_pioche().getName();
		Cumul cumul = manche.getCumul();
		String cumul_plus_2 = null;
		String cumul_plus_4 = null;
		String cumul_carte_couleur = null;
		String cumul_carte_uno = null;
		if (cumul != null) {
			cumul_plus_2 = cumul.getCumul_plus_2();
			cumul_plus_4 = cumul.getCumul_plus_4();
			cumul_carte_couleur = cumul.getCumul_carte_couleur();
			cumul_carte_uno = cumul.getCumul_carte_uno();
		}
		Contestations contestations = manche.getContestations();
		String inter_contestable = null;
		String plus4_contestable = null;
		if (contestations != null) {
			inter_contestable = contestations.getInter_contestable();
			plus4_contestable = contestations.getPlus4_contestable();
		}

		// =======Fin_Manche=======
		Fin_Manche fin_Manche = this.variante.getFin_manche();
		String dire_uno = fin_Manche.getDire_uno_obligatoire();
		String vainqueur_manche = fin_Manche.getPoints_manche().getVainqueur_manche().getName();
		String perdants_manche = fin_Manche.getPoints_manche().getPerdants_manche().getPm_zero_pts();
		String pm_pts_cartes_restantes = fin_Manche.getPoints_manche().getPerdants_manche()
				.getPm_pts_selon_cartes_restantes();

		// =======Fin_Partie=======
		Fin_Partie fin_Partie = this.variante.getFin_partie();
		String vainqueur_total = fin_Partie.getVainqueur_total().getName();

		// #######Texte#######

		htmlCode = "<!DOCTYPE html>\n" + "<html>" + "<title>" + nomVariante + "</title>";
		htmlCode += "<h1 style=\"text-align:center\">Variante : " + nomVariante + "</h1>";

		// =======Configuration_Depart=======
		htmlCode += "<h2>Configuration de départ :</h2>";
		htmlCode += "<p>Pour cette variante, chaque joueur se voit distribuer " + nbMains + " main(s) de "
				+ nbCartesMain + " cartes. Une main de joueur doit être " + etatMain + ".<p>";
		htmlCode += "<p>Il doit y avoir " + nbTalons + " talon(s) où poser les cartes jouées.</p>";
		if (riviere != null) {
			htmlCode += "<p>Il doit y avoir une rivière. C'est-à-dire qu'il doit y avoir 4 cartes à côté du talon.</p>";
		}
		if (temps_limite != null) {
			htmlCode += "<p>Les joueurs disposent de " + coDepart.getSecondes()
					+ " secondes durant leur tour pour jouer leur(s) carte(s).</p>";
		}

		// =======Manche=======
		htmlCode += "<h2>Déroulement d'une manche :</h2>";
		htmlCode += "<p>Un joueur peut poser ";
		if (nb_cartes_jouables.equalsIgnoreCase("Une_par_une")) {
			htmlCode += "une seule carte par tour.";
		} else {
			htmlCode += "plusieurs cartes par tour.";
		}
		this.endingParagraph();
		if (inversion != null) {
			htmlCode += "<h3>Inversion du sens de jeu : </h3>";
			htmlCode += "<p>Le sens du jeu peut changer à l'aide de : <ul>";
			if (inversion1 != null) {
				htmlCode += "<li>la carte inversion classique</li>";
			}
			if (inversion2 != null) {
				htmlCode += "<li>les cartes avec le chiffre sept</li>";
			}
			this.endingList();
			this.endingParagraph();
		}

		if (tourner_les_mains != null) {
			htmlCode += "<h3>Tourner les mains : </h3>";
			htmlCode += "<p>Tous les joueurs échangent leurs mains dans le sens du sens actuel à l'aide de : <ul>";
			if (tourner_mains1 != null) {
				htmlCode += "<li>la carte UNO</li>";
			}
			if (tourner_mains2 != null) {
				htmlCode += "<li>Les cartes avec le chiffre zero</li>";
			}
			this.endingList();
			this.endingParagraph();
		}

		htmlCode += "<h3>Pioche : </h3><p>Quand un joueur doit piocher, il peut piocher ";
		if (nb_cartes_a_piocher.equalsIgnoreCase("Une_seule")) {
			htmlCode += "une seule carte.";
		} else {
			htmlCode += "jusqu'à trois cartes.";
		}
		this.endingParagraph();
		htmlCode += "<p>Après avoir piocher, le joueur ";
		if (jouer_apres_pioche.equalsIgnoreCase("droit_de_jouer")) {
			htmlCode += "a le droit de jouer.";
		} else {
			htmlCode += "n'a pas le droit de jouer.";
		}
		this.endingParagraph();

		if (contestations != null) {
			htmlCode += "<h3>Contestations : </h3><p>Les adversaires peuvent contester l'action du joueur : <ul>";
			if (inter_contestable != null) {
				htmlCode += "<li>s'il fait une interception</li>";
			}
			if (plus4_contestable != null) {
				htmlCode += "<li>s'il pose une carte +4.</li>";
			}
			this.endingList();
			this.endingParagraph();
		}
		if (cumul != null) {
			htmlCode += "<p>Il est possible de cumuler les cartes : <ul>";
			if (cumul_plus_2 != null) {
				htmlCode += "<li>les cartes +2</li>";
			}
			if (cumul_plus_4 != null) {
				htmlCode += "<li>les cartes +4</li>";
			}
			if (cumul_carte_couleur != null) {
				htmlCode += "<li>les cartes couleur</li>";

			}
			if (cumul_carte_uno != null) {
				htmlCode += "<li>les cartes Uno</li>";
			}
			endingList();
			this.endingParagraph();
		}

		if (cartes_1_9 != null) {
			htmlCode += "<h3>Effets sur les cartes 1 à 9 : </h3><ul>";
			if (suites != null) {
				htmlCode += "<li>les suites sont autorisées</li>";
			}
			if (suites_royales != null) {
				htmlCode += "<li>les suites royales sont autorisées</li>";
			}
			if (interception != null) {
				htmlCode += "<li>il est possible d'interrompre ces suites en posant une carte de ";
				if (interception.equalsIgnoreCase("mm_nb")) {
					htmlCode += "même nombre";
				} else if (interception.equalsIgnoreCase("mm_couleur")) {
					htmlCode += "même couleur";
				} else {
					htmlCode += "même nombre et de même couleur";
				}
				htmlCode += "</li>";
			}
			this.endingList();
			this.endingParagraph();
		}

		// =======Fin_Manche=======
		htmlCode += "<h2>Fin d'une manche :</h2>";
		if (dire_uno.equalsIgnoreCase("dire_uno_obligatoire")) {
			htmlCode += "<p>Les joueurs doivent annoncer \"UNO\" en jouant leurs avant-dernières cartes.</p>";
		}
		htmlCode += "<p>Le premier joueur à s'être débarassé de toutes ses cartes remporte la manche. ";
		if (vainqueur_manche.equalsIgnoreCase("manche_Gagnee")) {
			htmlCode += "Ce joueur ne marque pas de points mais comptabilise une manche gagnée.";
		} else if (vainqueur_manche.equalsIgnoreCase("vm_pts_selon_carte_adversaires")) {
			htmlCode += "Ce joueur marque des points en fonction des cartes que tous ses adversaires ont encore en main à cet instant.";
		} else {
			htmlCode += "Ce joueur ne marque pas de points.";
		}
		this.endingParagraph();
		if (perdants_manche.equalsIgnoreCase("pm_zero_pts")) {
			htmlCode += "<p>Les perdants ne marquent pas de points.";
		} else if (perdants_manche.equalsIgnoreCase("pm_pts_selon_cartes_restantes")) {
			htmlCode += "<p>Les perdants marquent autant de points que les cartes qu'ils ont encore en main à cet instant.";
		}
		this.endingParagraph();

		// =======Fin de partie=======
		htmlCode += "<h2>Fin de la partie :</h2>";
		htmlCode += "<p>Le vainqueur de la partie est le joueur qui ";
		if (vainqueur_total.equalsIgnoreCase("score_le_plus_grd")) {
			htmlCode += "a le plus grand score.";
		} else if (vainqueur_total.equalsIgnoreCase("nb_manches_gagnees")) {
			htmlCode += "comptabilise le plus de manche gagnées.";
		} else if (vainqueur_total.equalsIgnoreCase("moins_de_500_pts")) {
			htmlCode += "a moins de 500 points.";
		} else {
			htmlCode += "a le plus petit score.";
		}
		this.endingParagraph();

		// serialize code into HTML file
		String HTML_OUTPUT = nomVariante + ".html";
		File file = new java.io.File(HTML_OUTPUT);
		Files.write(htmlCode.getBytes(), file);
		if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
			try {
				Desktop.getDesktop().open(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void endingList() {
		htmlCode += "</ul>";
	}

	private void endingParagraph() {
		this.htmlCode += "</p>";
	}
}
