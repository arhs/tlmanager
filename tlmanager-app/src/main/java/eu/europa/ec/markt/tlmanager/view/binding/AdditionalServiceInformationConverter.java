/*
 * DSS - Digital Signature Services
 *
 * Copyright (C) 2013 European Commission, Directorate-General Internal Market and Services (DG MARKT), B-1049 Bruxelles/Brussel
 *
 * Developed by: 2013 ARHS Developments S.A. (rue Nicolas Bové 2B, L-1253 Luxembourg) http://www.arhs-developments.com
 *
 * This file is part of the "DSS - Digital Signature Services" project.
 *
 * "DSS - Digital Signature Services" is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Lesser General Public License as published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 *
 * DSS is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along with
 * "DSS - Digital Signature Services".  If not, see <http://www.gnu.org/licenses/>.
 */

package eu.europa.ec.markt.tlmanager.view.binding;

import eu.europa.ec.markt.tlmanager.model.AdditionalServiceInformationAdapter;
import eu.europa.ec.markt.tsl.jaxb.tsl.ExtensionType;

import java.util.List;

import org.jdesktop.beansbinding.Converter;

/**
 * Does the conversion between a <code>ExtensionType</code> and a <code>AdditionalServiceInformationAdapter</code>
 * 
 *
 * @version $Revision$ - $Date$
 */

public class AdditionalServiceInformationConverter extends
        Converter<List<ExtensionType>, AdditionalServiceInformationAdapter> {

    /** {@inheritDoc} */
    @Override
    public AdditionalServiceInformationAdapter convertForward(List<ExtensionType> source) {
        return new AdditionalServiceInformationAdapter(source);
    }

    /** {@inheritDoc} */
    @Override
    public List<ExtensionType> convertReverse(AdditionalServiceInformationAdapter target) {
        return target.getExtensionTypes();
    }
}