public class ImageFileHandler implements Handler {
    private Handler handler;
    private String handlerName;

    public ImageFileHandler(String handlerName) {
        this.handlerName = handlerName;
    }

    @Override
    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void process(File file) {
        if (file.getFileType().equals("Image")) {
            System.out.println("Processing: " + file.getFilePath() + "/" + file.getFileName() + " with " + handlerName);
        } else if (handler != null) {
            System.out.println(handlerName + " forwards request to " + handler.getHandlerName());
            handler.process(file);
        } else {
            System.out.println("No handler found for " + file.getFilePath() + "/" + file.getFileName());
        }
    }

    @Override
    public String getHandlerName() {
        return handlerName;
    }
}
