package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    BookMetadataFormatter bookFormatter;
    {
        try {
            bookFormatter = createFormat();
        } catch (ParserConfigurationException | IOException e) {
            e.printStackTrace();
        }
    }
    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        stream.print(bookFormatter.getMetadataString());
    }

    public abstract BookMetadataFormatter createFormat() throws ParserConfigurationException, IOException;
}
