/*
 * #%L
 * Native ARchive plugin for Maven
 * %%
 * Copyright (C) 2002 - 2014 NAR Maven Plugin developers.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.maven_nar.cpptasks;

import org.apache.tools.ant.types.DataType;
import org.apache.tools.ant.types.Reference;

/**
 * Information on the execution platforms for the generated code.
 * (Non-functional prototype)
 *
 */
public final class TargetDef extends DataType {
  /**
   * if property.
   */
  private String ifCond;

  /**
   * unless property.
   */
  private String unlessCond;

  /**
   * cpu.
   *
   */
  private CPUEnum cpu;

  /**
   * architecture.
   *
   */
  private ArchEnum arch;

  /**
   * OS Family.
   *
   */
  private OSFamilyEnum osFamily;

  /**
   * Constructor.
   *
   */
  public TargetDef() {
  }

  /**
   * Bogus method required for documentation generation.
   */
  public void execute() {
    throw new org.apache.tools.ant.BuildException("Not an actual task, but looks like one for documentation purposes");
  }

  /**
   * Gets arch.
   * 
   * @return arch, may be null.
   *
   */
  public ArchEnum getArch() {
    if (isReference()) {
      final TargetDef refPlatform = (TargetDef) getCheckedRef(TargetDef.class, "TargetDef");
      return refPlatform.getArch();
    }
    return this.arch;
  }

  /**
   * Gets cpu.
   * 
   * @return cpu, may be null.
   *
   */
  public CPUEnum getCpu() {
    if (isReference()) {
      final TargetDef refPlatform = (TargetDef) getCheckedRef(TargetDef.class, "TargetDef");
      return refPlatform.getCpu();
    }
    return this.cpu;
  }

  /**
   * Gets operating system family.
   * 
   * @return os family, may be null.
   *
   */
  public OSFamilyEnum getOsfamily() {
    if (isReference()) {
      final TargetDef refPlatform = (TargetDef) getCheckedRef(TargetDef.class, "TargetDef");
      return refPlatform.getOsfamily();
    }
    return this.osFamily;
  }

  /**
   * Returns true if the define's if and unless conditions (if any) are
   * satisfied.
   * 
   * @return true if active
   */
  public boolean isActive() {
    return CUtil.isActive(getProject(), this.ifCond, this.unlessCond);
  }

  /**
   * Sets cpu architecture, compiler may use cpu specific instructions.
   * 
   * @param value
   *          new value
   */
  public void setArch(final ArchEnum value) {
    if (isReference()) {
      throw tooManyAttributes();
    }
    if (this.cpu != null) {
      throw tooManyAttributes();
    }
    this.arch = value;
  }

  /**
   * Sets preferred cpu, but does not use cpu specific instructions.
   * 
   * @param value
   *          new value
   */
  public void setCpu(final CPUEnum value) {
    if (isReference()) {
      throw tooManyAttributes();
    }
    this.cpu = value;
  }

  /**
   * Sets a description of the current data type.
   * 
   * @param desc
   *          description
   */
  @Override
  public void setDescription(final String desc) {
    super.setDescription(desc);
  }

  /**
   * Sets an id that can be used to reference this element.
   *
   * @param id
   *          id
   */
  public void setId(final String id) {
    //
    // this is actually accomplished by a different
    // mechanism, but we can document it
    //
  }

  /**
   * Sets the property name for the 'if' condition.
   *
   * The define will be ignored unless the property is defined.
   *
   * The value of the property is insignificant, but values that would imply
   * misinterpretation ("false", "no") will throw an exception when
   * evaluated.
   *
   * @param propName
   *          property name
   */
  public void setIf(final String propName) {
    this.ifCond = propName;
  }

  /**
   * Sets operating system family.
   * 
   * @param value
   *          new value
   */
  public void setOsfamily(final OSFamilyEnum value) {
    if (isReference()) {
      throw tooManyAttributes();
    }
    if (this.cpu != null) {
      throw tooManyAttributes();
    }
    this.osFamily = value;
  }

  /**
   * Specifies that this element should behave as if the content of the
   * element with the matching id attribute was inserted at this location. If
   * specified, no other attributes should be specified.
   * 
   * @param r
   *          id of referenced target
   */
  @Override
  public void setRefid(final Reference r) {
    super.setRefid(r);
  }

  /**
   * Set the property name for the 'unless' condition.
   *
   * If named property is set, the define will be ignored.
   *
   * The value of the property is insignificant, but values that would imply
   * misinterpretation ("false", "no") of the behavior will throw an
   * exception when evaluated.
   *
   * @param propName
   *          name of property
   */
  public void setUnless(final String propName) {
    this.unlessCond = propName;
  }

}
