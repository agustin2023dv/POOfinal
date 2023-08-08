
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // GRUPO A

        ArrayList<Equipo> equiposGrupoA = new ArrayList<>();

        String[] grupoA = {"Brasil", "Argentina", "Uruguay", "Colombia"};
        for (String nombre : grupoA) {
            equiposGrupoA.add(new Equipo(nombre));
        }

        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoA = new ArrayList<>();

        for (int i = 0; i < equiposGrupoA.size(); i++) {
            for (int j = i + 1; j < equiposGrupoA.size(); j++) {
                Equipo equipoLocal = equiposGrupoA.get(i);
                Equipo equipoVisitante = equiposGrupoA.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoA.add(partido);
            }
        }



        // GRUPO B

        ArrayList<Equipo> equiposGrupoB = new ArrayList<>();

        String[] grupoB = {"Chile", "Alemania", "Francia", "Italia"};
        for (String nombre : grupoB) {
            equiposGrupoB.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoB = new ArrayList<>();

        for (int i = 0; i < equiposGrupoB.size(); i++) {
            for (int j = i + 1; j < equiposGrupoB.size(); j++) {
                Equipo equipoLocal = equiposGrupoB.get(i);
                Equipo equipoVisitante = equiposGrupoB.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoB.add(partido);
            }
        }

// Grupo C

        ArrayList<Equipo> equiposGrupoC = new ArrayList<>();

        String[] grupoC = {"España", "Canada", "Grecia", "Japon"};
        for (String nombre : grupoC) {
            equiposGrupoC.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoC = new ArrayList<>();

        for (int i = 0; i < equiposGrupoC.size(); i++) {
            for (int j = i + 1; j < equiposGrupoC.size(); j++) {
                Equipo equipoLocal = equiposGrupoC.get(i);
                Equipo equipoVisitante = equiposGrupoC.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoC.add(partido);
            }
        }

        // Grupo D

        ArrayList<Equipo> equiposGrupoD = new ArrayList<>();

        String[] grupoD = {"Rusia", "Inglaterra", "Suecia", "Suiza"};
        for (String nombre : grupoD) {
            equiposGrupoD.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoD = new ArrayList<>();

        for (int i = 0; i < equiposGrupoD.size(); i++) {
            for (int j = i + 1; j < equiposGrupoD.size(); j++) {
                Equipo equipoLocal = equiposGrupoD.get(i);
                Equipo equipoVisitante = equiposGrupoD.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoD.add(partido);
            }
        }



        // Grupo E

        ArrayList<Equipo> equiposGrupoE = new ArrayList<>();

        String[] grupoE = {"Mexico", "Portugal", "Australia", "China"};
        for (String nombre : grupoE) {
            equiposGrupoE.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoE = new ArrayList<>();

        for (int i = 0; i < equiposGrupoE.size(); i++) {
            for (int j = i + 1; j < equiposGrupoE.size(); j++) {
                Equipo equipoLocal = equiposGrupoE.get(i);
                Equipo equipoVisitante = equiposGrupoE.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoE.add(partido);
            }
        }


        // Grupo F

        ArrayList<Equipo> equiposGrupoF = new ArrayList<>();

        String[] grupoF = {"Arabia", "Sudafrica", "Austria", "Polonia"};
        for (String nombre : grupoF) {
            equiposGrupoF.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoF = new ArrayList<>();

        for (int i = 0; i < equiposGrupoF.size(); i++) {
            for (int j = i + 1; j < equiposGrupoF.size(); j++) {
                Equipo equipoLocal = equiposGrupoF.get(i);
                Equipo equipoVisitante = equiposGrupoF.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoF.add(partido);
            }
        }


        // Grupo G

        ArrayList<Equipo> equiposGrupoG = new ArrayList<>();

        String[] grupoG = {"Venezuela", "Paraguay", "Cuba", "Vietnam"};
        for (String nombre : grupoG) {
            equiposGrupoG.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoG = new ArrayList<>();

        for (int i = 0; i < equiposGrupoG.size(); i++) {
            for (int j = i + 1; j < equiposGrupoG.size(); j++) {
                Equipo equipoLocal = equiposGrupoG.get(i);
                Equipo equipoVisitante = equiposGrupoG.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoG.add(partido);
            }
        }

// Grupo H

        ArrayList<Equipo> equiposGrupoH = new ArrayList<>();

        String[] grupoH = {"Holanda", "Finlandia", "Noruega", "Costa Rica"};
        for (String nombre : grupoH) {
            equiposGrupoH.add(new Equipo(nombre));
        }
        // Crear los objetos Partido para cada combinación de equipos
        ArrayList<Partido> partidosGrupoH = new ArrayList<>();

        for (int i = 0; i < equiposGrupoH.size(); i++) {
            for (int j = i + 1; j < equiposGrupoH.size(); j++) {
                Equipo equipoLocal = equiposGrupoH.get(i);
                Equipo equipoVisitante = equiposGrupoH.get(j);
                int golesLocal = new Random().nextInt(8); // Genera un número aleatorio entre 0 y 7
                int golesVisitante = new Random().nextInt(8);
                Resultado resultado = new Resultado(golesLocal,golesVisitante);
                Partido partido = new Partido(new Date(2023, 10, 10), equipoLocal, equipoVisitante);
                partido.setResultado(resultado);
                partidosGrupoH.add(partido);
            }
        }



// Creacion

Grupo grupoAA = new Grupo("","");
grupoAA.setPartidos(partidosGrupoA);
        // Creacion de grupo B

        Grupo grupoBB = new Grupo("Partidos grupo B Torneo Copa del mundo", "Grupo B");
grupoBB.setPartidos(partidosGrupoB);


        // Creacion de grupo C

        Grupo grupoCC = new Grupo("Partidos grupo C Torneo Copa del mundo", "Grupo C");
        grupoCC.setPartidos(partidosGrupoC);


// Creacion de grupo D

        Grupo grupoDD = new Grupo("Partidos grupo D Toreno Copa del mundo", "Grupo D");
      grupoDD.setPartidos(partidosGrupoD);

        // Creacion de grupo E
        Grupo grupoEE = new Grupo("Partidos grupo E Torneo Copa del Mundo", "Grupo E");
     grupoEE.setPartidos(partidosGrupoE);

        // Creacion de grupo F

        Grupo grupoFF = new Grupo("Partidos grupo F Torneo Copa del Mundo", "Grupo F");
        grupoFF.setPartidos(partidosGrupoF);

        // Creacion de grupo G

        Grupo grupoGG = new Grupo("Partidos grupo G Torneo Copa del Mundo", "Grupo G");
       grupoGG.setPartidos(partidosGrupoG);
        // Creacion de grupo H

        Grupo grupoHH = new Grupo("Partidos grupo H Torneo Copa del Mundo", "Grupo H");
        grupoHH.setPartidos(partidosGrupoH);

        // Llaves

        // Se cargarn los clasificados a 8vos

        ArrayList<Equipo> clasificadosA8vos = new ArrayList<>(16);

        Grupo[] grupos = {grupoAA, grupoBB, grupoCC, grupoDD, grupoEE, grupoFF, grupoGG, grupoHH};

        for (Grupo grupo : grupos) {
            ArrayList<Equipo> equiposClasificados = grupo.getEquiposQueAvanzan();
            clasificadosA8vos.add(equiposClasificados.get(0));
            clasificadosA8vos.add(equiposClasificados.get(1));
        }

        System.out.print("Lista clasificados a 8vos de final\n" + "--------------------------\n");
        for (int i = 0; i < clasificadosA8vos.size(); i++) {

            System.out.print(clasificadosA8vos.get(i).getNombre() + "\n");
        }
        System.out.print("--------------------------\n");

        // Llave de octavos

        Llave octavos = new Llave("Octavos de final juegan 16 equipos", "Octavos", 8);

        // Partidos de 8vos

        int localOctavos = 0;
        int visitanteOctavos = 8;


        do {
            int golesLocal = new Random().nextInt(8);
            int golesVisitante = new Random().nextInt(8);

            Partido partido = new Partido(new Date(2023, 10, 24),
                    clasificadosA8vos.get(localOctavos), clasificadosA8vos.get(visitanteOctavos),
                    new Resultado(golesLocal, golesVisitante));

            localOctavos++;
            visitanteOctavos++;

            octavos.addPartido(partido);

        } while (octavos.getPartidos().size() < octavos.getCantEquiposClasifican());


        // Cruces 8vos de final
        System.out.print("\n-----------------------------------------\nOCTAVOS DE FINAL" +
                "\n----------------------\n");
        octavos.mostrarPartidos();

// Cuartos de final
        ArrayList<Equipo> clasificadosCuartos = new ArrayList<>();

        Llave cuartos = new Llave("Cuartos de final juegan 8 equipos", "Cuartos", 4);
        cuartos.setCantidad_partidos(8);

// Partidos 4vos de final


        ArrayList<Partido> partidos4tos = new ArrayList<>(4);

        int localCuartos = 0;
        int visitanteCuartos = 4;

        do {
            int golesLocal = new Random().nextInt(8);
            int golesVisitante = new Random().nextInt(8);

            Partido partido = new Partido(new Date(2023, 10, 26),
                    octavos.getEquiposQueAvanzan().get(localCuartos), octavos.getEquiposQueAvanzan().get(visitanteCuartos),
                    new Resultado(golesLocal, golesVisitante));

            localCuartos++;
            visitanteCuartos++;

            partidos4tos.add(partido);

        } while (visitanteCuartos < cuartos.getCantidad_partidos() && cuartos.getPartidos().size() < cuartos.getCantEquiposClasifican());

        cuartos.setPartidos(partidos4tos);

        // Cruces 4tos de final

        System.out.print("\n-----------------------------------------\nCUARTOS DE FINAL" +
                "\n----------------------\n");

        cuartos.mostrarPartidos();



// SEMIFINALES

        Llave semis= new Llave("Semifinales juegan 4 equipos","Semis",2);

        ArrayList<Partido> partidosSemis = new ArrayList<>();

        int localSemis = 0;
        int visitanteSemis = 2;

        do {
            int golesLocal = new Random().nextInt(8);
            int golesVisitante = new Random().nextInt(8);

            Partido partido = new Partido(new Date(2023, 10, 26),
                    cuartos.getEquiposQueAvanzan().get(localSemis), cuartos.getEquiposQueAvanzan().get(visitanteSemis),
                    new Resultado(golesLocal, golesVisitante));
            localSemis++;
            visitanteSemis++;

            partidosSemis.add(partido);

        } while (localSemis<semis.getCantEquiposClasifican());

        semis.setPartidos(partidosSemis);


        System.out.print("\n-----------------------------------------\nSEMIFINALES" +
                "\n----------------------\n");


semis.mostrarPartidos();
        // Partido final


        Llave partido_final = new Llave("Final, juegan 2 equipos", "FINAL",1);


        int golesLocalFinal = new Random().nextInt(8);
        int golesVisitanteFinal = new Random().nextInt(8);

        Partido partidoFinal = new Partido((new Date(2023, 10, 30)),
        semis.getEquiposQueAvanzan().get(0), semis.getEquiposQueAvanzan().get(1),
            new Resultado(golesLocalFinal, golesVisitanteFinal));

        partido_final.addPartido(partidoFinal);

        System.out.print("\n-----------------------------------------\nFINAL" +
                "\n----------------------\n");

        partido_final.mostrarPartidos();

        System.out.print("\nCAMPEON: "+partido_final.getEquiposQueAvanzan().get(0).getNombre());




}}