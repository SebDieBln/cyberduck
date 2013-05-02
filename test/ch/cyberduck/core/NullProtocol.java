package ch.cyberduck.core;

/**
 * @version $Id$
 */
public class NullProtocol extends Protocol {

    @Override
    public String getIdentifier() {
        return "null";
    }

    @Override
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Type getType() {
        return Type.ftp;
    }

    @Override
    public Scheme getScheme() {
        return Scheme.http;
    }
}
