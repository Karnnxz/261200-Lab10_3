public class TextFileHandler implements Handler {
    private Handler nextHandler;
    private String handlerName;

    public TextFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("text")) {
            System.out.println("Processing: " + file.getFileType() + "/" + file.getFileName() + " by " + handlerName);
        } else if (nextHandler != null) {
            nextHandler.process(file);
        } else {
            System.out.println("File not supported");
        }
    }

    @Override
    public String getName() {
        return handlerName;
    }
}