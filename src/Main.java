void main() {
    // Create files
    File textFile = new File("README.txt", "text", "/home/docs");
    File docFile = new File("Document.doc", "document", "/home/docs");
    File imageFile = new File("Picture.jpg", "image", "/home/images");
    File audioFile = new File("Song.mp3", "audio", "/home/audio");

// Process files
    System.out.println("Processing text file:");
    TextFileHandler.process(textFile);
    System.out.println("Processing document file:");
    TextFileHandler.process(docFile);
    System.out.println("Processing image file:");
    TextFileHandler.process(imageFile);
    System.out.println("Processing audio file:");
    TextFileHandler.process(audioFile);
}
