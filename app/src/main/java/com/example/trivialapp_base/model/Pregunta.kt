package com.example.trivialapp_base.model

// Definición de la clase de datos Pregunta según requisitos
data class Pregunta(
    val pregunta: String,
    val categoria: String,
    val dificultad: String, // "Facil", "Medio", "Dificil"
    val respuesta1: String,
    val respuesta2: String,
    val respuesta3: String,
    val respuesta4: String,
    val respuestaCorrecta: String // Debe coincidir con una de las anteriores
)

// Objeto para simular la base de datos local (Hardcoded)
object ProveedorPreguntas {
    fun obtenerPreguntas(): MutableList<Pregunta> {
        return mutableListOf(

            // ================= FACIL (20) =================
            Pregunta("¿Capital de Francia?", "Geografía", "Facil", "Madrid", "París", "Berlín", "Roma", "París"),
            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Facil", "Van Gogh", "Picasso", "Leonardo da Vinci", "Dalí", "Leonardo da Vinci"),
            Pregunta("¿En qué deporte se usa un balón naranja?", "Deporte", "Facil", "Fútbol", "Baloncesto", "Tenis", "Voleibol", "Baloncesto"),
            Pregunta("¿Año en que llegó el hombre a la Luna?", "Historia", "Facil", "1965", "1969", "1972", "1959", "1969"),
            Pregunta("¿Saga donde aparece Darth Vader?", "Cine", "Facil", "Star Trek", "Star Wars", "Matrix", "Alien", "Star Wars"),
            Pregunta("¿País con forma de bota?", "Geografía", "Facil", "España", "Grecia", "Italia", "Portugal", "Italia"),
            Pregunta("¿Color resultante de mezclar azul y amarillo?", "Arte", "Facil", "Rojo", "Verde", "Morado", "Naranja", "Verde"),
            Pregunta("¿Videojuego protagonizado por Mario?", "Videojuegos", "Facil", "Zelda", "Sonic", "Mario Bros", "Metroid", "Mario Bros"),
            Pregunta("¿Deporte de Rafa Nadal?", "Deporte", "Facil", "Fútbol", "Tenis", "Baloncesto", "Golf", "Tenis"),
            Pregunta("¿Capital de España?", "Geografía", "Facil", "Madrid", "Barcelona", "Valencia", "Sevilla", "Madrid"),
            Pregunta("¿Instrumento con teclas blancas y negras?", "Arte", "Facil", "Guitarra", "Violín", "Piano", "Flauta", "Piano"),
            Pregunta("¿Personaje símbolo de Nintendo?", "Videojuegos", "Facil", "Zorro", "Erizo", "Fontanero", "Dragón", "Fontanero"),
            Pregunta("¿Planeta rojo?", "Geografía", "Facil", "Marte", "Venus", "Júpiter", "Saturno", "Marte"),
            Pregunta("¿Primer presidente de EE.UU.?", "Historia", "Facil", "Lincoln", "Washington", "Jefferson", "Adams", "Washington"),
            Pregunta("¿Película de dinosaurios famosa?", "Cine", "Facil", "Avatar", "Jurassic Park", "Titanic", "Rocky", "Jurassic Park"),
            Pregunta("¿Capital de Francia?", "Geografía", "Facil", "Madrid", "París", "Berlin", "Roma", "París"),
            Pregunta("¿Fórmula del agua?", "Ciencia", "Facil", "H2O", "CO2", "O2", "H2O2", "H2O"),
            Pregunta("¿Quién pintó la Mona Lisa?", "Arte", "Medio", "Picasso", "Van Gogh", "Da Vinci", "Dalí", "Da Vinci"),
            Pregunta("¿Planeta más grande?", "Ciencia", "Medio", "Tierra", "Marte", "Júpiter", "Saturno", "Júpiter"),
            Pregunta("¿Año descubrimiento América?", "Historia", "Medio", "1492", "1500", "1485", "1992", "1492"),


            // ================= MEDIO (15) =================
            Pregunta("¿Capital de Canadá?", "Geografía", "Medio", "Toronto", "Vancouver", "Ottawa", "Montreal", "Ottawa"),
            Pregunta("¿Director de Pulp Fiction?", "Cine", "Medio", "Spielberg", "Tarantino", "Scorsese", "Nolan", "Tarantino"),
            Pregunta("¿Año de inicio de la II Guerra Mundial?", "Historia", "Medio", "1936", "1939", "1941", "1945", "1939"),
            Pregunta("¿Juego exclusivo de PlayStation?", "Videojuegos", "Medio", "Halo", "Forza", "God of War", "Zelda", "God of War"),
            Pregunta("¿País más grande del mundo?", "Geografía", "Medio", "China", "EE.UU.", "Canadá", "Rusia", "Rusia"),
            Pregunta("¿Autor de Guernica?", "Arte", "Medio", "Picasso", "Dalí", "Miró", "Velázquez", "Picasso"),
            Pregunta("¿Deporte con Grand Slams?", "Deporte", "Medio", "Golf", "Tenis", "Críquet", "Rugby", "Tenis"),
            Pregunta("¿Protagonista de Matrix?", "Cine", "Medio", "Neo", "Trinity", "Morpheus", "Smith", "Neo"),
            Pregunta("¿Civilización de las pirámides?", "Historia", "Medio", "Mayas", "Egipcios", "Aztecas", "Romanos", "Egipcios"),
            Pregunta("¿Juego de mundo abierto de Rockstar?", "Videojuegos", "Medio", "FIFA", "GTA", "Minecraft", "Fortnite", "GTA"),
            Pregunta("¿Río más largo del mundo?", "Geografía", "Medio", "Amazonas", "Nilo", "Yangtsé", "Misisipi", "Amazonas"),
            Pregunta("¿Pintor del Barroco español?", "Arte", "Medio", "Goya", "Velázquez", "Sorolla", "Picasso", "Velázquez"),
            Pregunta("¿Selección con más Copas del Mundo?", "Deporte", "Medio", "Alemania", "Italia", "Brasil", "Argentina", "Brasil"),
            Pregunta("¿Saga de Frodo Bolsón?", "Cine", "Medio", "Harry Potter", "El Señor de los Anillos", "Star Wars", "Narnia", "El Señor de los Anillos"),
            Pregunta("¿Imperio de Julio César?", "Historia", "Medio", "Griego", "Romano", "Persa", "Egipcio", "Romano"),


            // ================= DIFICIL (20) =================
            Pregunta("¿Capital de Sri Lanka?", "Geografía", "Dificil", "Colombo", "Kandy", "Sri Jayawardenepura Kotte", "Galle", "Sri Jayawardenepura Kotte"),
            Pregunta("¿Año de caída del Imperio Romano de Occidente?", "Historia", "Dificil", "410", "476", "395", "500", "476"),
            Pregunta("¿Director de 2001: Odisea del espacio?", "Cine", "Dificil", "Kubrick", "Ridley Scott", "Lucas", "Coppola", "Kubrick"),
            Pregunta("¿Primer videojuego de la historia?", "Videojuegos", "Dificil", "Pong", "Spacewar!", "Tetris", "Pac-Man", "Spacewar!"),
            Pregunta("¿Cordillera más larga del mundo?", "Geografía", "Dificil", "Himalaya", "Alpes", "Andes", "Rocosas", "Andes"),
            Pregunta("¿Pintor del Juicio Final?", "Arte", "Dificil", "Miguel Ángel", "Rafael", "Donatello", "Caravaggio", "Miguel Ángel"),
            Pregunta("¿Mundial ganado por España?", "Deporte", "Dificil", "2006", "2010", "2014", "2018", "2010"),
            Pregunta("¿Película ganadora del Óscar 2020?", "Cine", "Dificil", "1917", "Joker", "Parásitos", "Ford v Ferrari", "Parásitos"),
            Pregunta("¿Rey español durante 1492?", "Historia", "Dificil", "Carlos I", "Felipe II", "Fernando el Católico", "Isabel II", "Fernando el Católico"),
            Pregunta("¿Juego soulslike de FromSoftware?", "Videojuegos", "Dificil", "Sekiro", "Skyrim", "Witcher", "Assassin's Creed", "Sekiro"),
            Pregunta("¿Mar más grande del mundo?", "Geografía", "Dificil", "Mediterráneo", "Rojo", "Arábigo", "Filipinas", "Filipinas"),
            Pregunta("¿Autor de El nacimiento de Venus?", "Arte", "Dificil", "Botticelli", "Miguel Ángel", "Leonardo", "Tiziano", "Botticelli"),
            Pregunta("¿Equipo con más Champions League?", "Deporte", "Dificil", "Barcelona", "Milan", "Liverpool", "Real Madrid", "Real Madrid"),
            Pregunta("¿Película muda más famosa de Chaplin?", "Cine", "Dificil", "El gran dictador", "Tiempos modernos", "La quimera del oro", "Candilejas", "La quimera del oro"),
            Pregunta("¿Tratado que puso fin a la I Guerra Mundial?", "Historia", "Dificil", "Versalles", "Tordesillas", "Utrecht", "París", "Versalles"),
            Pregunta("¿Empresa creadora de The Last of Us?", "Videojuegos", "Dificil", "Ubisoft", "Naughty Dog", "EA", "Valve", "Naughty Dog"),
            Pregunta("¿País con más volcanes activos?", "Geografía", "Dificil", "Japón", "Indonesia", "Islandia", "Chile", "Indonesia"),
            Pregunta("¿Estilo artístico de Monet?", "Arte", "Dificil", "Realismo", "Impresionismo", "Cubismo", "Surrealismo", "Impresionismo"),
            Pregunta("¿Deporte del Tour de Francia?", "Deporte", "Dificil", "Atletismo", "Ciclismo", "Motor", "Triatlón", "Ciclismo"),
            Pregunta("¿Primera consola de Sony?", "Videojuegos", "Dificil", "PS2", "PS1", "PSP", "PSVita", "PS1"),


            //Preguntes per cada categoria sense tenir en compte la dificultat
            // ================= HISTORIA (15) =================
            Pregunta("¿En qué año cayó Constantinopla?", "Historia", "Medio", "1453", "1492", "1415", "1517", "1453"),
            Pregunta("¿Quién fue el primer emperador romano?", "Historia", "Medio", "Julio César", "Augusto", "Nerón", "Trajano", "Augusto"),
            Pregunta("¿Civilización que construyó Machu Picchu?", "Historia", "Facil", "Azteca", "Inca", "Maya", "Olmeca", "Inca"),
            Pregunta("¿Revolución liderada por Lenin?", "Historia", "Medio", "Francesa", "Rusa", "China", "Cubana", "Rusa"),
            Pregunta("¿Año del descubrimiento de América?", "Historia", "Facil", "1492", "1500", "1488", "1519", "1492"),
            Pregunta("¿Rey español durante la Armada Invencible?", "Historia", "Dificil", "Carlos I", "Felipe II", "Fernando VII", "Isabel I", "Felipe II"),
            Pregunta("¿Tratado que puso fin a la I Guerra Mundial?", "Historia", "Medio", "Versalles", "Utrecht", "París", "Viena", "Versalles"),
            Pregunta("¿Imperio gobernado por Gengis Kan?", "Historia", "Facil", "Romano", "Mongol", "Otomano", "Persa", "Mongol"),
            Pregunta("¿Año de la Revolución Francesa?", "Historia", "Medio", "1789", "1776", "1804", "1812", "1789"),
            Pregunta("¿Faraón del Éxodo bíblico?", "Historia", "Dificil", "Ramsés II", "Tutankamón", "Akenatón", "Keops", "Ramsés II"),
            Pregunta("¿Guerra entre Atenas y Esparta?", "Historia", "Dificil", "Guerras Médicas", "Guerra del Peloponeso", "Guerra Púnica", "Guerra de Troya", "Guerra del Peloponeso"),
            Pregunta("¿Primer presidente de la democracia española?", "Historia", "Medio", "Suárez", "Calvo-Sotelo", "González", "Fraga", "Suárez"),
            Pregunta("¿Imperio que construyó el Coliseo?", "Historia", "Facil", "Griego", "Romano", "Bizantino", "Egipcio", "Romano"),
            Pregunta("¿Año de la caída del Muro de Berlín?", "Historia", "Medio", "1987", "1989", "1991", "1985", "1989"),
            Pregunta("¿Reina británica durante la II Guerra Mundial?", "Historia", "Dificil", "Victoria", "Isabel II", "Ana", "María", "Isabel II"),


            // ================= CINE (15) =================
            Pregunta("¿Director de Titanic?", "Cine", "Facil", "Spielberg", "Cameron", "Nolan", "Scott", "Cameron"),
            Pregunta("¿Actor que interpreta a Iron Man?", "Cine", "Facil", "Evans", "Downey Jr.", "Hemsworth", "Pratt", "Downey Jr."),
            Pregunta("¿Película ganadora del Óscar 1994?", "Cine", "Dificil", "Forrest Gump", "Pulp Fiction", "Shawshank", "Speed", "Forrest Gump"),
            Pregunta("¿Saga con hobbits?", "Cine", "Facil", "Harry Potter", "Star Wars", "El Señor de los Anillos", "Narnia", "El Señor de los Anillos"),
            Pregunta("¿Director de Origen (Inception)?", "Cine", "Medio", "Nolan", "Villeneuve", "Kubrick", "Fincher", "Nolan"),
            Pregunta("¿Película española de Amenábar?", "Cine", "Medio", "Tesis", "El Orfanato", "REC", "Celda 211", "Tesis"),
            Pregunta("¿Año de estreno de Star Wars IV?", "Cine", "Dificil", "1975", "1977", "1980", "1983", "1977"),
            Pregunta("¿Actor protagonista de Gladiator?", "Cine", "Facil", "Phoenix", "Crowe", "Bale", "Depp", "Crowe"),
            Pregunta("¿Película de ciencia ficción de Ridley Scott?", "Cine", "Medio", "Alien", "Matrix", "Avatar", "Terminator", "Alien"),
            Pregunta("¿Óscar honorífico a Chaplin?", "Cine", "Dificil", "1929", "1972", "1965", "1980", "1972"),
            Pregunta("¿Saga con dinosaurios?", "Cine", "Facil", "Jurassic Park", "Avatar", "Alien", "Godzilla", "Jurassic Park"),
            Pregunta("¿Director de Pulp Fiction?", "Cine", "Medio", "Tarantino", "Scorsese", "Coppola", "Kubrick", "Tarantino"),
            Pregunta("¿Película muda de Chaplin?", "Cine", "Medio", "Candilejas", "Tiempos modernos", "El gran dictador", "Monsieur Verdoux", "Tiempos modernos"),
            Pregunta("¿Actor de Taxi Driver?", "Cine", "Dificil", "Pacino", "De Niro", "Hoffman", "Pesci", "De Niro"),
            Pregunta("¿Primer largometraje de Pixar?", "Cine", "Dificil", "Bichos", "Toy Story", "Cars", "Up", "Toy Story"),


            // ================= GEOGRAFÍA (15) =================
            Pregunta("¿Capital de Japón?", "Geografía", "Facil", "Seúl", "Pekín", "Tokio", "Kioto", "Tokio"),
            Pregunta("¿Océano más grande?", "Geografía", "Facil", "Atlántico", "Índico", "Pacífico", "Ártico", "Pacífico"),
            Pregunta("¿País con más habitantes?", "Geografía", "Medio", "India", "China", "EE.UU.", "Rusia", "China"),
            Pregunta("¿Capital de Australia?", "Geografía", "Dificil", "Sídney", "Melbourne", "Canberra", "Perth", "Canberra"),
            Pregunta("¿Desierto más grande del mundo?", "Geografía", "Medio", "Gobi", "Sahara", "Kalahari", "Atacama", "Sahara"),
            Pregunta("¿Río que pasa por París?", "Geografía", "Facil", "Danubio", "Sena", "Rin", "Loira", "Sena"),
            Pregunta("¿País donde está el Kilimanjaro?", "Geografía", "Medio", "Kenia", "Tanzania", "Uganda", "Etiopía", "Tanzania"),
            Pregunta("¿Capital de Islandia?", "Geografía", "Dificil", "Oslo", "Helsinki", "Reikiavik", "Copenhague", "Reikiavik"),
            Pregunta("¿Mar que separa Europa y África?", "Geografía", "Facil", "Rojo", "Mediterráneo", "Negro", "Caspio", "Mediterráneo"),
            Pregunta("¿País atravesado por el Mekong?", "Geografía", "Dificil", "India", "Vietnam", "Japón", "Corea", "Vietnam"),
            Pregunta("¿Capital de Perú?", "Geografía", "Facil", "Quito", "Lima", "Bogotá", "La Paz", "Lima"),
            Pregunta("¿Montaña más alta del mundo?", "Geografía", "Medio", "K2", "Everest", "Kilimanjaro", "Aconcagua", "Everest"),
            Pregunta("¿País con forma de bota?", "Geografía", "Facil", "Grecia", "Italia", "Croacia", "Portugal", "Italia"),
            Pregunta("¿Capital de Marruecos?", "Geografía", "Medio", "Casablanca", "Rabat", "Fez", "Marrakech", "Rabat"),
            Pregunta("¿Archipiélago español en el Atlántico?", "Geografía", "Facil", "Baleares", "Canarias", "Azores", "Madeira", "Canarias"),


            // ================= ARTE (15) =================
            Pregunta("¿Autor de La última cena?", "Arte", "Facil", "Miguel Ángel", "Leonardo da Vinci", "Rafael", "Donatello", "Leonardo da Vinci"),
            Pregunta("¿Movimiento artístico de Picasso?", "Arte", "Medio", "Surrealismo", "Cubismo", "Impresionismo", "Barroco", "Cubismo"),
            Pregunta("¿Pintor de Las Meninas?", "Arte", "Facil", "Goya", "Velázquez", "Murillo", "El Greco", "Velázquez"),
            Pregunta("¿Autor de El Grito?", "Arte", "Medio", "Van Gogh", "Munch", "Monet", "Klimt", "Munch"),
            Pregunta("¿Estilo artístico del siglo XVII?", "Arte", "Medio", "Renacimiento", "Barroco", "Romanticismo", "Neoclásico", "Barroco"),
            Pregunta("¿Escultor del David?", "Arte", "Facil", "Donatello", "Miguel Ángel", "Bernini", "Rodin", "Miguel Ángel"),
            Pregunta("¿Autor de Guernica?", "Arte", "Facil", "Dalí", "Picasso", "Miró", "Goya", "Picasso"),
            Pregunta("¿Pintor impresionista francés?", "Arte", "Medio", "Monet", "Dalí", "Picasso", "Goya", "Monet"),
            Pregunta("¿Museo donde está la Gioconda?", "Arte", "Facil", "Prado", "Louvre", "Uffizi", "Tate", "Louvre"),
            Pregunta("¿Movimiento artístico de Dalí?", "Arte", "Medio", "Cubismo", "Surrealismo", "Realismo", "Barroco", "Surrealismo"),
            Pregunta("¿Arquitecto de la Sagrada Familia?", "Arte", "Facil", "Gaudí", "Calatrava", "Moneo", "Bofill", "Gaudí"),
            Pregunta("¿Autor de La noche estrellada?", "Arte", "Medio", "Van Gogh", "Monet", "Cézanne", "Renoir", "Van Gogh"),
            Pregunta("¿Periodo artístico de Leonardo?", "Arte", "Dificil", "Barroco", "Renacimiento", "Romanticismo", "Gótico", "Renacimiento"),
            Pregunta("¿Escultura griega famosa sin brazos?", "Arte", "Facil", "Venus de Milo", "Discóbolo", "Laocoonte", "Nike", "Venus de Milo"),
            Pregunta("¿Autor de El pensador?", "Arte", "Dificil", "Rodin", "Miguel Ángel", "Bernini", "Donatello", "Rodin"),


            // ================= DEPORTE (15) =================
            Pregunta("¿Deporte de Lionel Messi?", "Deporte", "Facil", "Tenis", "Fútbol", "Baloncesto", "Golf", "Fútbol"),
            Pregunta("¿Número de jugadores en fútbol?", "Deporte", "Facil", "9", "10", "11", "12", "11"),
            Pregunta("¿Deporte de Michael Jordan?", "Deporte", "Facil", "Béisbol", "Baloncesto", "Fútbol americano", "Tenis", "Baloncesto"),
            Pregunta("¿País sede Mundial 2010?", "Deporte", "Medio", "Brasil", "Sudáfrica", "Alemania", "Japón", "Sudáfrica"),
            Pregunta("¿Tenista con más Grand Slams?", "Deporte", "Dificil", "Federer", "Nadal", "Djokovic", "Sampras", "Djokovic"),
            Pregunta("¿Equipo con más Champions League?", "Deporte", "Facil", "Milan", "Liverpool", "Real Madrid", "Bayern", "Real Madrid"),
            Pregunta("¿Deporte del Tour de Francia?", "Deporte", "Facil", "Atletismo", "Ciclismo", "Motor", "Triatlón", "Ciclismo"),
            Pregunta("¿Selección campeona Mundial 2014?", "Deporte", "Medio", "Brasil", "Alemania", "Argentina", "España", "Alemania"),
            Pregunta("¿Deporte olímpico con florete?", "Deporte", "Medio", "Esgrima", "Judo", "Karate", "Taekwondo", "Esgrima"),
            Pregunta("¿Piloto con más títulos de F1?", "Deporte", "Dificil", "Vettel", "Schumacher", "Hamilton", "Alonso", "Hamilton"),
            Pregunta("¿Duración de un partido de baloncesto NBA?", "Deporte", "Dificil", "40 min", "48 min", "60 min", "90 min", "48 min"),
            Pregunta("¿País origen del judo?", "Deporte", "Facil", "China", "Japón", "Corea", "Tailandia", "Japón"),
            Pregunta("¿Deporte de Serena Williams?", "Deporte", "Facil", "Golf", "Tenis", "Atletismo", "Natación", "Tenis"),
            Pregunta("¿Competición anual de clubes europeos?", "Deporte", "Medio", "Europa League", "Champions League", "Supercopa", "Intertoto", "Champions League"),
            Pregunta("¿Deporte de los Juegos Olímpicos modernos?", "Deporte", "Dificil", "Pancracio", "Pentatlón moderno", "Críquet", "Polo", "Pentatlón moderno"),

            // ================= VIDEOJUEGOS (15) =================
            Pregunta("¿Mascota de Sega?", "Videojuegos", "Facil", "Mario", "Sonic", "Crash", "Link", "Sonic"),
            Pregunta("¿Empresa creadora de Mario?", "Videojuegos", "Facil", "Sony", "Nintendo", "Sega", "Microsoft", "Nintendo"),
            Pregunta("¿Saga de Link?", "Videojuegos", "Facil", "Zelda", "Metroid", "Final Fantasy", "Pokémon", "Zelda"),
            Pregunta("¿Juego battle royale popular?", "Videojuegos", "Facil", "FIFA", "Fortnite", "Minecraft", "GTA", "Fortnite"),
            Pregunta("¿Consola de Microsoft?", "Videojuegos", "Facil", "PlayStation", "Xbox", "Switch", "Wii", "Xbox"),
            Pregunta("¿Estudio creador de The Witcher?", "Videojuegos", "Medio", "Bethesda", "CD Projekt", "Ubisoft", "EA", "CD Projekt"),
            Pregunta("¿Juego de construcción con bloques?", "Videojuegos", "Facil", "Terraria", "Minecraft", "Roblox", "Valheim", "Minecraft"),
            Pregunta("¿Saga FPS de Activision?", "Videojuegos", "Medio", "Battlefield", "Call of Duty", "Halo", "Doom", "Call of Duty"),
            Pregunta("¿Protagonista de God of War?", "Videojuegos", "Medio", "Kratos", "Ares", "Zeus", "Hades", "Kratos"),
            Pregunta("¿Consola híbrida de Nintendo?", "Videojuegos", "Facil", "Wii", "Switch", "DS", "GameCube", "Switch"),
            Pregunta("¿Juego soulslike famoso?", "Videojuegos", "Dificil", "Skyrim", "Dark Souls", "Dragon Age", "Diablo", "Dark Souls"),
            Pregunta("¿Empresa creadora de PlayStation?", "Videojuegos", "Facil", "Microsoft", "Sony", "Nintendo", "Sega", "Sony"),
            Pregunta("¿Saga de Geralt de Rivia?", "Videojuegos", "Medio", "Dragon Age", "The Witcher", "Skyrim", "Fable", "The Witcher"),
            Pregunta("¿Primer Pokémon?", "Videojuegos", "Facil", "Pikachu", "Bulbasaur", "Charmander", "Squirtle", "Bulbasaur"),
            Pregunta("¿Año de lanzamiento de PS1?", "Videojuegos", "Dificil", "1992", "1994", "1996", "1998", "1994"),

            // ================= CIENCIA (15) =================
            Pregunta("¿Planeta más cercano al Sol?", "Ciencia", "Facil", "Venus", "Marte", "Mercurio", "Júpiter", "Mercurio"),
            Pregunta("¿Gas que respiramos principalmente?", "Ciencia", "Facil", "Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno", "Nitrógeno"),
            Pregunta("¿Unidad básica de la vida?", "Ciencia", "Facil", "Átomo", "Molécula", "Célula", "Tejido", "Célula"),
            Pregunta("¿Científico de la teoría de la relatividad?", "Ciencia", "Facil", "Newton", "Einstein", "Galileo", "Tesla", "Einstein"),
            Pregunta("¿Estado del agua a 100°C?", "Ciencia", "Facil", "Sólido", "Líquido", "Gaseoso", "Plasma", "Gaseoso"),
            Pregunta("¿Fórmula química del agua?", "Ciencia", "Facil", "CO2", "H2O", "O2", "NaCl", "H2O"),
            Pregunta("¿Partícula con carga negativa?", "Ciencia", "Medio", "Protón", "Neutrón", "Electrón", "Ión", "Electrón"),
            Pregunta("¿Órgano que bombea la sangre?", "Ciencia", "Facil", "Pulmón", "Cerebro", "Corazón", "Hígado", "Corazón"),
            Pregunta("¿Capa de la atmósfera con ozono?", "Ciencia", "Medio", "Troposfera", "Estratosfera", "Mesosfera", "Ionosfera", "Estratosfera"),
            Pregunta("¿Velocidad de la luz aproximada?", "Ciencia", "Dificil", "300 km/s", "3.000 km/s", "300.000 km/s", "3.000.000 km/s", "300.000 km/s"),
            Pregunta("¿Hueso más largo del cuerpo humano?", "Ciencia", "Medio", "Húmero", "Fémur", "Tibia", "Radio", "Fémur"),
            Pregunta("¿Nombre completo del ADN?", "Ciencia", "Dificil", "Ácido ribonucleico", "Ácido desoxirribonucleico", "Ácido nucleico", "Desoxirribosa", "Ácido desoxirribonucleico"),
            Pregunta("¿Elemento químico con símbolo Fe?", "Ciencia", "Facil", "Flúor", "Hierro", "Fósforo", "Francio", "Hierro"),
            Pregunta("¿Científico que formuló las leyes del movimiento?", "Ciencia", "Medio", "Galileo", "Newton", "Einstein", "Kepler", "Newton"),
            Pregunta("¿Rama de la ciencia que estudia los seres vivos?", "Ciencia", "Facil", "Física", "Química", "Biología", "Geología", "Biología")

        )
    }

    fun obtenerPreguntasPorDificultad(dificultad: String): List<Pregunta> {
        return obtenerPreguntas().filter {
            it.dificultad == dificultad
        }
    }

    fun obtenerPreguntasPorCategoria(categoria: String): List<Pregunta> {
        return obtenerPreguntas().filter {
            it.categoria == categoria
        }
    }
}