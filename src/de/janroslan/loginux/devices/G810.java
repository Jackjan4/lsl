/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.janroslan.loginux.devices;

import de.timetoerror.jputils.conf.ConfigurationFile;
import javax.usb.UsbDevice;

/**
 *
 * @author jackjan
 */
public final class G810 extends OrionKeyboard{

    private final static String config = "g810.cfg";
    
    public G810(UsbDevice device, byte[] keyboardProtocol, byte[] logoBaseAddresses) {
        super(config,
                device,
                keyboardProtocol,
                logoBaseAddresses);
    }

    @Override
    public void resetDevice() {
        
    }

    @Override
    public void applyConfig(ConfigurationFile file) {
        
    }
    
}
