# IDM_Exercice_UNO - Hélène Heinlé - M2MIAGE - DLIS
IDM - exo : Ligne de produits logiciels, configurations, feature model 

### Q1: Ecrire un feature model (FM) + Combien y a-t-il de variantes du Uno? 
Voir le FM et les configurations dans le dossier "HHeinle_IDM_UNO_FM".
Il y a une quantité non énumérable de variantes. On peut en inventer une grande quantité.

### Q2: Inventer un DSL avec une grammaire Xtext qui permet à un utilisateur de spécifier n’importe quelle règle complète du Uno. 
Voir le DSL dans le dossier "HHeinle_IDM_UNO_DSL".
Les fichiers ".uno" respectant cette grammaire sont dans le dossier "runtime-EclipseXtext".
Pour ce qui est des contraintes précisées sur le FM de la Q1, elles pourront, pour le DSL, être gérées par le compilateur afin d'éviter les incohérences.

### Q3: Spécifier en JSON plusieurs règles du Uno et spécifier le schema JSON associé. 
Voir le schema et les fichiers ".json" dans le dossier "HHeinle_IDM_UNO_JSON". La compatibilité schéma <--> configuration est vérifiée avec la classe "TestJsonValid.java".

### Q4: On souhaite écrire un générateur de règles Uno (pour fournir à des joueurs en début de partie, par exemple pour éviter tout conflit). Comment développeriez-vous ce générateur avec le FM de la Q1, le DSL de la Q2, et le JSON de la Q3?
  * avec le FM de la Q1 :
  On pourrais parcourir la source d'un fichier "ma_variante.config" et selon les cases/choix faits dedans, on remplit une template (texte ou html par exemple).
  
  * avec le DSL de la Q2 :
  Je développerais un compilateur qui, au lieu de générer du code, générerais un fichier .txt ou .html. Il prendrait donc en entrée un fichier "ma_variante.uno" respectant la grammaire préciser à la Q2. Le compilateur parcourrais ce fichier afin d'en tirer les attributs via les fonctions du méta-modèle. Il y aurait en fait un template avec les termes fixes des règles du jeu. Les parties variables serait remplies via le contenu du "ma_variante.uno".
  
  * avec le JSON de la Q3 :
  J'écrirais un parser JSON prenant un fichier "ma_variante.json" en entrée et créant en sortie un fichier .txt ou .html. De la même façon que le point précédent, une template sera générée avec des parties variables récupérées depuis le fichier "ma_variante.json"

### Q4: (Bonus): Implémenter un tel générateur avec la technologie de votre choix.
Voir le générateur "XtendHtmlCompiler.xtend" dans le package "tests" du dossier "HHeinle_IDM_UNO_DSL". Cette classe Xtend lance 2 tests de génération de pages HTML à partir de configurations ".uno" et génère des ".html". Cette classe Xtend utilise le système de templates.

### Q5: On souhaite transformer un programme écrit dans votre DSL (cf Q2) en fichier JSON (et vice-versa). Comment développeriez-vous cette transformation? 
On pourrait utiliser des annotations.


