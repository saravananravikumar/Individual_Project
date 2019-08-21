//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.project.blog.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Create {
    @Id
    private String id;
    private Date date = new Date();
    private String name;
    private String title;
    private String summary;
    private String message;

    public Create() {
    }

    public String getId() {
        return this.id;
    }

    public Date getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSummary() {
        return this.summary;
    }

    public String getMessage() {
        return this.message;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setSummary(final String summary) {
        this.summary = summary;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Create)) {
            return false;
        } else {
            Create other = (Create)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$date = this.getDate();
                Object other$date = other.getDate();
                if (this$date == null) {
                    if (other$date != null) {
                        return false;
                    }
                } else if (!this$date.equals(other$date)) {
                    return false;
                }

                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                label62: {
                    Object this$title = this.getTitle();
                    Object other$title = other.getTitle();
                    if (this$title == null) {
                        if (other$title == null) {
                            break label62;
                        }
                    } else if (this$title.equals(other$title)) {
                        break label62;
                    }

                    return false;
                }

                label55: {
                    Object this$summary = this.getSummary();
                    Object other$summary = other.getSummary();
                    if (this$summary == null) {
                        if (other$summary == null) {
                            break label55;
                        }
                    } else if (this$summary.equals(other$summary)) {
                        break label55;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Create;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $date = this.getDate();
        result = result * 59 + ($date == null ? 43 : $date.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        Object $summary = this.getSummary();
        result = result * 59 + ($summary == null ? 43 : $summary.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        return result;
    }

    public String toString() {
        return "Create(id=" + this.getId() + ", date=" + this.getDate() + ", name=" + this.getName() + ", title=" + this.getTitle() + ", summary=" + this.getSummary() + ", message=" + this.getMessage() + ")";
    }
}
