nom_variante 'regles inventées 2'{
	Depart: 
		etat_main: visible
		nb_mains: 3
		nb_cartes_main: 4
		nb_talons: 3
		riviere
		temps_limite: 2
	;
	
	Manche: 
	    Inversion(avec_carte_inversion avec_carte_sept)
	    Tourner_mains(avec_carte_zero avec_carte_uno)
	    Nb_cartes_jouables(plusieurs_a_la_fois_autorise)
	    Cartes_1_a_9(suites suites_royales interception{mm_nb_couleur})
	    Pioche(nb_cartes_a_piocher: au_plus_trois jouer_apres_pioche: pas_droit_de_jouer)
    	Cumul(cumul_plus_2 cumul_plus_4 cumul_carte_couleur cumul_carte_uno)
    ;
    
    Fin_manche:
    	Points_manche(vainqueur_manche: vm_pts_selon_carte_adversaires perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total(score_le_plus_grd)
    ;
      
}