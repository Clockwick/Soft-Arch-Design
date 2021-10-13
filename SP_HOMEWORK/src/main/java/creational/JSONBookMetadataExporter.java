package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    public BookMetadataFormatter createFormat() throws ParserConfigurationException, IOException {
        return new JSONBookMetadataFormatter();
    }
}
