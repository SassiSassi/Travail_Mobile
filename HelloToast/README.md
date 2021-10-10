HelloToast - Solution Code
==========================

Simple app with two buttons: one to count and one to show a Toast.

Introduction
------------

This app extends Hello World, showing how to create a basic layout with a
TextView and Button elements. It also shows how to add onClick handlers
for the Button elements, how to display text in a TextView, and
how to show a toast.

Pre-requisites
--------------

You need to know:
- How to open and run apps with Android Studio.

Getting Started
---------------

1. Download the code.
2. Open the code in Android Studio.
3. Run the app.


License
-------

Copyright 2018 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.

Réponse:
Question 1 :Quelles modifications sont apportées lorsque vous ajoutez une deuxième activité à votre application en choisissant File > New > Activity 
et un modèle d'activité:

-La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML est créé et le fichier AndroidManifest.xml 
est modifié pour déclarer une deuxième activité.

Question 2:Que se passe-t-il si vous supprimez les éléments android:parentActivityName et <méta-data> de la deuxième déclaration 
d'activité du fichier AndroidManifest.xml:

-Le bouton Back (Précédent) ne fonctionne plus dans la deuxième activité pour renvoyer l'utilisateur à l'activité principale.

Question 3:Quelle méthode de constructeur utilisez-vous pour créer une nouvelle intention (Intent) explicite:

-new Intent(Context context, Class<?> class)

Question 4:Dans l'application HelloToast (du Travail à faire), comment ajoutez-vous la valeur actuelle 
du comptage à l'intention (Intent):

-Comme extra d'intention (Intent)

Question 5:Dans l'application HelloToast (du Travail à faire), comment afficher le nombre actuel dans 
la deuxième activité "Hello":

-Tout ce qui précède.

