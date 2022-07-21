package io.generalgalactic.capacitor.esp_idf_provisioning.listeners;

import java.util.List;

import io.generalgalactic.capacitor.esp_idf_provisioning.DiscoveredBluetoothDevice;

public interface ScanListener {

    public void foundDevices(List<DiscoveredBluetoothDevice> devices);

    public void errorOccurred(Error error);

    public void blePermissionsIssue();

}
