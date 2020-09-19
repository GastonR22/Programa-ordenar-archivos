package logica;

import java.io.File;

public class Ordenar {

    private String path;
    private String [] listaArchivos;
    private Boolean texto, video, audio, imagen, ejecucion, comprimido;
    private File archivoTexto,archivoVideo,archivoAudio,archivoImagen,archivoEjecucion,archivoComprimido;

    
    public Ordenar() {
    }

    public Ordenar(String path, Boolean texto, Boolean video, Boolean audio, Boolean imagen, Boolean ejecucion, Boolean comprimido) {
        this.path = path;
        this.texto = texto;
        this.video = video;
        this.audio = audio;
        this.imagen = imagen;
        this.ejecucion = ejecucion;
        this.comprimido = comprimido;

        archivoTexto = new File(path + "\\Texto");
        archivoVideo = new File(path + "\\Video");
        archivoAudio = new File(path + "\\Audio");
        archivoImagen = new File(path + "\\Imagen");
        archivoEjecucion = new File(path + "\\Ejecucion");
        archivoComprimido = new File(path + "\\Comprimido");
    }

    public Ordenar(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getTexto() {
        return texto;
    }

    public void setTexto(Boolean texto) {
        this.texto = texto;
    }

    public Boolean getVideo() {
        return video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Boolean getAudio() {
        return audio;
    }

    public void setAudio(Boolean audio) {
        this.audio = audio;
    }

    public Boolean getImagen() {
        return imagen;
    }

    public void setImagen(Boolean imagen) {
        this.imagen = imagen;
    }

    public Boolean getEjecucion() {
        return ejecucion;
    }

    public void setEjecucion(Boolean ejecucion) {
        this.ejecucion = ejecucion;
    }

    public Boolean getComprimido() {
        return comprimido;
    }

    public void setComprimido(Boolean comprimido) {
        this.comprimido = comprimido;
    }

    public File getArchivoTexto() {
        return archivoTexto;
    }

    public void setArchivoTexto(File archivoTexto) {
        this.archivoTexto = archivoTexto;
    }

    public File getArchivoVideo() {
        return archivoVideo;
    }

    public void setArchivoVideo(File archivoVideo) {
        this.archivoVideo = archivoVideo;
    }

    public File getArchivoAudio() {
        return archivoAudio;
    }

    public void setArchivoAudio(File archivoAudio) {
        this.archivoAudio = archivoAudio;
    }

    public File getArchivoImagen() {
        return archivoImagen;
    }

    public void setArchivoImagen(File archivoImagen) {
        this.archivoImagen = archivoImagen;
    }

    public File getArchivoEjecucion() {
        return archivoEjecucion;
    }

    public void setArchivoEjecucion(File archivoEjecucion) {
        this.archivoEjecucion = archivoEjecucion;
    }

    public File getArchivoComprimido() {
        return archivoComprimido;
    }

    public void setArchivoComprimido(File archivoComprimido) {
        this.archivoComprimido = archivoComprimido;
    }
    
    public void crearCarpetas() {
      
        if (texto == true) {
            archivoTexto.mkdir();
        }
        if (video == true) {
            archivoVideo.mkdir();
        }
        if (audio == true) {
            archivoAudio.mkdir();
        }
        if (imagen == true) {
            archivoImagen.mkdir();
        }
        if (ejecucion == true) {
            archivoEjecucion.mkdir();
        }
        if (comprimido == true) {
            archivoComprimido.mkdir();
        }

    }

    
    public void listarArchivosFiltro(){
        File listar = new File(path);
        int auxContador = 0;
        int auxContadorArray = 0;

        //Contamos la cantidad numérica de archivos no ocultos que hay en la carpeta para posteriormente guardarlo en la variable auxContador
        //Nos aseguramos de no manipular ningún archivo oculto
        for (File file : listar.listFiles()) {
            if (file.isFile() == true && file.isHidden() == false) {
                auxContador++;
            }
        }
        //Inicializamos el array con la cantidad de archivos
        listaArchivos = new String [auxContador];
        
        //Llenamos el array
        for (File file : listar.listFiles()) {      
            if (file.isFile() == true && file.isHidden() == false) {
                listaArchivos[auxContadorArray] = String.valueOf(file.getName());  
                auxContadorArray++;
            }                           
        }       
    }
     
    public void extraerExtension() {
        String extension;
               
        for (int i = 0; i < listaArchivos.length; i++) {
            
            //Transformamos cada archivo de la lista de archivos en un charArray para poder extraer los caracteres de la extensión
            char archivoChar[] = listaArchivos[i].toCharArray();
            //Verificamos si la extensión del archivo tiene 3 o 4 caracteres
            if (archivoChar[archivoChar.length - 4] == '.') {

                extension = String.valueOf("" + archivoChar[archivoChar.length - 3] + archivoChar[archivoChar.length - 2] + archivoChar[archivoChar.length - 1]);
            } else {
                extension = String.valueOf("" + archivoChar[archivoChar.length - 4] + archivoChar[archivoChar.length - 3] + archivoChar[archivoChar.length - 2] + archivoChar[archivoChar.length - 1]);
            }
            OrdenarArchivos(extension, listaArchivos[i]);
        }
    }

    
    
    public void OrdenarArchivos(String extension, String archivoLista) {

        if (extension.equals("txt") || extension.equals("docx") || extension.equals("pdf") || extension.equals("xlsx") || extension.equals("pptx") || extension.equals("doc") || extension.equals("ppt")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoTexto.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));

        } else if (extension.equals("jpg") || extension.equals("jpeg") || extension.equals("png")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoImagen.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));

        } else if (extension.equals("avi") || extension.equals("divx") || extension.equals("mov") || extension.equals("mp4") || extension.equals("mkv") || extension.equals("wmv")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoVideo.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));

        } else if (extension.equals("exe") || extension.equals("bat") || extension.equals("dll") || extension.equals("msi")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoEjecucion.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));

        } else if (extension.equals("mp3") || extension.equals("wma") || extension.equals("wav") || extension.equals("midi")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoAudio.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));

        } else if (extension.equals("zip") || extension.equals("rar") || extension.equals("rar5")) {

            File fichero = new File(path + "\\" + archivoLista);
            File directorio = new File(archivoComprimido.getAbsolutePath());
            fichero.renameTo(new File(directorio, fichero.getName()));
        }
   }

}
