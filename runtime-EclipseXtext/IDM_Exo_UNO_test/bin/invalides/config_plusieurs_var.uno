nom_variante 'regles invalides 1'{
	Depart: 
		etat_main: cachee
		nb_mains: 1
		nb_cartes_main: "7"
		nb_talons: 1
	;
	
	Manche: 
	    Inversion(avec_carte_inversion avec_carte_sept )
	    Nb_cartes_jouables(une_par_une )
	    Cartes_1_a_9(suites interception {mm_couleur})
	    Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)
	    Cumul(cumul_plus_2 cumul_carte_couleur)
	    Contestations(inter_contestable)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: vm_pts_selon_carte_adversaires perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total (nb_manches_gagnees)
    ;
      
}
nom_variante 'deuxieme variant dans le meme fichier qu\'une autre'{
	Depart: 
		etat_main: cachee
		nb_mains: une_main
		nb_cartes_main: sept_cartes
		nb_talons: un
	;
	
	Manche: 
	    Inversion(avec_carte_inversion avec_carte_sept )
	    Nb_cartes_jouables(une_par_une )
	    Cartes_1_a_9(suites interception {mm_couleur})
	    Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)
	    Cumul(cumul_plus_2 cumul_carte_couleur)
	    Contestations(inter_contestable)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: vm_pts_selon_carte_adversaires perdants_manche: pm_zero_pts)
    ;
    
    Fin_Partie: 
    	vainqueur_total (nb_manches_gagnees)
    ;
      
}