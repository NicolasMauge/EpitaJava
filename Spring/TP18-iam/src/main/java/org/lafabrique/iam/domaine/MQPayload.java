package org.lafabrique.iam.domaine;

public class MQPayload {
    private String blocType;

    private Long clientId;

    public MQPayload(String blocType, Long clientId) {
        this.blocType = blocType;
        clientId = clientId;
    }

    public MQPayload() {
    }

    public String getBlocType() {
        return blocType;
    }

    public void setBlocType(String blocType) {
        this.blocType = blocType;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}
