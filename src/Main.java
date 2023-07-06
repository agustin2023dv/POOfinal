
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        // CREACION DE EQUIPOS (AGRUPADOS DE A 4 POR GRUPO)

        Equipo brasil = new Equipo("Brasil");
        Equipo argentina = new Equipo("Argentina");
        Equipo uruguay = new Equipo("Uruguay");
        Equipo colombia = new Equipo("Colombia");


        Equipo chile = new Equipo("Chile");
        Equipo alemania = new Equipo("Alemania");
        Equipo francia = new Equipo("Francia");
        Equipo italia = new Equipo("Italia");


        Equipo espania = new Equipo("España");
        Equipo canada = new Equipo("Canada");
        Equipo grecia = new Equipo("Grecia");
        Equipo japon = new Equipo("Japon");


        Equipo rusia = new Equipo("Rusia");
        Equipo inglaterra = new Equipo("Inglaterra");
        Equipo suecia = new Equipo("Suecia");
        Equipo suiza = new Equipo("Suiza");


        Equipo mexico = new Equipo("Mexico");
        Equipo portugal = new Equipo("Portugal");
        Equipo australia = new Equipo("Australia");
        Equipo china = new Equipo("China");


        Equipo arabia = new Equipo("Arabia");
        Equipo sudafrica = new Equipo("Sudafrica");
        Equipo polonia = new Equipo("Polonia");
        Equipo austria = new Equipo("Austria");


        Equipo venezuela = new Equipo("Venezuela");
        Equipo paraguay = new Equipo("Paraguay");
        Equipo cuba = new Equipo("Cuba");
        Equipo vietnam = new Equipo("Vietnam");

        Equipo holanda = new Equipo("Holanda");
        Equipo finlandia = new Equipo("Finlandia");
        Equipo noruega = new Equipo("Noruega");
        Equipo costa_rica = new Equipo("Costa Rica");

        // CREACION DE PARTIDOS


//GRUPO A
        Partido brasil_argentina = new Partido( new Date(2023-10-10),brasil,argentina);
        Partido brasil_uruguay= new Partido(new Date(2023-10-11),brasil,uruguay);
        Partido colombia_brasil= new Partido(new Date(2023-10-12), colombia, brasil);
        Partido colombia_argentina = new Partido(new Date(2023-10-13), colombia,argentina);
        Partido uruguay_colombia= new Partido(new Date(2023-10-15), uruguay,colombia);
        Partido uruguay_argentina= new Partido(new Date(2023-10-19),uruguay,argentina);

//GRUPO B
        Partido chile_italia = new Partido(new Date(2023-10-13), chile,italia, new Resultado(0,5));
        Partido chile_alemania = new Partido(new Date(2023-10-13), chile,alemania,new Resultado(0,3));
        Partido chile_francia = new Partido(new Date(2023-10-13), chile,francia,new Resultado(2,2));
        Partido alemania_italia=  new Partido(new Date(2023-10-13), alemania,italia,new Resultado(10,2));
        Partido alemania_francia = new Partido(new Date(2023-10-13), alemania,francia, new Resultado(2,1));
        Partido italia_francia = new Partido(new Date(2023-10-13), italia,francia, new Resultado(3,1));


        //GRUPO C
        Partido espania_canada = new Partido(new Date(2023, 10, 13), espania, canada, new Resultado(2,2));
        Partido espania_grecia = new Partido(new Date(2023, 10, 14), espania, grecia, new Resultado(3,2));
        Partido espania_japon = new Partido(new Date(2023, 10, 15), espania, japon, new Resultado(3,6));
        Partido canada_grecia = new Partido(new Date(2023, 10, 16), canada, grecia, new Resultado(0,0));
        Partido canada_japon = new Partido(new Date(2023, 10, 17), canada, japon, new Resultado(1,1));
        Partido grecia_japon = new Partido(new Date(2023, 10, 18), grecia, japon, new Resultado(2,5));


        // GRUPO D

        Partido rusia_inglaterra = new Partido(new Date(2023, 10, 13), rusia, inglaterra, new Resultado(0, 0));

        Partido rusia_suecia = new Partido(new Date(2023, 10, 13), rusia, suecia, new Resultado(2, 0));
        Partido rusia_suiza = new Partido(new Date(2023, 10, 13), rusia, suiza, new Resultado(0, 3));
        Partido inglaterra_suecia = new Partido(new Date(2023, 10, 13), inglaterra, suecia, new Resultado(2, 1));
        Partido inglaterra_suiza = new Partido(new Date(2023, 10, 13), inglaterra, suiza, new Resultado(2, 5));
        Partido suecia_suiza = new Partido(new Date(2023, 10, 13), suecia, suiza, new Resultado(3, 0));


        // GRUPO E

        Partido mexico_portugal = new Partido(new Date(2023, 10, 13), mexico, portugal, new Resultado(0, 0));
        Partido mexico_australia = new Partido(new Date(2023, 10, 13), mexico, australia, new Resultado(2, 0));
        Partido mexico_china = new Partido(new Date(2023, 10, 13), mexico, china, new Resultado(1, 3));
        Partido portugal_australia = new Partido(new Date(2023, 10, 13), portugal, australia, new Resultado(4, 4));
        Partido portugal_china = new Partido(new Date(2023, 10, 13), portugal, china, new Resultado(2, 3));
        Partido australia_china = new Partido(new Date(2023, 10, 13), australia, china, new Resultado(1, 0));


        // GRUPO F

        Partido arabia_sudafrica = new Partido(new Date(2023, 10, 13), arabia, sudafrica, new Resultado(1, 3));
        Partido arabia_polonia = new Partido(new Date(2023, 10, 13), arabia, polonia, new Resultado(2, 4));
        Partido arabia_austria = new Partido(new Date(2023, 10, 13), arabia, austria, new Resultado(2, 1));
        Partido sudafrica_polonia = new Partido(new Date(2023, 10, 13), sudafrica, polonia, new Resultado(3, 2));
        Partido sudafrica_austria = new Partido(new Date(2023, 10, 13), sudafrica, austria, new Resultado(0, 1));
        Partido polonia_austria = new Partido(new Date(2023, 10, 13), polonia, austria, new Resultado(0, 3));



        // GRUPO G

        Partido venezuela_paraguay = new Partido(new Date(2023, 10, 13), venezuela, paraguay, new Resultado(1, 0));
        Partido venezuela_cuba = new Partido(new Date(2023, 10, 13), venezuela, cuba, new Resultado(0, 2));
        Partido venezuela_vietnam = new Partido(new Date(2023, 10, 13), venezuela, vietnam, new Resultado(4, 3));
        Partido paraguay_cuba = new Partido(new Date(2023, 10, 13), paraguay, cuba, new Resultado(2, 2));
        Partido paraguay_vietnam = new Partido(new Date(2023, 10, 13), paraguay, vietnam, new Resultado(2, 2));
        Partido cuba_vietnam = new Partido(new Date(2023, 10, 13), cuba, vietnam, new Resultado(0, 1));

        // GRUPO H

        Partido holanda_finlandia = new Partido(new Date(2023, 10, 13), holanda, finlandia, new Resultado(1, 0));
        Partido holanda_noruega = new Partido(new Date(2023, 10, 13), holanda, noruega, new Resultado(3, 0));
        Partido holanda_costa_rica = new Partido(new Date(2023, 10, 13), holanda, costa_rica, new Resultado(3, 2));
        Partido finlandia_noruega = new Partido(new Date(2023, 10, 13), finlandia, noruega, new Resultado(4, 4));
        Partido finlandia_costa_rica = new Partido(new Date(2023, 10, 13), finlandia, costa_rica, new Resultado(4, 3));
        Partido noruega_costa_rica = new Partido(new Date(2023, 10, 13), noruega, costa_rica, new Resultado(5, 4));


        // CREACION DE RESULTADOS FASE DE GRUPO A

        Resultado p1 = new Resultado(2,2);
        Resultado p2 = new Resultado(3,1);
        Resultado p3 = new Resultado(0,0);
        Resultado p4 = new Resultado(0,3);
        Resultado p5= new Resultado(2,2);
        Resultado p6 = new Resultado(3,0);

        // Se agregan rdos a los partidos del grupo A

        brasil_argentina.setResultado(p1);
        brasil_uruguay.setResultado(p2);
        colombia_brasil.setResultado(p3);
        colombia_argentina.setResultado(p4);
        uruguay_colombia.setResultado(p5);
        uruguay_argentina.setResultado(p6);


// Creacion de grupo A + agregacion de partidos
        Grupo grupoA = new Grupo("Partidos grupo A Torneo Copa del mundo","Grupo A");

        grupoA.addPartido(brasil_argentina);
        grupoA.addPartido(brasil_uruguay);
        grupoA.addPartido(colombia_brasil);
        grupoA.addPartido(colombia_argentina);
        grupoA.addPartido(uruguay_colombia);
        grupoA.addPartido(uruguay_argentina);



        // Creacion de grupo B

        Grupo grupoB = new Grupo("Partidos grupo B Torneo Copa del mundo", "Grupo B");
        grupoB.addPartido(alemania_francia);
        grupoB.addPartido(alemania_italia);
        grupoB.addPartido(chile_francia);
        grupoB.addPartido(chile_alemania);
        grupoB.addPartido(chile_italia);
        grupoB.addPartido(italia_francia);


        // Creacion de grupo C

        Grupo grupoC = new Grupo("Partidos grupo C Torneo Copa del mundo", "Grupo C");
grupoC.addPartido(espania_canada);
grupoC.addPartido(espania_grecia);
grupoC.addPartido(espania_japon);
grupoC.addPartido(canada_japon);
grupoC.addPartido(canada_grecia);
grupoC.addPartido(grecia_japon);


// Creacion de grupo D

Grupo grupoD = new Grupo("Partidos grupo D Toreno Copa del mundo", "Grupo D");
        grupoD.addPartido(rusia_inglaterra);
        grupoD.addPartido(rusia_suecia);
        grupoD.addPartido(rusia_suiza);
        grupoD.addPartido(inglaterra_suecia);
        grupoD.addPartido(inglaterra_suiza);
        grupoD.addPartido(suecia_suiza);

        // Creacion de grupo E
Grupo grupoE = new Grupo("Partidos grupo E Torneo Copa del Mundo","Grupo E");
        grupoE.addPartido(mexico_portugal);
        grupoE.addPartido(mexico_australia);
        grupoE.addPartido(mexico_china);
        grupoE.addPartido(portugal_australia);
        grupoE.addPartido(portugal_china);
        grupoE.addPartido(australia_china);

        // Creacion de grupo F

        Grupo grupoF = new Grupo("Partidos grupo F Torneo Copa del Mundo","Grupo F");
        grupoF.addPartido(arabia_sudafrica);
        grupoF.addPartido(arabia_polonia);
        grupoF.addPartido(arabia_austria);
        grupoF.addPartido(sudafrica_polonia);
        grupoF.addPartido(sudafrica_austria);
        grupoF.addPartido(polonia_austria);

        // Creacion de grupo G

       Grupo grupoG = new Grupo("Partidos grupo G Torneo Copa del Mundo", "Grupo G");
        grupoG.addPartido(venezuela_paraguay);
        grupoG.addPartido(venezuela_cuba);
        grupoG.addPartido(venezuela_vietnam);
        grupoG.addPartido(paraguay_cuba);
        grupoG.addPartido(paraguay_vietnam);
        grupoG.addPartido(cuba_vietnam);

        // Creacion de grupo H

        Grupo grupoH = new Grupo("Partidos grupo H Torneo Copa del Mundo","Grupo H");
        grupoH.addPartido(holanda_finlandia);
        grupoH.addPartido(holanda_noruega);
        grupoH.addPartido(holanda_costa_rica);
        grupoH.addPartido(finlandia_noruega);
        grupoH.addPartido(finlandia_costa_rica);
        grupoH.addPartido(noruega_costa_rica);



        // Llaves

        // Se cargarn los clasificados a 8vos

        ArrayList<Equipo> clasificadosA8vos = new ArrayList<>(16);

        Grupo[] grupos = {grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH};

        for (Grupo grupo : grupos) {
            ArrayList<Equipo> equiposClasificados = grupo.getEquiposQueAvanzan();
            clasificadosA8vos.add(equiposClasificados.get(0));
            clasificadosA8vos.add(equiposClasificados.get(1));
        }

        System.out.print("Lista clasificados a 8vos de final\n"+ "--------------------------\n");
        for(int i=0; i <clasificadosA8vos.size();i++){

            System.out.print(clasificadosA8vos.get(i).getNombre()+"\n");}
        System.out.print("--------------------------\n");

        // Llave de octavos

        Llave octavos = new Llave("Octavos de final juegan 16 equipos","Octavos",8);

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

        for(int i = 0; i<octavos.getPartidos().size(); i++) {

            System.out.print("LOCAL "+octavos.getPartidos().get(i).getLocal().getNombre()+" :"
                    +octavos.getPartidos().get(i).getResultado().getGolesLocal()
                    + " VISITANTE "
                    + octavos.getPartidos().get(i).getVisitante().getNombre()+" :"
                    +octavos.getPartidos().get(i).getResultado().getGolesVisitante()
                    +"\n");
        }


// Cuartos de final
        ArrayList<Equipo> clasificadosCuartos = new ArrayList<>();

        Llave cuartos = new Llave("Cuartos de final juegan 8 equipos", "Cuartos",4);
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

        } while (visitanteCuartos<cuartos.getCantidad_partidos() && cuartos.getPartidos().size() < cuartos.getCantEquiposClasifican());

        cuartos.setPartidos(partidos4tos);

        // Cruces 4tos de final

        System.out.print("\n-----------------------------------------\nCUARTOS DE FINAL" +
                "\nSelecciones clasificadas\n----------------------\n");

        for(int i = 0; i<cuartos.getCantEquiposClasifican(); i++) {

            System.out.print("LOCAL "+cuartos.getPartidos().get(i).getLocal().getNombre()+" :"
                    +cuartos.getPartidos().get(i).getResultado().getGolesLocal()
                    + " VISITANTE "
                    + cuartos.getPartidos().get(i).getVisitante().getNombre()+" :"
                    +cuartos.getPartidos().get(i).getResultado().getGolesVisitante()
                    +"\n");
        }


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
                "\nSelecciones clasificadas\n----------------------\n");

        for(int i = 0; i<semis.getCantEquiposClasifican(); i++) {

            System.out.print(semis.getPartidos().get(i).getLocal().getNombre()+":"
                    +semis.getPartidos().get(i).getResultado().getGolesLocal()
                    + " "
                    + semis.getPartidos().get(i).getVisitante().getNombre()+":"
                    +semis.getPartidos().get(i).getResultado().getGolesVisitante()
                    +"\n");
        }


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


            System.out.print(partido_final.getPartidos().get(0).getLocal().getNombre()+":"
                    +semis.getPartidos().get(0).getResultado().getGolesLocal()
                    + " "
                    + semis.getPartidos().get(1).getVisitante().getNombre()+":"
                    +semis.getPartidos().get(1).getResultado().getGolesVisitante()
                    +"\nCAMPEON: "+partido_final.getEquiposQueAvanzan().get(0).getNombre());






    }



}