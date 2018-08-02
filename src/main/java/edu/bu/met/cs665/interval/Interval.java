package edu.bu.met.cs665.interval;

public class Interval {
  
  public static String numerOfHalfStepsAsString(int noteNumber){
    String returnString = null;
    switch (noteNumber){
      case 0:
        returnString = "perfect unison";
        break;
      case 1:
         returnString = "minor second above";
         break;
      case 2:
        returnString = "major second above";
        break;
      case 3:
         returnString = "minor third above";
         break;
      case 4:
          returnString = "major third above";
          break;
      case 5:
          returnString = "perfect fourth above";
          break;
      case 6:
          returnString = "tritone above";
          break;
      case 7:
          returnString = "perfect fifth above";
          break;
      case -1:
          returnString = "minor second below";
          break;
      case -2:
          returnString = "major second below";
          break;
      case -3:
          returnString = "minor third below";
          break;
      case -4:
          returnString = "major third below";
          break;
      case -5:
          returnString = "perfect fourth below";
          break;
      case -6:
          returnString = "tritone below";
          break;
      case -7:
          returnString = "perfect fifth below";
          break;
      //TODO implement the rest of the half steps
    }
    
    return returnString;
  }
  
  public static String pitchNumberToChromaticNoteName(int pitchNumber){
    if(pitchNumber < 0){
      throw new IllegalArgumentException("Pitch numbers cannot be negative");
    }
    String noteName = null;
    // Reduce the pitch number to fit into one octave
    pitchNumber %= 12;
    switch (pitchNumber){
      case 0:
        noteName = "C";
        break;
      case 1:
        noteName = "C#";
        break;
      case 2:
        noteName = "D";
        break;
      case 3:
        noteName = "Eb";
        break;
      case 4:
        noteName = "E";
        break;
      case 5:
        noteName = "F";
        break;
      case 6:
        noteName = "F#";
        break;
      case 7:
        noteName = "G";
        break;
      case 8:
        noteName = "Ab";
        break;
      case 9:
        noteName = "A";
        break;
      case 10:
        noteName = "Bb";
        break;
      case 11:
        noteName = "B";
        break;
    }
    return noteName;
  }

}
