/**
 * za.co.towerman.jkismet.message.PluginMessage
 * Copyright (C) 2012 Edwin Peer
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.towerman.jkismet.message;

import za.co.towerman.jkismet.Capability;

/**
 *
 * @author espeer
 */
public class PluginMessage extends KismetMessage {
    
    public static final String PROTOCOL = "PLUGIN";
    
    private String name;
    private String description;
    private String file;
    private String version;
    private boolean unloadable;
    private boolean root;

    public String getDescription() {
        return description;
    }

    @Capability("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public String getFile() {
        return file;
    }

    @Capability("filename")
    public void setFile(String file) {
        this.file = file;
    }

    public String getName() {
        return name;
    }

    @Capability("name")
    public void setName(String name) {
        this.name = name;
    }

    public boolean isRoot() {
        return root;
    }

    @Capability("root")
    public void setRoot(boolean root) {
        this.root = root;
    }

    public boolean isUnloadable() {
        return unloadable;
    }

    @Capability("unloadable")
    public void setUnloadable(boolean unloadable) {
        this.unloadable = unloadable;
    }

    public String getVersion() {
        return version;
    }

    @Capability("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "PluginMessage{" + "name=" + name + ", description=" + description + ", file=" + file + ", version=" + version + ", unloadable=" + unloadable + ", root=" + root + '}';
    }
    
}
