package org.xdef.impl.util.conv.xd2schemas.xsd.model;

import javax.xml.namespace.QName;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueConstraints {

    private final String name;
    private final String systemId;

    /**
     *
     * key:     variable name
     * value:   variable type
     */
    private Map<String, QName> variables = new HashMap<String, QName>();
    private Set<String> references = new HashSet<String>();
    private Set<String> keys = new HashSet<String>();

    public UniqueConstraints(String name, String systemId) {
        this.name = name;
        this.systemId = systemId;
    }

    public String getName() {
        return name;
    }

    public String getSystemId() {
        return systemId;
    }

    public String getPath() {
        if (systemId != null && !"".equals(systemId)) {
            return systemId + '#' + name;
        }

        return name;
    }

    public Set<String> getReferences() {
        return references;
    }

    public Set<String> getKeys() {
        return keys;
    }

    public boolean addVar(final String name, final QName qName) {
        final QName prev = variables.put(name, qName);
        return prev != null && !prev.equals(qName);
    }

    public void addRef(final String path) {
        references.add(path);
    }

    public void addKey(final String path) {
        keys.add(path);
    }
}
