const { test } = require("uvu");
const assert = require("uvu/assert");

const ControllerClass = require("../routes/base")

test("Children creation", function () {
    // extend the base controller class
    class ChildClass extends ControllerClass {
        constructor() {
            // call the Parent class' constructor
            super("my child controller");
        }
    }
    // instantiate an object
    const child = new ChildClass();
    assert.ok(child.run);
    // check whether the name of the child object is equal to "my child controller
    assert.equal(child.name, "my child controller")
});

test("Children differentiation", function() {
    class ChildAClass extends ControllerClass {
        constructor() {
            super("child A")
        }
        customProperty = "value";
    }
    class ChildBClass extends ControllerClass {
        constructor() {
            super("Child B")
        }
    }

    // instantiate objects
    const childA = new ChildAClass();
    const childB = new ChildBClass();
    // want to check that the names are not the same
    assert.is.not(childA.name, childB.name);
})

// run all tests
test.run();