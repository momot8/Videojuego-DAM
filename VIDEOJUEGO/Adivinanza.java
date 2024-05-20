import java.util.Random;
public class Adivinanza {
    private String pregunta;
    private String respuesta;

//Creamos arrays 
    private String[] preguntas1 = {"¿En que año finalizo la primera guerra mundial?","¿En que año se inventó la imprenta?", "¿En que año desapareció por completo el imperio romano?" };
    private String[] respuestas1 ={"1918","1440", "1453"};

    private String[] preguntas2 ={"¿Quien dio nombre a un canal de agua que conecta 2 oceanos en el sur de Argentina?", "¿Cual era el verdadero nombre del Cid Campeador?(Poner nombre completo y todo junto.", "(Pregunta extrema) ¿Quien avistó por primera vez tierra americana?(Todo junto, sin respetar los espacios)"};
    private String[] respuestas2 = {"magallanes", "rodrigodiaz", "rodrigodetriana"};

    private String[] preguntas3 ={"Famoso lugar donde se firmo un tratado de paz a 'La Ultima Guerra' ", "¿Donde empezo la reconquista española contra los musulmanes?", "¿Donde explotó la primera bomba nuclear?(Todo junto, sin respetar los espacios)"};
    private String[] respuestas3 = {"versalles", "covadonga", "nuevomexico"};

    private String[] preguntas4 = {"¿Quien libro a sus hermanos del intestino de su padre?","¿Cuantas tareas tuvo que realizar Hércules?", "¿A quien se debe el nombre de un árbol debido a estar enamorado de si mismo?"};
    private String[] respuestas4 = {"zeus", "12", "narciso"};

    private String[] preguntas5 = {"¿Cuanto es la siguiente operacion? 6123x7647834/1231x0x12312 + 1", "¿Cual es el unico deporte que te permite golpear en la cara a tu oponente por capturar a tu caballo?","¿Cuál es el nombre del pintor español conocido por su estilo surrealista, quien creó obras icónicas como \"La Persistencia de la Memoria\" y es considerado uno de los mayores exponentes del arte del siglo XX?" };
    private String[] respuestas5 = {"1", "buzkashi", "dali"};

    Random random = new Random();


/**
 * 
 * @param pregunta esta sera la pregunta que se realizara
 * @param respuesta esta sera la respuesta relacionada con la pregunta
 */
    public Adivinanza(String pregunta, String respuesta){
        this.pregunta=pregunta;
        this.respuesta=respuesta;
    }


    public String getPregunta() {
        return pregunta;
    }


    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }


    public String getRespuesta() {
        return respuesta;
    }


    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

//creamos elegirPregunta. Cada una es para una pregunta pero tienen casi la misma sintaxis, solo cambia que preguntas/respuestas se cambian

    public void elegirPregunta1(){
        int indiceAleatorio1 = random.nextInt(preguntas1.length);
        String pregunta1 = preguntas1[indiceAleatorio1];
        String respuesta1 = respuestas1[indiceAleatorio1];

        setPregunta(pregunta1);
        setRespuesta(respuesta1);

    }
    
    public void elegirPregunta2(){
        int indiceAleatorio2 = random.nextInt(preguntas2.length);
        String pregunta2 = preguntas2[indiceAleatorio2];
        String respuesta2 = respuestas2[indiceAleatorio2];

        setPregunta(pregunta2);
        setRespuesta(respuesta2);

    }
    
    public void elegirPregunta3(){
        int indiceAleatorio3 = random.nextInt(preguntas3.length);
        String pregunta3 = preguntas3[indiceAleatorio3];
        String respuesta3 = respuestas3[indiceAleatorio3];

        setPregunta(pregunta3);
        setRespuesta(respuesta3);

    }

    public void elegirPregunta4(){
        int indiceAleatorio4 = random.nextInt(preguntas4.length);
        String pregunta4 = preguntas4[indiceAleatorio4];
        String respuesta4 = respuestas4[indiceAleatorio4];

        setPregunta(pregunta4);
        setRespuesta(respuesta4);
    }

    public void elegirPregunta5(){
        int indiceAleatorio5 = random.nextInt(preguntas5.length);
        String pregunta5 = preguntas5[indiceAleatorio5];
        String respuesta5 = respuestas5[indiceAleatorio5];

        setPregunta(pregunta5);
        setRespuesta(respuesta5);

    }
}
