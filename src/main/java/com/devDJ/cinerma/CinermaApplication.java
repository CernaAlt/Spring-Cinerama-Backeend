package com.devDJ.cinerma;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.devDJ.cinerma.Entities.Cinemas;
import com.devDJ.cinerma.Entities.Cities;
import com.devDJ.cinerma.Entities.Movie;
import com.devDJ.cinerma.Entities.Rooms;
import com.devDJ.cinerma.Entities.Schedule;
import com.devDJ.cinerma.Repository.ICinemasRepository;
import com.devDJ.cinerma.Repository.ICitiesRepository;
import com.devDJ.cinerma.Repository.IMovieRepository;
import com.devDJ.cinerma.Repository.IRoomsRepository;
import com.devDJ.cinerma.Repository.IScheduleRepository;

@SpringBootApplication
public class CinermaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinermaApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(
            ICitiesRepository citiesRepository,
            ICinemasRepository cinemasRepository,
            IRoomsRepository roomRepository,
            IMovieRepository movieRepository,
            IScheduleRepository scheduleRepository) {
        return args -> {
            // Crear ciudades, cines y salas
            Cities city1 = new Cities("Cajamarca");
            Cities city2 = new Cities("lima");
            Cities city3 = new Cities("Arequipa");
            Cities city4 = new Cities("Chiclayo");
            Cities city5 = new Cities("Cusco");
            Cities city6 = new Cities("Huancayo");
            Cities city7 = new Cities("juliaca");
            Cities city8 = new Cities("Piura");
            Cities city9 = new Cities("Puno");
            Cities city10 = new Cities("Tacna");
            Cities city11 = new Cities("trujillo");
            citiesRepository.save(city1);
            citiesRepository.save(city2);
            citiesRepository.save(city3);
            citiesRepository.save(city4);
            citiesRepository.save(city5);
            citiesRepository.save(city6);
            citiesRepository.save(city7);
            citiesRepository.save(city8);
            citiesRepository.save(city9);
            citiesRepository.save(city10);
            citiesRepository.save(city11);

            Cinemas cine1 = new Cinemas("CP Piura", "des01", "Jr. Huancavelica 537 - Piura", city8);
            Cinemas cine2 = new Cinemas("CP Alcazar", "des01", "Jr. Huancavelica 537 - Piura", city2);
            Cinemas cine3 = new Cinemas("CP Piura", "des01", "Jr. Huancavelica 537 - Piura", city2);
            Cinemas cine4 = new Cinemas("CP Brasil", "des01", "Jr. Huancavelica 537 - Piura", city2);
            Cinemas cine5 = new Cinemas("CP Caminos del Inca", "des01", "Jr. Huancavelica 537 - Piura", city2);
            Cinemas cine6 = new Cinemas("CP Arequipa Mall Plaza", "des01", "Jr. Huancavelica 537 - Piura", city3);
            Cinemas cine7 = new Cinemas("CP Arequipa Paseo Central", "des01", "Jr. Huancavelica 537 - Piura", city3);
            Cinemas cine8 = new Cinemas("CP Chiclayo Mall Aventura", "des01", "Jr. Huancavelica 537 - Piura", city4);
            Cinemas cine9 = new Cinemas("CP Cusco", "des01", "Jr. Huancavelica 537 - Piura", city5);
            Cinemas cine10 = new Cinemas("CP Cusco", "des01", "Jr. Huancavelica 537 - Piura", city5);
            Cinemas cine11 = new Cinemas("CP Trujillo Centro", "des01", "Jr. Huancavelica 537 - Piura", city6);
            Cinemas cine12 = new Cinemas("CP Trujillo Real Plaza", "des01", "Jr. Huancavelica 537 - Piura", city6);
            cinemasRepository.save(cine1);
            cinemasRepository.save(cine2);
            cinemasRepository.save(cine3);
            cinemasRepository.save(cine4);
            cinemasRepository.save(cine5);
            cinemasRepository.save(cine6);
            cinemasRepository.save(cine7);
            cinemasRepository.save(cine8);
            cinemasRepository.save(cine9);
            cinemasRepository.save(cine10);
            cinemasRepository.save(cine11);
            cinemasRepository.save(cine12);

            Rooms room1 = new Rooms("Sala 3", 5L, 5L, cine1);
            Rooms room2 = new Rooms("Sala 3", 5L, 5L, cine1);
            Rooms room3 = new Rooms("Sala 3", 5L, 5L, cine3);
            Rooms room4 = new Rooms("Sala 3", 5L, 5L, cine4);
            Rooms room5 = new Rooms("Sala 3", 5L, 5L, cine5);
            Rooms room6 = new Rooms("Sala 3", 5L, 5L, cine6);
            Rooms room7 = new Rooms("Sala 3", 5L, 5L, cine7);
            Rooms room8 = new Rooms("Sala 3", 5L, 5L, cine8);
            Rooms room9 = new Rooms("Sala 3", 5L, 5L, cine9);
            Rooms room10 = new Rooms("Sala 3", 5L, 5L, cine10);

            roomRepository.save(room1);
            roomRepository.save(room2);
            roomRepository.save(room3);
            roomRepository.save(room4);
            roomRepository.save(room5);
            roomRepository.save(room6);
            roomRepository.save(room7);
            roomRepository.save(room8);
            roomRepository.save(room9);
            roomRepository.save(room10);

            // Crear una película
            Movie movie1 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);

            Movie movie2 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);
            Movie movie3 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);
            Movie movie4 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);
            Movie movie5 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);
            Movie movie6 = new Movie(null, "Codigo: Traje Rojo", "Sinopsis de ejemplo", "Director Ejemplo", "Género",
                    "120 min", 13, (byte) 1, Arrays.asList("Estreno"), Arrays.asList("Español", "Inglés"),
                    Arrays.asList("3D", "2D"), Arrays.asList("Distribuidor"), "imagen_card.jpg", "imagen_detalles.jpg",
                    "https://trailer.com", null);

            movieRepository.save(movie1);
            movieRepository.save(movie2);
            movieRepository.save(movie3);
            movieRepository.save(movie4);
            movieRepository.save(movie5);
            movieRepository.save(movie6);

            // Crear horarios de ejemplo
            Schedule schedule1 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 14, 30),
                    LocalDateTime.of(2024, 11, 15, 16, 30), room1, movie1);
            Schedule schedule2 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 18, 0),
                    LocalDateTime.of(2024, 11, 15, 20, 0), room1, movie1);
            // Crear horarios de ejemplo
            Schedule schedule3 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 14, 30),
                    LocalDateTime.of(2024, 11, 15, 16, 30), room1, movie1);
            Schedule schedule4 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 18, 0),
                    LocalDateTime.of(2024, 11, 15, 20, 0), room1, movie1);
            // Crear horarios de ejemplo
            Schedule schedule5 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 14, 30),
                    LocalDateTime.of(2024, 11, 15, 16, 30), room1, movie1);
            Schedule schedule6 = new Schedule(null, LocalDateTime.of(2024, 11, 15, 18, 0),
                    LocalDateTime.of(2024, 11, 15, 20, 0), room1, movie1);

            scheduleRepository.saveAll(Arrays.asList(schedule1, schedule2));
            scheduleRepository.saveAll(Arrays.asList(schedule3, schedule4));
            scheduleRepository.saveAll(Arrays.asList(schedule5, schedule6));

            System.out.println("Datos de prueba cargados exitosamente.");
        };
    }

}
