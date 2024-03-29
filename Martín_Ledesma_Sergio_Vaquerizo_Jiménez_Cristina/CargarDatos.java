
/**
 * 
 * @Nombre de la clase: CargarDatos.
 * @Propósito de la clase: Cargar los Datos de la Competición.
 * @Versión: 3.0
 * @Autores: Sergio Martín Ledesma y Cristina Vaquerizo Jiménez.
 * 
 */
public class CargarDatos
{
    /**
     * Constructor parametrizado de la Clase CargarDatos.
     * 
     * @param campeonato  Es un Campeonato
     */
    public CargarDatos(Campeonato campeonato) {
        //Descomentar la carga de datos que se quiera probar
        //cargarDatos1(campeonato); //Produce la salida Salida1_EC3
        cargarDatos2(campeonato);   //Produce la salida Salida2_EC3

    }

    /**
     * Método que carga los datos 1 de un Campeonato
     * 
     * @param campeonato  Es un Campeonato
     */
    private void cargarDatos1(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, valor)
        Zapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        Zapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        Zapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
        Zapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
        Zapatillas z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        Zapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 6.0);
        Zapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);
        Zapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42.0, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais, numPie)
        Tenista t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
        Tenista t2 = new Golpeadores("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40.0);
        Tenista t3 = new Voleadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0);
        Tenista t4 = new Voleadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0);
        Tenista t5 = new Golpeadores("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40.0);
        Tenista t6 = new Golpeadores("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42.0);
        Tenista t7 = new Voleadores("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40.0);
        Tenista t8 = new Voleadores("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42.0);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        t5.realizarInscripcion();
        t6.realizarInscripcion();
        t7.realizarInscripcion();
        t8.realizarInscripcion();
                
        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: modelo, número y valor)
        Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40.0,  5.0);
        Zapatillas z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42.0,  3.0);
        Zapatillas z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42.0, 5.5);
        Zapatillas z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40.0, 6.0);
        Zapatillas z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40.0,  5.0);
        Zapatillas z14 = new ZapatillasAmortiguadas("Wilson Rush", 42.0,  3.5);
        Zapatillas z15 = new ZapatillasAmortiguadas("Head Revolt", 40.0,  5.0);
        Zapatillas z16 = new ZapatillasConAgarre("Joma Slam", 40.0, 3.0);
        Zapatillas z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40.0,  5.0);
        Zapatillas z18 = new ZapatillasConAgarre("Asics Gel-Game", 42.0,  4.5);
        Zapatillas z19 = new ZapatillasConAgarre("Asics Solution", 42.0, 3.0);
        Zapatillas z20 = new ZapatillasConAgarre("Nike Air Zoom", 40.0,  5.0);
        Zapatillas z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42.0,  4.0);
        Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41.0,  5.0);
        Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42.0,  4.5);
        
        //Rellenamos el Array zapatillasCampeonato
        campeonato.rellenarZapatillasCampeonato(z9);
        campeonato.rellenarZapatillasCampeonato(z10);
        campeonato.rellenarZapatillasCampeonato(z11);
        campeonato.rellenarZapatillasCampeonato(z12);
        campeonato.rellenarZapatillasCampeonato(z13);
        campeonato.rellenarZapatillasCampeonato(z14);
        campeonato.rellenarZapatillasCampeonato(z15);
        campeonato.rellenarZapatillasCampeonato(z16);
        campeonato.rellenarZapatillasCampeonato(z17);
        campeonato.rellenarZapatillasCampeonato(z18);
        campeonato.rellenarZapatillasCampeonato(z19);
        campeonato.rellenarZapatillasCampeonato(z20);
        campeonato.rellenarZapatillasCampeonato(z21);
        campeonato.rellenarZapatillasCampeonato(z22);
        campeonato.rellenarZapatillasCampeonato(z23);

        //Instanciamos raquetas para ser usadas en el campeonato:
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        //Definir las raquetas con la interface
        Raqueta r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0, TipoEncordado.Abierto);
        Raqueta r2 = new RaquetasPotentes("Wilson Blade", 260.0, 690.0, 680.0, TipoEncordado.Abierto);
        Raqueta r3 = new RaquetasPotentes("Dunlop CX200", 300.0, 700.0, 630.0, TipoEncordado.Abierto);
        Raqueta r4 = new RaquetasPotentes("Yonex Vcore", 300.0, 680.0, 650.0, TipoEncordado.Cerrado);
        Raqueta r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
        Raqueta r6 = new RaquetasControladas("Pure Aero", 340.0, 680.0, 720.0, TipoEncordado.Cerrado);
        Raqueta r7 = new RaquetasControladas("TFlash 300", 300.0, 680.0, 680.0, TipoEncordado.Cerrado);
        Raqueta r8 = new RaquetasControladas("Wilson Silver", 220.0, 690.0, 650.0, TipoEncordado.Abierto);
        Raqueta r9 = new RaquetasEquilibradas("Prince Hornet 100", 220.0, 690.0, 600.0, TipoEncordado.Cerrado, 2.5, 4.0);
        Raqueta r10 = new RaquetasEquilibradas("Head Graphene", 320.0, 690.0, 630.0, TipoEncordado.Abierto, 6.0, 2.0);
        Raqueta r11 = new RaquetasEquilibradas("Prince TT Bandit", 220.0, 680.0, 680.0, TipoEncordado.Cerrado, 6.0, 3.0);
        Raqueta r12 = new RaquetasEquilibradas("Class 100L", 320.0, 680.0, 720.0, TipoEncordado.Abierto, 8.0, 1.0);
        
        //Rellenamos el Array raquetasCampeonato
        campeonato.rellenarRaquetasCampeonato(r1);
        campeonato.rellenarRaquetasCampeonato(r2);
        campeonato.rellenarRaquetasCampeonato(r3);
        campeonato.rellenarRaquetasCampeonato(r4);
        campeonato.rellenarRaquetasCampeonato(r5);
        campeonato.rellenarRaquetasCampeonato(r6);
        campeonato.rellenarRaquetasCampeonato(r7);
        campeonato.rellenarRaquetasCampeonato(r8);
        campeonato.rellenarRaquetasCampeonato(r9);
        campeonato.rellenarRaquetasCampeonato(r10);
        campeonato.rellenarRaquetasCampeonato(r11);
        campeonato.rellenarRaquetasCampeonato(r12);
        
        //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Raqueta r14 = new RaquetasPotentes("Wilson Energy XL", 260.0, 690.0, 680.0, TipoEncordado.Abierto);
        Raqueta r15 = new RaquetasPotentes("Wilson Pro Open", 340.0, 740.0, 720.0, TipoEncordado.Abierto);
        Raqueta r16 = new RaquetasPotentes("Babolat Boost Drive", 220.0, 680.0,600.0, TipoEncordado.Cerrado);
        Raqueta r17 = new RaquetasPotentes("Babolat Pure Drive", 260.0, 720.0, 600.0, TipoEncordado.Cerrado);
        Raqueta r18 = new RaquetasControladas("Prince Force Ti OS", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
        Raqueta r19 = new RaquetasControladas("Head Prestige Pro", 340.0, 740.0, 720.0, TipoEncordado.Abierto);
        Raqueta r20 = new RaquetasControladas("Head Instinct", 220.0, 680.0,600.0, TipoEncordado.Abierto);
        Raqueta r21 = new RaquetasControladas("Dunlop Nitro", 340.0, 720.0, 600.0, TipoEncordado.Abierto);
        Raqueta r22 = new RaquetasEquilibradas("Prince Force", 320.0, 690.0, 630.0, TipoEncordado.Abierto, 6.0, 2.0);
        Raqueta r23 = new RaquetasEquilibradas("Prince Warrior", 340.0, 740.0, 720.0, TipoEncordado.Abierto, 6.0, 2.0);
        Raqueta r24 = new RaquetasEquilibradas("Wilson Pro Staff", 220.0, 680.0, 600.0, TipoEncordado.Cerrado, 2.5, 4.0);
        
        //Rellenamos el Array raquetasCampeonato
        campeonato.rellenarRaquetasCampeonato(r14);
        campeonato.rellenarRaquetasCampeonato(r15);
        campeonato.rellenarRaquetasCampeonato(r16);
        campeonato.rellenarRaquetasCampeonato(r17);
        campeonato.rellenarRaquetasCampeonato(r18);
        campeonato.rellenarRaquetasCampeonato(r19);
        campeonato.rellenarRaquetasCampeonato(r20);
        campeonato.rellenarRaquetasCampeonato(r21);
        campeonato.rellenarRaquetasCampeonato(r22);
        campeonato.rellenarRaquetasCampeonato(r23);
        campeonato.rellenarRaquetasCampeonato(r24);
    }

    /**
     * Método que carga los datos 2 de un Campeonato
     * 
     * @param campeonato  Es un Campeonato
     */
    private void cargarDatos2(Campeonato campeonato) {
        //Instanciamos 8 zapatillas: (Los parámetros están en el orden: modelo, número, valor)
        Zapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        Zapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        Zapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
        Zapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
        Zapatillas z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        Zapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 5.5);
        Zapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 7.0);
        Zapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42.0, 3.5);

        //Instanciamos 8 tenistas: (Los parámetros están en el orden nombre, zapatillas, saque, resto, ranking, pais, numPie)
        Tenista t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
        Tenista t2 = new Golpeadores("Ashleigh Barty", z6, 70.0, 80.0, 1, "Australia", 40.0);
        Tenista t3 = new Golpeadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0);
        Tenista t4 = new Golpeadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0);
        Tenista t5 = new Voleadores("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40.0);
        Tenista t6 = new Voleadores("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42.0);
        Tenista t7 = new Voleadores("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40.0);
        Tenista t8 = new Voleadores("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42.0);

        //A continuación se inscribirán a los 8 tenistas en el campeonato
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        t5.realizarInscripcion();
        t6.realizarInscripcion();
        t7.realizarInscripcion();
        t8.realizarInscripcion();

        //Instanciamos zapatillas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: modelo, número y valor)
        Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40.0, 5.0);
        Zapatillas z10 = new ZapatillasConAgarre("Adidas Gamecourt", 40.0, 5.0);
        Zapatillas z11 = new ZapatillasConAgarre("Asics Gel-Game", 42.0, 4.5);
        Zapatillas z12 = new ZapatillasAmortiguadas("K-Swiss Express", 42.0, 3.0);
        Zapatillas z13 = new ZapatillasConAgarre("Joma Slam", 40.0, 3.0);
        Zapatillas z14 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42.0, 5.5);
        Zapatillas z15 = new ZapatillasConAgarre("Asics Solution", 42.0, 3.0);
        Zapatillas z16 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40.0, 5.0);
        Zapatillas z17 = new ZapatillasConAgarre("Nike Air Zoom", 40.0, 5.0);
        Zapatillas z18 = new ZapatillasConAgarre("Nike Zoom Vapor", 42.0, 4.0);
        Zapatillas z19 = new ZapatillasAmortiguadas("Wilson Rush", 42.0, 3.5);
        Zapatillas z20 = new ZapatillasAmortiguadas("Head Revolt", 40.0, 3.0);
        Zapatillas z21 = new ZapatillasAmortiguadas("Lotto Mirage", 40.0, 6.0);
        Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41.0, 5.0);
        Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42.0, 4.5);
        
        //Rellenamos el Array zapatillasCampeonato
        campeonato.rellenarZapatillasCampeonato(z9);
        campeonato.rellenarZapatillasCampeonato(z10);
        campeonato.rellenarZapatillasCampeonato(z11);
        campeonato.rellenarZapatillasCampeonato(z12);
        campeonato.rellenarZapatillasCampeonato(z13);
        campeonato.rellenarZapatillasCampeonato(z14);
        campeonato.rellenarZapatillasCampeonato(z15);
        campeonato.rellenarZapatillasCampeonato(z16);
        campeonato.rellenarZapatillasCampeonato(z17);
        campeonato.rellenarZapatillasCampeonato(z18);
        campeonato.rellenarZapatillasCampeonato(z19);
        campeonato.rellenarZapatillasCampeonato(z20);
        campeonato.rellenarZapatillasCampeonato(z21);
        campeonato.rellenarZapatillasCampeonato(z22);
        campeonato.rellenarZapatillasCampeonato(z23);

        //Instanciamos raquetas para ser usadas en el campeonato: 
        //(Los parámetros están en el orden: Modelo, peso, longitud, tamaño de cabeza, tipo de encordado)
        //Además en el caso de raquetas equilibradas también se indican al final los valores potencia y control
        Raqueta r1 = new RaquetasPotentes("Head Radical", 260.0, 680.0, 680.0,TipoEncordado.Abierto);
        Raqueta r2 = new RaquetasPotentes("Wilson Blade", 260.0, 690.0, 680.0, TipoEncordado.Abierto);
        Raqueta r3 = new RaquetasPotentes("Dunlop CX200", 300.0, 700.0, 630.0, TipoEncordado.Abierto);
        Raqueta r4 = new RaquetasPotentes("Yonex Vcore", 300.0, 680.0, 650.0, TipoEncordado.Cerrado);
        Raqueta r5 = new RaquetasControladas("Babolat Drive", 340.0, 740.0, 600.0, TipoEncordado.Cerrado);
        Raqueta r6 = new RaquetasControladas("Pure Aero", 340.0, 680.0, 720.0, TipoEncordado.Cerrado);
        Raqueta r7 = new RaquetasControladas("TFlash 300", 300.0, 680.0, 680.0, TipoEncordado.Cerrado);
        Raqueta r8 = new RaquetasControladas("Wilson Silver", 220.0, 690.0, 650.0, TipoEncordado.Abierto);
        Raqueta r9 = new RaquetasEquilibradas("Prince Hornet 100", 220.0, 690.0, 600.0, TipoEncordado.Cerrado, 2.5, 4.0);
        Raqueta r10 = new RaquetasEquilibradas("Head Graphene", 320.0, 690.0, 630.0, TipoEncordado.Abierto, 6.0, 2.0);
        Raqueta r11 = new RaquetasEquilibradas("Prince TT Bandit", 220.0, 680.0, 680.0, TipoEncordado.Cerrado, 6.0, 3.0);
        Raqueta r12 = new RaquetasEquilibradas("Class 100L", 320.0, 680.0, 720.0, TipoEncordado.Abierto, 8.0, 1.0);
        
        //Rellenamos el Array raquetasCampeonato
        campeonato.rellenarRaquetasCampeonato(r1);
        campeonato.rellenarRaquetasCampeonato(r2);
        campeonato.rellenarRaquetasCampeonato(r3);
        campeonato.rellenarRaquetasCampeonato(r4);
        campeonato.rellenarRaquetasCampeonato(r5);
        campeonato.rellenarRaquetasCampeonato(r6);
        campeonato.rellenarRaquetasCampeonato(r7);
        campeonato.rellenarRaquetasCampeonato(r8);
        campeonato.rellenarRaquetasCampeonato(r9);
        campeonato.rellenarRaquetasCampeonato(r10);
        campeonato.rellenarRaquetasCampeonato(r11);
        campeonato.rellenarRaquetasCampeonato(r12);
        
         //Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Raqueta r13 = new RaquetasPotentes("Wilson Energy XL", 260.0, 690.0, 680.0, TipoEncordado.Abierto);
        Raqueta r14 = new RaquetasPotentes("Wilson Pro Open", 340.0, 740.0, 720.0, TipoEncordado.Abierto);
        Raqueta r15 = new RaquetasPotentes("Babolat Boost Drive", 220.0, 680.0,600.0, TipoEncordado.Cerrado);
        Raqueta r16 = new RaquetasPotentes("Babolat Pure Drive", 260.0, 720.0, 600.0, TipoEncordado.Cerrado);
        
        //Rellenamos el Array raquetasCampeonato
        campeonato.rellenarRaquetasCampeonato(r13);
        campeonato.rellenarRaquetasCampeonato(r14);
        campeonato.rellenarRaquetasCampeonato(r15);
        campeonato.rellenarRaquetasCampeonato(r16);
    }
}
