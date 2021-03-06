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

package eu.europa.ec.markt.tlmanager.view.signature;

import java.awt.*;

import javax.swing.event.ChangeListener;

import org.openide.WizardDescriptor.FinishablePanel;
import org.openide.util.HelpCtx;

import eu.europa.ec.markt.tlmanager.core.signature.SignatureManager;

/**
 * The fourth step of the signature wizard.
 *
 * @version $Revision$ - $Date$
 */

public class SignatureWizardStep4 implements FinishablePanel<Object> {

    private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(SignatureWizardStep4.class);

    private SignatureManager manager;
    private SignatureStep4 panel;

    /**
     * The default constructor for SignatureWizardStep4.
     */
    public SignatureWizardStep4(SignatureManager manager) {
        this.manager = manager;
        panel = new SignatureStep4(this);
    }

    /**
     * @{inheritDoc
     */
    @Override
    public void addChangeListener(ChangeListener arg0) {
    }

    /**
     * @{inheritDoc
     */
    @Override
    public Component getComponent() {
        return panel;
    }

    /**
     * @{inheritDoc
     */
    @Override
    public HelpCtx getHelp() {
        return null;
    }

    /**
     * @{inheritDoc
     */
    @Override
    public boolean isValid() {
        return true;
    }

    /**
     * @{inheritDoc
     */
    @Override
    public void readSettings(Object arg0) {
    }

    /**
     * @{inheritDoc
     */
    @Override
    public void removeChangeListener(ChangeListener arg0) {
    }

    /**
     * @{inheritDoc
     */
    @Override
    public void storeSettings(Object arg0) {
    }

    /**
     * @{inheritDoc
     */
    @Override
    public boolean isFinishPanel() {
        return true;
    }
}