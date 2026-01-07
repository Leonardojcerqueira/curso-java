package secao16;

import java.io.*;
import java.nio.channels.FileChannel;

import javax.imageio.ImageIO;

import java.awt.*;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;



public class Arquivo {

    public static void main(String[] args) {

        //1 - leitura de arquivos
        String currentDir = System.getProperty("user.dir") + "\\secao16\\" ;

        System.out.println(currentDir);
        System.out.println("C:\\Users\\ljesu\\OneDrive\\Área de Trabalho\\CURSOS UDEMY\\Curso Java\\secao16");

        
        
        // Windows -> \
        // Linux -> /

        //FileReader = caracter por caracter
        //BufferedReader = linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;

            while ((caracter = reader.read()) != -1)  {
                System.out.print( (char)caracter);
            }


        } catch (Exception e) {

            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        System.out.println();

            try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while ((linha = reader.readLine()) != null)  {
                System.out.println(linha);
            }


        } catch (Exception e) {

            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        //2 - escrever em arquivos

        try(FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");



        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivos: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {

        writer.write("Escrevendo em arquivo com buffered");
        writer.newLine();
        writer.write("Escrevendo em arquivo com buffered");
        writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivos: " + e.getMessage());
        }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {


                writer.append("Testando");

        
        } catch (Exception e) {
            System.out.println("Erro ao escrever em arquivos: " + e.getMessage());
        }


        // 3 - serialização de objetos
        Pessoa pessoa = new Pessoa("Matheus", 33);

        System.out.println(pessoa.getNome());

        //serializacao

        //Arquivos serializados, tem a extensão .ser

        //SERIALIZAR = OUTPUT

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(currentDir + "pessoa.ser")) ) {
            

            oos.writeObject(pessoa);

            System.out.println("Objeto serializado com sucesso.");

        } catch (Exception e) {
        System.out.println("Erro ao serializar  objeto: " + e.getMessage());        
    
        }

        //deserialização = INPUT
        try(ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(currentDir + "pessoa.ser"))){

            Pessoa pessoa2 = (Pessoa)ois.readObject();

            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("Nome: " + pessoa2.getIdade());


        } catch (Exception e) {
        System.out.println("Erro ao Deserializar  objeto: " + e.getMessage());
        }

      //4 - manipulacao de binários
        
       try(
        FileInputStream fis = new FileInputStream(currentDir + "imagem.jpg");
        FileOutputStream fos = new FileOutputStream(currentDir + "copia_imagem.jpg");
        ) {
        
        
        int byteData;

        while ((byteData = fis.read()) != -1) {
            fos.write(byteData);
        }

        System.out.println("Arquivo compiado com sucesso.");

       } catch (Exception e) {
        System.out.println("Erro ao copiar arquivo: " + e.getMessage());
       }

       // 5 - Cópia de video com buffer
       
       try (
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(currentDir + "Video.mp4"));
        BufferedOutputStream  bos = new BufferedOutputStream(new FileOutputStream(currentDir + "copia_video.mp4"))
       ){

        byte [] buffer = new byte[1024]; //Buffer 1kb em 1kb

        int bytesLidos;

        while ((bytesLidos = bis.read(buffer))  != -1){
            bos.write(buffer, 0, bytesLidos);
        }

        System.out.println("Video copiado com sucesso.");

       } catch (Exception e) {
        System.out.println("Erro ao copiar video: " + e.getMessage());
       }

       //5 - manipúlação de imagem

       //imagem.jpg e colocar um texto no centro

        try {
            
            BufferedImage imagem = ImageIO.read(new File(currentDir + "imagem.jpg"));
        
            if (imagem == null) {
                System.out.println("A imagem não pode ser carregada.");
            }

            Graphics2D g2d = imagem.createGraphics();

            //preparando o texto
            g2d.setFont(new Font("Arial", Font.BOLD,50));
            FontMetrics fm = g2d.getFontMetrics();
            String texto = "Texto no Centro";

            //centralizar texto na imagem
            int larguraTexto = fm.stringWidth(texto);
            int alturaTexto = fm.getHeight();

            //posicionamento
            int x = (imagem.getWidth() - larguraTexto) / 2;
            int y = (imagem.getHeight() - alturaTexto) / 2 + fm.getAscent();

            // Desenhar retangulo
            g2d.setColor(Color.BLACK );
            g2d.fillRect(x - 10, y - fm.getAscent(), larguraTexto + 20, alturaTexto);

            //Desenhar o texto em cima do retangulo
            g2d.setColor((Color.RED));
            g2d.drawString(texto, x, y);

            //liberação de recursos
            g2d.dispose();

            //salvar a imagem
            File outputFille = new File(currentDir + "imagem_com_texto.png");
            
            ImageIO.write(imagem, "png",outputFille);

            System.out.println("Gerou o texto na imagem com sucesso.");


        } catch (Exception e) {
            System.out.println("Erro ao processar imagem: " + e.getMessage());
        }



    }

    }
    

