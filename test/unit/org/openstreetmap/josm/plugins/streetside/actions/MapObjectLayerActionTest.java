// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.plugins.streetside.actions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.openstreetmap.josm.gui.MainApplication;
import org.openstreetmap.josm.plugins.streetside.utils.TestUtil.StreetsideTestRules;
import org.openstreetmap.josm.testutils.JOSMTestRules;

public class MapObjectLayerActionTest {

  @Rule
  public JOSMTestRules rules = new StreetsideTestRules().platform();

  @Before
  public void resetLayers() {
    MainApplication.getLayerManager().getLayers().parallelStream().forEach(l -> MainApplication.getLayerManager().removeLayer(l));
  }

  @Ignore
  @Test
  public void testAction() {
    assertEquals(0, MainApplication.getLayerManager().getLayers().size());
    new MapObjectLayerAction().actionPerformed(null);
    assertEquals(1, MainApplication.getLayerManager().getLayers().size());
    new MapObjectLayerAction().actionPerformed(null);
    assertEquals(1, MainApplication.getLayerManager().getLayers().size());
  }
}
