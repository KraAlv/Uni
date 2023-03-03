

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ReplaceTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ReplaceTest extends junit.framework.TestCase
{ 
    /**
     * Default constructor for test class ReplaceTest
     */
    public ReplaceTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }
    /**
     * 
    */
    @Test
    public void testJavamode(){
        Replace p1 = new Replace("francisco");
        Replace p2 = new Replace("francisco come una rica comida");
        Replace p3 = new Replace("cisco es una academia muy buena de aprendizaje en linea");
        Replace p4 = new Replace("porque el tener un corazon roto es quivalente a tener tu autoestima rota"); 
        Replace p5 = new Replace("la universidad esta en su epoca de caida");
        Replace p6 = new Replace("francisco no sabia que su primo es francisco tambien");
        Replace p7 = new Replace("el 2022 se fue volando");
        Replace p8 = new Replace("cisco, francisco, disco, discos, frisco");
        Replace p9 = new Replace("la educacion es el arma mas poderosa que puedes usar para cambiar el mundo");
        Replace p10 = new Replace("la vida es un 10% lo que te sucede y un 90% cómo reaccionas ante ello"); 
        Replace p11 = new Replace("la felicidad no es algo hecho viene de tus propias acciones");
        Replace p12 = new Replace("las motivaciones de cada persona pueden ser mas oscuras de las que piensas");
        Replace p13 = new Replace("decir que no eres un interesado es como decir que los politicos no roban");
        Replace p14 = new Replace("la creatividad es la inteligencia divirtiendose");
        Replace p15 = new Replace("me gustan los animales");
        Replace p16 = new Replace("moly tenia un loro de color verde");
        Replace p17 = new Replace("eduard piensa que al final las cosas se relacionan");
        Replace p18 = new Replace("los objetos diminutos son faciles de perder");
        Replace p19 = new Replace("el agua compone una gran parte de nuestro organismo");
        Replace p20 = new Replace("cantidad no es lo mismo que calidad");
        
        assertEquals("frencisco", p1.Javamode("a","e"));
        assertEquals("francisco come mucha comida", p2.Javamode("una rica", "mucha"));
        assertEquals("cisco es un instituto de aprendizaje en linea", p3.Javamode("a academia muy buena", " instituto"));
        assertEquals("porque el tener un corazon destrozado es quivalente a tener tu autoestima rota", p4.Javamode("roto", "destrozado"));
        assertEquals("la universidad esta en su epoca de subida", p5.Javamode("caida", "subida"));
        assertEquals("franchesco no sabia que su primo es franchesco tambien", p6.Javamode("cisco","chesco"));//6
        assertEquals("el 2022 fue un desastre", p7.Javamode("se fue volando","fue un desastre"));//7
        assertEquals("casco, francasco, dasco, dascos, frasco", p8.Javamode("isco","asco"));//8
        assertEquals("le educecion es el erme mes poderose que puedes user pere cembier el mundo", p9.Javamode("a", "e"));
        assertEquals("la vida es un 10% lo que te ocurre y un 90% cómo reaccionas ante ello", p10.Javamode("sucede", "ocurre"));
        assertEquals("la felicidad no esta escrita viene de tus propias acciones",p11.Javamode("es algo hecho","esta escrita"));
        assertEquals("las motivaciones de cada persona pueden ser oscuras",p12.Javamode("mas oscuras de las que piensas","oscuras"));
        assertEquals("decir que no eres un interesado es como decir que los pajaros no vuelan",p13.Javamode("politicos no roban","pajaros no vuelan"));
        assertEquals("la creatividad es la inteligencia bailando",p14.Javamode("divirtiendose","bailando"));
        assertEquals("me gustan los perros, gatos y caballos",p15.Javamode("animales","perros, gatos y caballos"));
        assertEquals("moly tenia un loro de color azul",p16.Javamode("verde","azul"));
        assertEquals("eduard piensa que al final las piezas encajan",p17.Javamode("cosas se relacionan","piezas encajan"));
        assertEquals("los objetos diminutos son dificiles de perder",p18.Javamode("faciles","dificiles"));
        assertEquals("el agua no compone una gran parte de nuestro organismo",p19.Javamode("compone","no compone"));
        assertEquals("cantidad no es calidad",p20.Javamode("lo mismo que ",""));
    }
    
    
    /**
     * test 20 puebas
    */
    @Test
    public void testourreplace(){
        Replace p1 = new Replace("francisco");
        Replace p2 = new Replace("francisco come una rica comida");
        Replace p3 = new Replace("cisco es una academia muy buena de aprendizaje en linea");
        Replace p4 = new Replace("porque el tener un corazon roto es quivalente a tener tu autoestima rota"); 
        Replace p5 = new Replace("la universidad esta en su epoca de caida");
        Replace p6 = new Replace("francisco no sabia que su primo es francisco tambien");
        Replace p7 = new Replace("el 2022 se fue volando");
        Replace p8 = new Replace("cisco, francisco, disco, discos, frisco");
        Replace p9 = new Replace("la educacion es el arma mas poderosa que puedes usar para cambiar el mundo");
        Replace p10 = new Replace("la vida es un 10% lo que te sucede y un 90% cómo reaccionas ante ello"); 
        Replace p11 = new Replace("la felicidad no es algo hecho viene de tus propias acciones");
        Replace p12 = new Replace("las motivaciones de cada persona pueden ser mas oscuras de las que piensas");
        Replace p13 = new Replace("decir que no eres un interesado es como decir que los politicos no roban");
        Replace p14 = new Replace("la creatividad es la inteligencia divirtiendose");
        Replace p15 = new Replace("me gustan los animales");
        Replace p16 = new Replace("moly tenia un loro de color verde");
        Replace p17 = new Replace("eduard piensa que al final las cosas se relacionan");
        Replace p18 = new Replace("los objetos diminutos son faciles de perder");
        Replace p19 = new Replace("el agua compone una gran parte de nuestro organismo");
        Replace p20 = new Replace("cantidad no es lo mismo que calidad");
        
        assertEquals("frencisco", p1.ourreplace("a","e"));
        assertEquals("francisco come mucha comida", p2.ourreplace("una rica", "mucha"));
        assertEquals("cisco es un instituto de aprendizaje en linea", p3.ourreplace("a academia muy buena", " instituto"));
        assertEquals("porque el tener un corazon destrozado es quivalente a tener tu autoestima rota", p4.ourreplace("roto", "destrozado"));
        assertEquals("la universidad esta en su epoca de subida", p5.ourreplace("caida", "subida"));
        assertEquals("franchesco no sabia que su primo es franchesco tambien", p6.ourreplace("cisco","chesco"));//6
        assertEquals("el 2022 fue un desastre", p7.ourreplace("se fue volando","fue un desastre"));//7
        assertEquals("casco, francasco, dasco, dascos, frasco", p8.ourreplace("isco","asco"));//8
        assertEquals("le educecion es el erme mes poderose que puedes user pere cembier el mundo", p9.ourreplace("a", "e"));
        assertEquals("la vida es un 10% lo que te ocurre y un 90% cómo reaccionas ante ello", p10.ourreplace("sucede", "ocurre"));
        assertEquals("la felicidad no esta escrita viene de tus propias acciones",p11.ourreplace("es algo hecho","esta escrita"));
        assertEquals("las motivaciones de cada persona pueden ser oscuras",p12.ourreplace("mas oscuras de las que piensas","oscuras"));
        assertEquals("decir que no eres un interesado es como decir que los pajaros no vuelan",p13.ourreplace("politicos no roban","pajaros no vuelan"));
        assertEquals("la creatividad es la inteligencia bailando",p14.ourreplace("divirtiendose","bailando"));
        assertEquals("me gustan los perros, gatos y caballos",p15.ourreplace("animales","perros, gatos y caballos"));
        assertEquals("moly tenia un loro de color azul",p16.ourreplace("verde","azul"));
        assertEquals("eduard piensa que al final las piezas encajan",p17.ourreplace("cosas se relacionan","piezas encajan"));
        assertEquals("los objetos diminutos son dificiles de perder",p18.ourreplace("faciles","dificiles"));
        assertEquals("el agua no compone una gran parte de nuestro organismo",p19.ourreplace("compone","no compone"));
        assertEquals("cantidad no es calidad",p20.ourreplace("lo mismo que ",""));
    }
    
   
   
    @Test
    public void testReplaceAll(){
        Replace p1 = new Replace("francisco");
        Replace p2 = new Replace("francisco come una rica comida");
        Replace p3 = new Replace("cisco es una academia muy buena de aprendizaje en linea");
        Replace p4 = new Replace("porque el tener un corazon roto es quivalente a tener tu autoestima rota"); 
        Replace p5 = new Replace("la universidad esta en su epoca de caida");
        Replace p6 = new Replace("francisco no sabia que su primo es francisco tambien");
        Replace p7 = new Replace("el 2022 se fue volando");
        Replace p8 = new Replace("cisco, francisco, disco, discos, frisco");
        Replace p9 = new Replace("la educacion es el arma mas poderosa que puedes usar para cambiar el mundo");
        Replace p10 = new Replace("la vida es un 10% lo que te sucede y un 90% cómo reaccionas ante ello"); 
        Replace p11 = new Replace("la felicidad no es algo hecho viene de tus propias acciones");
        Replace p12 = new Replace("las motivaciones de cada persona pueden ser mas oscuras de las que piensas");
        Replace p13 = new Replace("decir que no eres un interesado es como decir que los politicos no roban");
        Replace p14 = new Replace("la creatividad es la inteligencia divirtiendose");
        Replace p15 = new Replace("me gustan los animales");
        Replace p16 = new Replace("moly tenia un loro de color verde");
        Replace p17 = new Replace("eduard piensa que al final las cosas se relacionan");
        Replace p18 = new Replace("los objetos diminutos son faciles de perder");
        Replace p19 = new Replace("el agua compone una gran parte de nuestro organismo");
        Replace p20 = new Replace("cantidad no es lo mismo que calidad");
        
        assertEquals("frencisco", p1.ReplaceAll("a","e"));
        assertEquals("francisco come mucha comida", p2.ReplaceAll("una rica", "mucha"));
        assertEquals("cisco es un instituto de aprendizaje en linea", p3.ReplaceAll("a academia muy buena", " instituto"));
        assertEquals("porque el tener un corazon destrozado es quivalente a tener tu autoestima rota", p4.ReplaceAll("roto", "destrozado"));
        assertEquals("la universidad esta en su epoca de subida", p5.ReplaceAll("caida", "subida"));
        assertEquals("franchesco no sabia que su primo es franchesco tambien", p6.ReplaceAll("cisco","chesco"));//6
        assertEquals("el 2022 fue un desastre", p7.ReplaceAll("se fue volando","fue un desastre"));//7
        assertEquals("casco, francasco, dasco, dascos, frasco", p8.ReplaceAll("isco","asco"));//8
        assertEquals("le educecion es el erme mes poderose que puedes user pere cembier el mundo", p9.ReplaceAll("a", "e"));
        assertEquals("la vida es un 10% lo que te ocurre y un 90% cómo reaccionas ante ello", p10.ReplaceAll("sucede", "ocurre"));
        assertEquals("la felicidad no esta escrita viene de tus propias acciones",p11.ReplaceAll("es algo hecho","esta escrita"));
        assertEquals("las motivaciones de cada persona pueden ser oscuras",p12.ReplaceAll("mas oscuras de las que piensas","oscuras"));
        assertEquals("decir que no eres un interesado es como decir que los pajaros no vuelan",p13.ReplaceAll("politicos no roban","pajaros no vuelan"));
        assertEquals("la creatividad es la inteligencia bailando",p14.ReplaceAll("divirtiendose","bailando"));
        assertEquals("me gustan los perros, gatos y caballos",p15.ReplaceAll("animales","perros, gatos y caballos"));
        assertEquals("moly tenia un loro de color azul",p16.ReplaceAll("verde","azul"));
        assertEquals("eduard piensa que al final las piezas encajan",p17.ReplaceAll("cosas se relacionan","piezas encajan"));
        assertEquals("los objetos diminutos son dificiles de perder",p18.ReplaceAll("faciles","dificiles"));
        assertEquals("el agua no compone una gran parte de nuestro organismo",p19.ReplaceAll("compone","no compone"));
        assertEquals("cantidad no es calidad",p20.ReplaceAll("lo mismo que ",""));
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
