void main() {
        Handler textHandler = new TextFileHandler("Text Handler");
        Handler docHandler = new DocumentFileHandler("Document Handler");
        Handler imageHandler = new ImageFileHandler("Image Handler");

        textHandler.setNextHandler(docHandler);
        docHandler.setNextHandler(imageHandler);

        File textFile = new File("README.txt", "text", "/home/docs");
        File docFile = new File("Document.doc", "document", "/home/docs");
        File imageFile = new File("Picture.jpg", "image", "/home/images");
        File audioFile = new File("Song.mp3", "audio", "/home/audio");

        System.out.println("--- Process text file ---");
        textHandler.process(textFile);

        System.out.println("\n--- Process document file ---");
        textHandler.process(docFile);

        System.out.println("\n--- Process image file ---");
        textHandler.process(imageFile);

        System.out.println("\n--- Process audio file ---");
        textHandler.process(audioFile);
}