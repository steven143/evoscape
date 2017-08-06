package uk.co.carelesslans.entity;

import uk.co.carelesslabs.Enums.EntityType;
import uk.co.carelesslabs.Media;
import uk.co.carelesslabs.box2d.Box2DHelper;
import uk.co.carelesslabs.box2d.Box2DWorld;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.physics.box2d.BodyDef;

public class Tree extends Entity{
    
    public Tree(Vector3 pos, Box2DWorld box2d){
        super();
        type = EntityType.TREE;
        width = 8;
        height = 8;
        this.pos = pos;
        texture = Media.tree;
        body = Box2DHelper.createBody(box2d.world, width/2, height/2, width/4, 0, pos, BodyDef.BodyType.StaticBody);
    }

}