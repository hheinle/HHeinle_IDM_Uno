nom_variante 'regles hands down' {
	Depart: 
		etat_main: visible
		nb_mains: 1
		nb_cartes_main: 7
		nb_talons: 1
	;
	
	Manche: 
	    Inversion(avec_carte_inversion)
	    Nb_cartes_jouables(plusieurs_a_la_fois_autorise)
	    Cartes_1_a_9(suites interception {mm_nb})
	    Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)
	    Cumul(cumul_plus_4 cumul_plus_2)
	    Contestations(plus4_contestable inter_contestable)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: manche_gagnee perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total (nb_manches_gagnees)
    ;
      
}