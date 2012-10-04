package cz.fi.muni.jboss.Migration.Logging;

import org.eclipse.persistence.oxm.annotations.XmlPath;

import javax.xml.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: Roman Jakubco
 * Date: 10/2/12
 * Time: 8:23 PM
 */
@XmlRootElement(name = "size-rotating-file-handler")
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "size-rotating-file-handler")
public class  SizeRotatingFileHandler{
    @XmlAttribute(name = "name")
    private String name;
    //TODO:encoding...
    @XmlPath("level/@name")
    private String level;
    @XmlPath("filter/@value")
    private String filter;
    @XmlPath("formatter/pattern-formatter/@pattern")
    private String formatter;
    @XmlAttribute(name = "autoflush")
    private Boolean autoflush;
    @XmlPath("append/@value")
    private String append;
    @XmlPath("file/@relative-to")
    private String file ;
    @XmlPath("file/@path")
    private String path ;
    @XmlPath("rotate-size/@value")
    private String rotateSize;
    @XmlPath("max-backup-index/@value")
    private Integer maxBackupIndex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public Boolean getAutoflush() {
        return autoflush;
    }

    public void setAutoflush(Boolean autoflush) {
        this.autoflush = autoflush;
    }

    public String getAppend() {
        return append;
    }

    public void setAppend(String append) {
        this.append = append;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRotateSize() {
        return rotateSize;
    }

    public void setRotateSize(String rotateSize) {
        this.rotateSize = rotateSize;
    }

    public Integer getMaxBackupIndex() {
        return maxBackupIndex;
    }

    public void setMaxBackupIndex(Integer maxBackupIndex) {
        this.maxBackupIndex = maxBackupIndex;
    }
}