nom_variante 'regles 3 talons'{
	Depart: 
		etat_main: cachee
		nb_mains: 1
		nb_cartes_main: 7
		nb_talons: 3
	;
	
	Manche: 
	    Inversion(avec_carte_inversion)
	    Nb_cartes_jouables(une_par_une)
	    Pioche(nb_cartes_a_piocher: au_plus_trois jouer_apres_pioche: pas_droit_de_jouer)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: manche_gagnee perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total(nb_manches_gagnees)
    ;
      
}