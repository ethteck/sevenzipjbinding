package net.sf.sevenzipjbinding.junit.compression;

import net.sf.sevenzipjbinding.ArchiveFormat;

/**
 * Tests compression, update and extraction of a single file using generic callback with Tar.
 * 
 * @author Boris Brodski
 * @version 9.13-2.00
 */
public class UpdateSingleFileGenericTarTest extends UpdateSingleFileGenericAbstractTest {

    @Override
    protected ArchiveFormat getArchiveFormat() {
        return ArchiveFormat.TAR;
    }

}
