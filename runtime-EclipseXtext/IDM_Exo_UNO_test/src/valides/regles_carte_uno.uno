nom_variante 'regles carte UNO'{
	Depart: 
		etat_main: cachee
		nb_mains: 1
		nb_cartes_main: 7
		nb_talons: 1
	;
	
	Manche: 
	    Inversion(avec_carte_inversion)
	    Tourner_mains(avec_carte_uno)
	    Nb_cartes_jouables(une_par_une)
	    Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: vm_pts_selon_carte_adversaires perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total(score_le_plus_grd)
    ;
      
}