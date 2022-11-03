package Ficha4;

public class CharacterDrawingUtilities {
    public static void drawElement(char c){
        System.out.println(c);
    }

    public static void drawNewLine(){
        System.out.println();
    }

    public static void drawHorizontalSegmentWith(char c, int colunas){
        for(int l = 0; l < colunas; l ++){
            drawElement(c);
            drawElement(' ');


        }
    }

    public static void drawFilledRectangleWith(char c, int linha, int colunas){
        for (int j = 0; j < linha; j++){
            drawHorizontalSegmentWith(c, colunas);
            drawNewLine();

        }
    }

}
