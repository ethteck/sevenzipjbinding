package net.sf.sevenzipjbinding.junit.compression;

import net.sf.sevenzipjbinding.ArchiveFormat;

/**
 * Tests compression, update and extraction of a single file using non-generic callback with GZip.
 *
 * @author Boris Brodski
 * @version 9.13-2.00
 */
public class UpdateSingleFileNonGenericGZipTest extends UpdateSingleFileNonGenericAbstractTest {

    @Override
    protected ArchiveFormat getArchiveFormat() {
        return ArchiveFormat.GZIP;
    }

}
