nom_variante 'regles suites royales'{
	Depart: 
		etat_main: cachee
		nb_mains: 1
		nb_cartes_main: 7
		nb_talons: 1
	;
	
	Manche: 
	    Nb_cartes_jouables(plusieurs_a_la_fois_autorise)
	    Cartes_1_a_9(suites_royales interception{mm_nb_couleur})
	    Pioche(nb_cartes_a_piocher: une_seule jouer_apres_pioche: droit_de_jouer)
    ;
    
    Fin_manche:
    	dire_uno_obligatoire
    	Points_manche(vainqueur_manche: vm_zero_pts perdants_manche: pm_pts_selon_cartes_restantes{elimination_si_500_pts})
    ;
    
    Fin_Partie: 
    	vainqueur_total(moins_de_500_pts)
    ;
      
}