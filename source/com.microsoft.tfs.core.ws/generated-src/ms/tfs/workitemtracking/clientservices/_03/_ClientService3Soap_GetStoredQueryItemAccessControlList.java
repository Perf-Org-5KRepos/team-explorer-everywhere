// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService3Soap_GetStoredQueryItemAccessControlList;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService3Soap_GetStoredQueryItemAccessControlList
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String queryItemId;
    protected boolean getMetadata;

    public _ClientService3Soap_GetStoredQueryItemAccessControlList()
    {
        super();
    }

    public _ClientService3Soap_GetStoredQueryItemAccessControlList(
        final String queryItemId,
        final boolean getMetadata)
    {
        // TODO : Call super() instead of setting all fields directly?
        setQueryItemId(queryItemId);
        setGetMetadata(getMetadata);
    }

    public String getQueryItemId()
    {
        return this.queryItemId;
    }

    public void setQueryItemId(String value)
    {
        if (value == null)
        {
            throw new IllegalArgumentException("'queryItemId' is a required element, its value cannot be null");
        }

        this.queryItemId = value;
    }

    public boolean isGetMetadata()
    {
        return this.getMetadata;
    }

    public void setGetMetadata(boolean value)
    {
        this.getMetadata = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "queryItemId",
            this.queryItemId);
        XMLStreamWriterHelper.writeElement(
            writer,
            "getMetadata",
            this.getMetadata);

        writer.writeEndElement();
    }
}
