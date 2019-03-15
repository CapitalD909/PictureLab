/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue(){
      Picture beach = new Picture ("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
    }
  public static void testNegate(){
      Picture rob = new Picture ("rob.png");
      rob.explore();
      rob.negate();
      rob.explore();
    }
  public static void testGrayscale(){
      Picture rob = new Picture ("rob.png");
      rob.explore();
      rob.grayscale();
      rob.explore();
    }
    public static void testFixUnderwater(){
        Picture under = new Picture ("water.jpg");
        under.explore();
        under.fixUnderwater();
        under.explore();
    }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft(){
      Picture caterpillar = new Picture ("caterpillar.jpg");
      caterpillar.explore();
      caterpillar.mirrorVerticalRightToLeft();
      caterpillar.explore();
    }
    
   public static void testMirrorHorizontal(){
       Picture rob = new Picture ("rob.png");
       rob.explore();
       rob.mirrorHorizontal();
       rob.explore();
    }
    public static void testMirrorHorizontalBottomtoTop(){
        Picture rob = new Picture ("rob.png");
        rob.explore();
        rob.mirrorHorizontalBotToTop();
        rob.explore();
    }
    
    public static void testMirrorDiagonal(){
        Picture rob = new Picture ("rob.png");
        rob.explore();
        rob.mirrorDiagonal();
        rob.explore();
    }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms(){
      Picture snowman = new Picture ("snowman.jpg");
      snowman.explore();
      snowman.mirrorArms();
      snowman.explore();
    }
  public static void testMirrorGull(){
      Picture gull = new Picture ("seagull.jpg");
      gull.explore();
      gull.mirrorGull();
      gull.explore();
    }
  public static void testCopy(){
      Picture ocean = new Picture ("beach.jpg");
      Picture two = new Picture ("snowman.jpg");
      ocean.copy(two,10, 10, 60, 160, 180, 230);
      ocean.explore();
      
      
      
      
    }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
 
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("rob.png");
    swan.explore();
    swan.edgeDetection(20);
    swan.explore();
  }
  
  public static void testMyCollage(){
      Picture canvas = new Picture("640x480.jpg");
      canvas.myCollage();
      canvas.explore();
    }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}