# crunchypack-interface
# What this project does:
  Part 1 of the crunchypack application suite; this Java-Swing driven GUI is used to take a collection of image files located in a folder and organize them such that they can be assigned group and image alias names by the user. An example would be a collection of the same tree from many angles could all be assigned to group "Tree A" for use in building a crunchypack, since there may be unique pixels in some of these angles that ultimatly represent the same image. A text file is then generated with these image names, aliases, and file locations which can be passed to the ImgReduce executable for extracting unique pixel information from the images and collections.

# How to install this project:
 This project source code can be run in any standard IDE set up to run Java code. Be advised that the DEBUG_MODE bit is currently enabled to 1 in the entry point of the source code file his project was developed and will call debug folders; if you want to use your own data you will need to supply your own folder path in DEBUG sections of code, or disable the debug mode and supply it manually when prompted. Testing code in Netbeans and requires nothing beyond the default packages and JUnit.<br><br> Before running the .jar file, be sure the java virtual machine is installed and added to the system path; if it is not refer to the Oracle instructions for installing Java. To run the .jar file, simply double click the executable file.
  
# Example Usage:
  I have 5 images (grass.bmp, box.bmp, player.bmp, iron_node0.bmp, iron_node1.bmp, iron_node2.bmp) that I would like a machine to watch and take a certain action, such as inputting a keystroke, when one of these images appears somewhere on the screen. Grass involves no action, box involves pressing the spacebar, and player involves waving hello. However, if the computer sees iron0, 1 or 2, it should take the same action. So while the grass, player, and box shold be independent images, all the iron images should be assigned to the same group so when subimages matching ANY iron profile are found the same keystroke is implemented because we wish to take the same action. So player, box, and grass are in no groups while all the iron images belong to the group "Iron"; this will help our organization when the images are mapped in ImgReduce and used to build stencils in stencilpack builder (Other crunchypack components). 
  
# Development Enviorment Setup:
 This code will compile on any machine running the Java version 8 compiler. We reccomend the latest free Netbeans IDE from Oracle which this project and all its java components are build. For testing, we use the built-in JUnit framework. 
 
# Changes and Contributions:
  Send changes as raw source code with edit line numbers at the top of the file to the project lead; james@leppek.us
