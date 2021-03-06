package cz.muni.fi.jboss.migration.security;

import javax.xml.bind.annotation.*;

/**
 * Class for marshalling and representing module-option (AS7)
 *
 * @author Roman Jakubco
 * Date: 10/2/12
 * Time: 9:05 PM
 */

@XmlRootElement(name = "module-option")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "module-option")

public class ModuleOptionAS7{

    @XmlAttribute(name = "name")
    private String moduleOptionName;

    @XmlAttribute(name = "value")
    private String moduleOptionValue;

    public String getModuleOptionName() {
        return moduleOptionName;
    }

    public void setModuleOptionName(String moduleOptionName) {
        this.moduleOptionName = moduleOptionName;
    }

    public String getModuleOptionValue() {
        return moduleOptionValue;
    }

    public void setModuleOptionValue(String moduleOptionValue) {
        this.moduleOptionValue = moduleOptionValue;
    }
}