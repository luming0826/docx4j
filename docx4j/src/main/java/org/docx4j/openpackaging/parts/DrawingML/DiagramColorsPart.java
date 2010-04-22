/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */

package org.docx4j.openpackaging.parts.DrawingML;


import org.apache.log4j.Logger;
import org.docx4j.dml.diagram.CTColorTransform;
import org.docx4j.dml.diagram.CTDataModel;
import org.docx4j.openpackaging.exceptions.InvalidFormatException;
import org.docx4j.openpackaging.parts.JaxbXmlPart;
import org.docx4j.openpackaging.parts.PartName;
import org.docx4j.openpackaging.parts.relationships.Namespaces;


public final class DiagramColorsPart extends JaxbXmlPart<CTColorTransform> {
	// <xsd:element name="colorsDef" type="CT_ColorTransform">
	
	private static Logger log = Logger.getLogger(DiagramColorsPart.class);			
	
	public DiagramColorsPart(PartName partName) throws InvalidFormatException {
		super(partName);
		init();
		
	}

	public DiagramColorsPart() throws InvalidFormatException {
		super(new PartName("/word/diagrams/colors1.xml")); 
		init();		
	}		
		
		public void init() {
		
		// Used if this Part is added to [Content_Types].xml 
		setContentType(new  org.docx4j.openpackaging.contenttype.ContentType( 
				org.docx4j.openpackaging.contenttype.ContentTypes.DRAWINGML_DIAGRAM_COLORS));

		// Used when this Part is added to a rels 
		setRelationshipType(Namespaces.DRAWINGML_DIAGRAM_COLORS);
	}
		
}
