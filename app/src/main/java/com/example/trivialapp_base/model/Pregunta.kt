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
            Pregunta("¿Primera consola de Sony?", "Videojuegos", "Dificil", "PS2", "PS1", "PSP", "PSVita", "PS1")

        )
    }

    fun obtenerPreguntasPorDificultad(dificultad: String): List<Pregunta> {
        return obtenerPreguntas().filter {
            it.dificultad == dificultad
        }
    }
}